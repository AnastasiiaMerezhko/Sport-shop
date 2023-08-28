package app.entities;

import app.producers.Producer;

public interface Item {

    String name();
    float price();
    Producer producer();
}