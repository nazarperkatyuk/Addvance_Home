package org.home3;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Shop {

    private int id;
    private String brand;
    private String size;


    public static Shop of(ResultSet resultSet) {
        Shop shop = new Shop();
        try {
            shop.setId(resultSet.getInt("id"));
            shop.setBrand(resultSet.getString("brand"));
            shop.setSize(resultSet.getString("size"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shop;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
