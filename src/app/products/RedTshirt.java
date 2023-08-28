package app.products;

import app.entities.Tshirt;

public class RedTshirt extends Tshirt {

    @Override
    public float price() {
        return 45.50f;
    }

    @Override
    public String name() {
        return "Red t-shirt";
    }
}