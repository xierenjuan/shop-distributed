package com.test.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MapUtil {
    public static final Logger logger = LoggerFactory.getLogger(MapUtil.class);
    /**
     * 把一个object,包含父类的属性，转成map
     * @param obj 原对象
     * @return map
     */
    public static Map<String, Object> objectToMap(Object obj) {
        Map<String, Object> map = new HashMap<>();
        if (obj == null) {
            return map;
        }
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            Class superclass = clazz.getSuperclass();
            Field[] declaredFields = null;
            if(!superclass.getSimpleName().equals("Object")){
                declaredFields = superclass.getDeclaredFields();
            }
            if(declaredFields != null){
                int lenth1 = fields.length;
                int lenth2 = declaredFields.length;
                fields = Arrays.copyOf(fields, lenth1+ lenth2);
                System.arraycopy(declaredFields, 0, fields, lenth1 , lenth2);
            }

            for (Field field : fields) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(obj) == null ? "" : field.get(obj));
            }
        } catch (Exception e) {
            logger.error("object to map is fail : " + e.getMessage());
        }
        return map;
    }

    /**
     * map 转对象
     * @param map  包含需要转成对象的map
     * @param cls  需要转成的对象clazz
     * @param <T>  真正对象
     * @return
     */
    public static <T> T mapToObject(Map<String, String> map, Class<T> cls) {
        if (map == null) {
            return null;
        }
        T t = null;
        try {
            t = cls.newInstance();

            Field[] fields = t.getClass().getDeclaredFields();
            for (Field field : fields) {
                int mod = field.getModifiers();
                if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                    continue;
                }
                field.setAccessible(true);
                field.set(t, map.get(field.getName()));
            }
        } catch (Exception e) {
            logger.error("map to object is fail : " + e.getMessage());
        }
        return t;
    }

    /**
     * 把map 转成已排序的字符串
     * @param map
     * @return
     */
    public static String mapToSortString(Map<String, Object> map) {
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
            // 把不是null  并且不是"" 的字段加入签名
            if(entry.getValue() != null && entry.getValue() !=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        return result;
    }
}