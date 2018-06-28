package de.dhbwka.java.exercise.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FooBar {

    private StringProperty foo;
    private StringProperty bar;

    public FooBar(String foo, String bar) {
        this.foo = new SimpleStringProperty(foo);
        this.bar = new SimpleStringProperty(bar);
    }

    public StringProperty fooProperty() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo.set(foo);
    }

    public StringProperty barProperty() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar.set(bar);
    }

}
