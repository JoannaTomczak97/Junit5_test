package org.example.testing;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<Meal> getMeals() {
        return meals;
    }

    //dodawanie elementów
    public  void addMealToOrder(Meal meal) {
        this.meals.add(meal);

    }

    //usówanie elementów
    public void removeMealFromOrder(Meal meal) {
        this.meals.remove(meal);
    }


    //lista posiłków z inicjalizacją
    private List <Meal> meals = new ArrayList<>();

}
