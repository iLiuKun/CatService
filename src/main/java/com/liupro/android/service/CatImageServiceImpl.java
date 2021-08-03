package com.liupro.android.service;

import com.liupro.android.mapper.CatImageMapper;
import com.liupro.android.pojo.CatImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatImageServiceImpl implements CatImageService{
    @Autowired
    private CatImageMapper catImageMapper;

    @Override
    public void saveCatImage(CatImage catImage) throws Exception {
        catImageMapper.insert(catImage);
    }

    @Override
    public void updateCatImage(String id,String url) {
        CatImage catImage = queryCatImage(id);
        catImage.setUrl(url);
        catImageMapper.updateByPrimaryKey(catImage);

    }

    @Override
    public void deleteCatImage(String id) {
        catImageMapper.deleteByPrimaryKey(id);
    }


    public CatImage queryCatImage(String id) {
        return catImageMapper.selectByPrimaryKey(id);
    }


}
