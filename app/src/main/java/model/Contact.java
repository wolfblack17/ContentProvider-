package model;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String Phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Tên: "+name+"\nPhone: "+this.Phone;
    }

    public Contact(String name, String phone) {
        this.name = name;
        Phone = phone;
    }
}
