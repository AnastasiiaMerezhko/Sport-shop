package app.products;

import app.entities.Cap;

public class WhiteCap extends Cap {

    @Override
    public float price() {
        return 21.99f;
    }

    @Override
    public String name() {
        return "White cap";
    }
}