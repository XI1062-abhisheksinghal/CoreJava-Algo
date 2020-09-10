package com.mck.Java8Practice;

public class Student {
	
	private Integer id;
    private String name;
    private Integer age;
    Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    
    //equals and hashcode left out for brevity (not mandatory for the examples to be seen)
    
    @Override
    public String toString() {
        return "[" + id + ", " + name + "]";
    }


}
