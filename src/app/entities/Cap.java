package app.entities;

import app.producers.CapProducer;
import app.producers.Producer;

public abstract class Cap implements Item {

    @Override
    public Producer producer() {
        return new CapProducer();
    }
    @Override
    public abstract float price();
}