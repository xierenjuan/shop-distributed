package com.test.maven.goods.test.jdk8;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestSort {
    @Autowired
    private static TestInterface testInterface;
    public static void main(String[] args) {
        List<Human> aInitHumanList = Human.getAInitHumanList();
//        第一种 实现comparetor接口
//        Collections.sort(aInitHumanList,new HumanComparetor());
//        System.out.println(JSONObject.toJSONString(aInitHumanList));

//        第二种，基于第一种，使用匿名内部类实现
//        Collections.sort(aInitHumanList, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o2.getAge() - o1.getAge();
//            }
//        });
//        System.out.println(JSONObject.toJSONString(aInitHumanList));

//       第三种，基于lambda表达式
//        Collections.sort(aInitHumanList, Comparator.comparing(Human::getAge).thenComparing(Human::getName));
//        System.out.println(JSONObject.toJSONString(aInitHumanList));

//      第四种，通过streamAPI
//        aInitHumanList = aInitHumanList.stream().sorted(Comparator.comparing(Human::getAge).thenComparing(Human::getName)).collect(Collectors.toList());
//        System.out.println(JSONObject.toJSONString(aInitHumanList));

//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        ArrayList<Double> doubles = new ArrayList<>();
//        System.out.println(test01(integers));
//        System.out.println(test02(doubles));
        Test<Integer> integerTest = new Test<>(1);
        Test<String> stringTest = new Test<>("String");
        System.out.println(integerTest.getClass() +"==="+ stringTest.getClass());
//        List<Integer> in = new ArrayList<>();
//        tets03(integerTest);
//        test04(Integer.class);
//        Human human = test05(aInitHumanList);
//        System.out.println(human);
//        test04(new Shop());
        test06(new Double(1));
    }

    /**
     *   public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     *   只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     *   <T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     *   与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     * @param t
     * @param <T>
     */
    public static <T> void test04(T t){  // 接收任意类型
        System.out.println("泛型方法1===============" + t);
    }
    public static <T> void test05(List<T> t){
        System.out.println("泛型方法2============");
    }
    //边界值
    public static <T extends Number> void test06(T t){  // 只接收Number及子类类型
        System.out.println("泛型方法3===============");
    }
    public static <T extends Number> void test07(Test<T> t){
        System.out.println("泛型方法4===============");
    }

    public static void test08(List<?> t){
        System.out.println("泛型方法5=================");
    }
    public static void tets09(Test<? extends Number> list){
        System.out.println("泛型方法6");

    }
}


/**
 * 泛型类
 * @param <T>
 */
class Test<T>{

    private  T data;

    public Test(T data) {
        this.data = data;
    }

    public Test() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

/**
 * 泛型接口
 * @param <T>
 */
interface TestInterface<T>{
    void add(T t);
    T getById(String id);
    void update(T t);
}

/**
 *  传入泛型实参时：
 * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口Generator<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * class TestInterfaceImpl<Shop> implements TestInterface<Shop>
 * @param <Shop>
 */
class TestInterfaceImpl<Shop> implements TestInterface<Shop>{

    @Override
    public void add(Shop shop) {
        System.out.println("add===================");
    }

    @Override
    public Shop getById(String id) {
        System.out.println("getById=====================");
        return null;
    }

    @Override
    public void update(Shop shop) {
        System.out.println("update=====================");
    }
}

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * class TestInterfaceImpl2<T> implements TestInterface<T>
 * @param <T>
 */
class TestInterfaceImpl2<T> implements TestInterface<T>{

    @Override
    public void add(T t) {

    }

    @Override
    public T getById(String id) {
        return null;
    }

    @Override
    public void update(T t) {

    }
}