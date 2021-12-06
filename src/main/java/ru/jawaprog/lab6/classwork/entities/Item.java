package ru.jawaprog.lab6.classwork.entities;

import java.io.Serializable;

public class Item implements Serializable {
    private int id;
    private String description;
    private double cost;

    public Item(int id, String description, double cost) {
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
