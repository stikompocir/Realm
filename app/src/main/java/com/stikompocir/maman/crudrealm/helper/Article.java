package com.stikompocir.maman.crudrealm.helper;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Maman on 8/29/2016.
 */
public class Article extends RealmObject {
    @PrimaryKey
    private int id;
    private String title;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
