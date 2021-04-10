package com.techelevator.dao;


import com.techelevator.model.Size;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
public class JDBCSizeDAO implements SizeDAO {
    private final JdbcTemplate jdbcTemplate;
    public JDBCSizeDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List <Size> getAvailableSizes() {
        String sqlToGetAvailableSizes = "SELECT * FROM sizes WHERE is_available = TRUE;";
        List<Size> availableSizes = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sqlToGetAvailableSizes);
        while (result.next()){
            Size size = mapRowToSize(result);
            availableSizes.add(size);
        }
        return availableSizes;
    }

    @Override
    public List<Size> getAllSizes() {
        String sqlToGetAllSizes = "SELECT * FROM sizes;";
        List<Size> allSizes = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sqlToGetAllSizes);
        while (result.next()){
            Size size = mapRowToSize(result);
            allSizes.add(size);
        }
        return allSizes;
    }

    @Override
    public int createSize(String SizeName, String sizeDescription, BigDecimal priceMod) {
        return 0;
    }

    @Override
    public Size updateSize(Size size, int sizeID) {
        return null;
    }

    @Override
    public String deleteSize(int ID) {
        return null;
    }

    public Size mapRowToSize(SqlRowSet result){
        Size size = new Size();
        size.setSizeID(result.getInt("size_id"));
        size.setSizeName(result.getString("size_name"));
        size.setSizeDescription(result.getString("size_description"));
        size.setAvailable(result.getBoolean("is_available"));
        size.setPriceMod(result.getBigDecimal("price_mod"));
        return size;
    }
}
