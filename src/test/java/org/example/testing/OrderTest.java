package org.example.testing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    void testAssertArrayEquals (){
        int [] ints1 = {1,2,3};
        int [] ints2 = {1,2,3};

        assertArrayEquals(ints1,ints2);


    }

    @Test
    void mealListShouldBeEmptyAfterCreationOfOrder(){
        Order order = new Order();

        assertThat(order.getMeals(), empty());
        assertThat(order.getMeals().size(), equalTo(0));
        assertThat(order.getMeals(), hasSize(0));
        assertThat(order.getMeals(), emptyCollectionOf(Meal.class));

    }

    @Test
    void addingMealTooOrderShouldIncreasesOrderSize(){
        Meal meal = new Meal(14, "Burger");
        Meal meal1 = new Meal(10, "Pizza");
        Order order = new Order();
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);

        assertThat(order.getMeals(), hasSize(2));
        assertThat(order.getMeals(), contains(meal, meal1));
        assertThat(order.getMeals(), hasItem(meal));
        assertThat(order.getMeals(), hasItem(meal1));
        assertThat(order.getMeals().get(0).getPrice(),equalTo(14));
        assertThat(order.getMeals().get(1).getPrice(),equalTo(10));


    }

    @Test
    void removingMealFromOrderShouldDecreasesOrderSize(){
        Meal meal = new Meal(14, "Burger");
        Meal meal1 = new Meal(10, "Pizza");
        Order order = new Order();
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);

        order.removeMealFromOrder(meal);
        order.removeMealFromOrder(meal1);
        assertThat(order.getMeals(), hasSize(0));
        assertThat(order.getMeals(), empty());
        assertThat(order.getMeals().size(), equalTo(0));
        assertThat(order.getMeals(), hasSize(0));
        assertThat(order.getMeals(), emptyCollectionOf(Meal.class));
        assertThat(order.getMeals(), not(contains(meal)));
        assertThat(order.getMeals(), not(contains(meal1)));

    }

    @Test
    void mealsShouldBeInCorrectOrderAfterAddingThemToOrder(){
        Meal meal1 = new Meal(14, "Burger");
        Meal meal2 = new Meal(10, "Pizza");

        Order order = new Order();
        order.addMealToOrder(meal1);
        order.addMealToOrder(meal2);

        assertThat(order.getMeals(), contains(meal1, meal2));
        assertThat(order.getMeals(), containsInAnyOrder(meal2, meal1));

    }

    //testowanie kolekcji
    @Test
    void testIfTwoMealListsAreTheSame(){
        Meal meal1 = new Meal(14, "Burger");
        Meal meal2 = new Meal(10, "Pizza");
        Meal meal3 = new Meal(11, "Kebab");

        //inicjalizacja listy
        List<Meal> meals1 = Arrays.asList(meal1,meal2);
        List<Meal> meals2 = Arrays.asList(meal1,meal2);
        //List<Meal> meals2 = Arrays.asList(meal1,meal2, meal3);

        //czy kolekcje sa takie same
        assertThat(meals1, is(meals2));

        //czy listy nie sa takie same
        //assertThat(meals1, not(is(meals2)));

    }

}
