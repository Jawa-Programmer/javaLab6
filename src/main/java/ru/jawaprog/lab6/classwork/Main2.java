package ru.jawaprog.lab6.classwork;

import ru.jawaprog.lab6.classwork.entities.Item;
import ru.jawaprog.lab6.classwork.entities.ShoppingCart;

import java.io.*;
import java.util.Date;

public class Main2 {
    public static void main(String... args) throws IOException, ClassNotFoundException {
        ShoppingCart cart = new ShoppingCart();
        cart.setCartID(1);
        cart.addItem(new Item(1, "Трусы", 100));
        cart.addItem(new Item(2, "Носки", 60));
        cart.addItem(new Item(3, "Футболка", 230));

        FileOutputStream fileOutputStream = new FileOutputStream("cart.mymag");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Date());
        objectOutputStream.writeObject(cart);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cart.mymag");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Date saveDate = (Date) objectInputStream.readObject();
        ShoppingCart deserialized = (ShoppingCart) objectInputStream.readObject();
        deserialized.recalculacte();

        objectInputStream.close();

        System.out.println("Корзина была сериализована " + saveDate + "\nДесериализованная корзина:");
        System.out.println(deserialized);
    }
}
