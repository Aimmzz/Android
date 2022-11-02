package com.bsi.ac.id.uasmp1;

public class ItemModel {

    String name , nation;
    int image;

    public ItemModel(String name, String nation, int image) {
        this.name = name;
        this.nation = nation;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public int getImage() {
        return image;
    }

}
