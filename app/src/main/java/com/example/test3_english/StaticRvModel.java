package com.example.test3_english;

public class StaticRvModel {
    private int image, pos;
    private String text;

    public StaticRvModel(int image, String text, int pos) {
        this.image = image;
        this.text = text;
        this.pos = pos;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public int getPos(){
        return  pos;
    }
}
