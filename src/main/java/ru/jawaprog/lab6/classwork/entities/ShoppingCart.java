package ru.jawaprog.lab6.classwork.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart implements Serializable {
    private int cartID;
    private final ArrayList<Item> items = new ArrayList<>();
    private int itemCount;
    private transient double cartTotal;


    public void recalculacte() {
        itemCount = items.size();
        cartTotal = 0;
        items.forEach(i -> cartTotal += i.getCost());
    }


    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
        recalculacte();
    }

    public void removeItem(int itemId) {
        items.removeIf(i -> i.getId() == itemId);
        recalculacte();
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartID=" + cartID +
                ", items=" + items +
                ", itemCount=" + itemCount +
                ", cartTotal=" + cartTotal +
                '}';
    }
}
