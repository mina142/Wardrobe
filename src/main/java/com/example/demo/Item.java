package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
//public class Item implements Serializable {
public class Item {


    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Column(unique = true)
    private String name;

    @NotEmpty
    private String color;

    @NotEmpty
    private String material;

    @NotEmpty
    private String category;

    @NotNull
    private String picturePath;

    private String cilmate;

    @NotEmpty
    private String accessory;

    @ManyToOne
    private User user;

//    @ManyToOne
//    private Category category;

   /* @ManyToOne
    private Climate climate;*/

   /* @ManyToOne
    private Occasion occasion;*/


    public Item() {
        picturePath = "";
        user = new User();
        // category = new Category();
        // climate = new Climate();


    }

    public Item(@NotEmpty String name, @NotEmpty String color, @NotEmpty String material,@NotNull String category, @NotEmpty String accessory, @NotNull String picturePath, User user,@NotNull String climate) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.category = category;
        this.picturePath = picturePath;
        this.accessory = accessory;
        this.user = user;
        this.cilmate = climate;
        //this.climate = climate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getCilmate() {
        return cilmate;
    }

    public void setCilmate(String cilmate) {
        this.cilmate = cilmate;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
