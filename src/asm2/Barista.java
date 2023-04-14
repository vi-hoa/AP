/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author ADMIN
 */
public class Barista extends Person {
    private int barista_id;
    private float salary;

    public Barista(int person_id, String name, String email, int age, float salary) {
    super(person_id, name, email, age);
    this.salary = salary;
}

    // getters and setters

    public int getBarista_id() {
        return barista_id;
    }

    public void setBarista_id(int barista_id) {
        this.barista_id = barista_id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
public String toString() {
    return "Barista [id=" + getPerson_id() + ", name=" + getName() + ", email=" + getEmail() + ", age=" + getAge() + ", salary=" + salary + "]";
}
}
