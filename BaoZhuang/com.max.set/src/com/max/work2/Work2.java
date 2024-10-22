package com.max.work2;

import java.util.Date;

public class Work2 {
    private int id;
    private String title;
    private String creator;
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Work2(int id, String title, String creator, Date createDate) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createDate = createDate;
    }
}
