package com.liupro.android.service;


import com.liupro.android.pojo.CatImage;

public interface CatImageService {
    public void saveCatImage(CatImage catImage) throws Exception;
    public void updateCatImage(String id,String url);
    public void deleteCatImage(String id);

}
