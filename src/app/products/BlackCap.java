package app.products;

import app.entities.Cap;

public class BlackCap extends Cap {

    @Override
    public float price() {
        return 25.99f;
    }

    @Override
    public String name() {
        return "Black cap";
    }
}