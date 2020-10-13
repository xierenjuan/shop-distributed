package com.test.maven.goods;

public class PersonT {

    private final String name;
    private final int age;
    private final String score;

    private PersonT(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.score = builder.score;
    }

    public static PersonT.PersonBuilder build() {
        return new PersonT.PersonBuilder();
    }

    @Override
    public String toString() {
        return "PersonT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score='" + score + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String name;
        private int age;
        private String score;

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder score(String score){
            this.score = score;
            return this;
        }

        public PersonT builder(){
            return new PersonT(this);
        }


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getScore() {
        return score;
    }
}
