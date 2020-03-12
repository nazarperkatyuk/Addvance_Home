package org.home3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopDao shopDao = new ShopDao();
        shopDao.insert("adidas", null);
        shopDao.insert("nike", null);
        shopDao.update(3, "puma", null);
        shopDao.delete(1);
        List<Shop> shop = shopDao.get();
        System.out.println(shop);
    }
}