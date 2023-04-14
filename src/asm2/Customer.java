/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author ADMIN
 */
public class Customer extends Person {
    private int id;
    private int phone;

     public Customer(int person_id, String name, String email, int age, int phone) {
        super(person_id, name, email, age);
        this.phone = phone;
    }
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
public String toString() {
    return "Customer [id=" + id + ", name=" + getName() + ", email=" + getEmail() + ", age=" + getAge() + ", phone=" + phone + "]";
}

    
}