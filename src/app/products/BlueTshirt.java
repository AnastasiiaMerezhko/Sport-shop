package app.products;

import app.entities.Tshirt;

public class BlueTshirt extends Tshirt {

    @Override
    public float price() {
        return 35.40f;
    }

    @Override
    public String name() {
        return "Blue t-shirt";
    }
}