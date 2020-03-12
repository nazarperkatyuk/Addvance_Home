package org.home3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopDao {
    public static final String SELECT = "SELECT * FROM shop";
    public static final String INSERT = "insert into shop (brand, size) values(?, ?)";
    private static final String UPDATE = "update shop set brand = ?, size = ? where id = ?";
    private static final String DELETE = "delete from shop where id = ?";

    private Connection connection;


    public ShopDao() {
        this.connection = ConectionUtil.getConnection();
    }

    public List<Shop> get(){
        List<Shop> shop = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while(resultSet.next()){
                shop.add(Shop.of(resultSet));
            }
            return shop;
        } catch (SQLException e) {
            e.printStackTrace();
            new RuntimeException("Can't use data from table");
        }
        return shop;
    }
    public int insert(String brand, String size){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, brand);
            preparedStatement.setString(2, size);
            preparedStatement.executeUpdate();
            ResultSet key = preparedStatement.getGeneratedKeys();
            key.next();
            return key.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
            new RuntimeException("Can't insert data into table");
            return 0;
        }
    }

    public void update(int id, String brand, String size){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, brand);
            preparedStatement.setString(2, size);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            new RuntimeException("Can't update data into table");
        }
    }

    public void delete(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            new RuntimeException("Can't delete data into table");
        }
    }

}