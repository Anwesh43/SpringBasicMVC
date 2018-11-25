package models;

public class Person {
    private String name;
    private int age;
    private int id;

    protected Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static Person newInstance(String name, int age, int id) {
        return new Person(name, age, id);
    }
    public String toString() {
        return String.format("My name is %s, age is %d and id is %d", name, age, id);
    }
}
