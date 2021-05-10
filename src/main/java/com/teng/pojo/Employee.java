package com.teng.pojo;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String profession; // 职业

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                '}';
    }
}
