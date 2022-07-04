package org.example.testing;

public class Meal {
    public Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
     public int getDiscountedPrice(int discount) {
        return  this.price-discount;
     }

    public Meal(int price, String name) {
        this.price = price;
        this.name = name;
    }

    //Nadpisanie metody equals oraz hash code


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meal meal = (Meal) o;

        if (price != meal.price) return false;
        return name != null ? name.equals(meal.name) : meal.name == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    private int price;
    private String name;

}
