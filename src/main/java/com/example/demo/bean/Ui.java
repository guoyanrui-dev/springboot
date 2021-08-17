package com.example.demo.bean;

/**
 * @author guoyanrui on 2021/8/16
 */
public class Ui {
    private int id;
    private String pic;
    private String content;

    public Ui() {
    }

    public Ui(int id, String pic, String content) {
        this.id = id;
        this.pic = pic;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Ui{" +
                "id=" + id +
                ", pic='" + pic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
