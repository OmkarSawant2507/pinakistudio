package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.PinakiModel;

@Repository 
public class PinakiDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String insertSql = "INSERT INTO PinakiModel (name, email, message) VALUES (?, ?, ?)";

    public int saveRFIForm(PinakiModel pinakiModel) {
        return jdbcTemplate.update(insertSql,
                pinakiModel.getName(),
                pinakiModel.getEmail(),
                pinakiModel.getMessage()
        );
    }
}