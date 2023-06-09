/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author ADMIN
 */
public class Person {
    private int person_id;
    private String name;
    private String email;
    private int age;

    
    public Person(int person_id, String name, String email, int age) {
        this.person_id = person_id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    // getters and setters

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + '}';
    }
    
}




