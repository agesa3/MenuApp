package com.example.menuapp.model;

public class DataItem {
    private String itemId;
    private String itemName;
    private String description;
    private int sortPosition;
    private double price;
    private String image;

    public DataItem() {

    }

    public DataItem(String itemId, String itemName, String description, String s, int sortPosition, int price, String image) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.sortPosition = sortPosition;
        this.price = price;
        this.image = image;
    }



    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(int sortPosition) {
        this.sortPosition = sortPosition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", sortPosition=" + sortPosition +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
