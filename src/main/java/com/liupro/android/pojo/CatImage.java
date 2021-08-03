package com.liupro.android.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cat_images")
public class CatImage {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "url")
    private String url;

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}
