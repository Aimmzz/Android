package com.bsi.ac.id.projekuas;

public class ItemModel {
    String name;
    String type;
    int image;


    public ItemModel(String name, String type, int image) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
