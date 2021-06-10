package com.assignment.parts.entity;

import javax.persistence.*;

//Employee Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "parts") //This is for the actual name of the database table we are mapping to the class.
public class Parts {

    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "id") //This is mapping the primary key to the id column in the table.
    private int id;

    @Column(name = "parts_name") //This will map the jobTitle field to the column named job_title in the table.
    private String partsName;

    @Column(name = "length") //This will map the firstName field to the column named first_name in the table.
    private int length;

    @Column(name = "width") //This will map the lastName field to the column named last_name in the table.
    private int width;

    @Column(name = "price") //This will map the email field to the column named email in the table.
    private int price;

    //default constructor
    public Parts() {
    }

    //para constructor
    public Parts(int length, int width, int price) {
        this.length = length;
        this.width = width;
        this.price = price;
    }

    //getter/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartsName() {
        return partsName;
    }

    public void getPartsName(String partsName) {
        this.partsName = partsName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Parts{" +
                "id=" + id +
                ", partsName='" + partsName + '\'' +
                ", length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
