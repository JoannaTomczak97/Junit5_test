package org.example.testing;

public class Account {
    //pole klasy
    private boolean active;

    //konstruktor klasy
    public Account() {
        this.active = false;
    }

    //metoda do zmiany wartości pola avitve
    public void  activate () {
        this.active = true;
    }
    //getter dla tej wartości
    public boolean isActive() {
        return active;
    }
}
