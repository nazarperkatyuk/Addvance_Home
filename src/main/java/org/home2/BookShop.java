package org.home2;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class BookShop {


    private static Logger LOG = Logger.getLogger(BookShop.class);

    public static void base(String[] args) {
        Book book = new Book("Робін Гуд", 200);
        Client client = new Client("Коля", 18, 500);
        addClient("Вася", 25, 1000);
        addBook("Гоголь", 500);
        buyBook(book, client);
    }

    private static void buyBook(Book book, Client client) {
        if (client.getNumberOfMoney() < book.getPrice()) {
            LOG.error("Клієнт хоче купити книжку але йоу не вистачає грошей");
        }
    }

    private static void addBook(String Гоголь, int i) {
            LOG.info("Добавити нову книжку");
        }

    private static void addClient(String Вася, int i, int i1) {
        LOG.trace("message from trace");
        LOG.error("Клієнт не має пасторта ");


    }
}