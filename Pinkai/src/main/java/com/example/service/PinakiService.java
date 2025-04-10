package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PinakiDao;
import com.example.model.PinakiModel;

@Service 
public class PinakiService {
	
    @Autowired
    private PinakiDao pinakiDao; 

    public int saveRFIForm(PinakiModel rfiForm) {
        return pinakiDao.saveRFIForm(rfiForm);
    }
}