package org.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturneDiscountedPrice() {
        //utworzenie instancji klasy meal
        //konstruktor kalsy
        Meal meal = new Meal(35);

        //rabat, metoda służąca do zaplikowania rabatu
        int discountedPrice = meal.getDiscountedPrice(7);

        //warotść oczekiwana, wartość aktualna
        assertEquals(28,discountedPrice);

    }
    @Test
    void referencesToTheSameObjectShoudBeEqual() {
        //instancja klasy
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;

        //Expected :org.example.testing.Meal@cb644e
        //Actual   :org.example.testing.Meal@13805618
        //wskazanie na inne obiekty w pamięci
        // meal2 = new Meal(20);


        //czy zmienne które przekzaliśmy jako argumenty wskazują na ten sam obiekt
        assertSame(meal1,meal2);
    }
    @Test
    void referencesToTheDiffretObjectShoudNotBeEqual() {
        //instancja klasy
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(50);


        //czy zmienne które przekzaliśmy jako argumenty wskazują na ten różne obiekt
        assertNotSame(meal1, meal2);
    }

    @Test
    void toMealsShouldBeEqualWhenPriceAndNameAreTheSame() {
        Meal meal1 = new Meal(10, "Chicken");
        Meal meal2 = new Meal(10, "Chicken");

        assertEquals(meal1, meal2);


    }

    @Test
    void toMealsShoulNotdBeEqualWhenPriceAndNameDiffrent() {
        Meal meal1 = new Meal(10, "Chicken");
        Meal meal2 = new Meal(16, "Cake");
        //assercja nie działa, musimy nadpisać metodę equal z klasy java
        assertNotEquals(meal1, meal2);

    }
}