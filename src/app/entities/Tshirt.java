package app.entities;

import app.producers.Producer;
import app.producers.TshirtProducer;

public abstract class Tshirt implements Item {

    @Override
    public Producer producer() {
        return new TshirtProducer();
    }
    @Override
    public abstract float price();
}