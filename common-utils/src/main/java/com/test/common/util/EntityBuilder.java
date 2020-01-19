package com.test.common.util;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Entity 构造者
 *
 */
public class EntityBuilder {

	/**
	 * 构造一个默认的实体对象
	 * @param cls
	 * @return
	 */
	public static <T> T build(Class<T> cls) {
		T entity;
		try {
			entity = cls.newInstance();

			Field  idField = cls.getDeclaredField("id");
			idField.setAccessible(true);
			idField.set( entity ,  SnGeneratorUtil.getId()  );
			
			Field  createDateField = cls.getDeclaredField("createDate");
			createDateField.setAccessible(true);
			createDateField.set( entity , new Date()  );
			
			Field  modifyDateField = cls.getDeclaredField("modifyDate");
			modifyDateField.setAccessible(true);
			modifyDateField.set( entity , new Date()  );
			
			Field  isDelField = cls.getDeclaredField("isDel");
			isDelField.setAccessible(true);
			isDelField.set( entity ,false );

			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
