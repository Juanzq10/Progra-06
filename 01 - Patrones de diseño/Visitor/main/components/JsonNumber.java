package main.components;

import main.JsonVisitor;

public class JsonNumber implements JsonElement {
    private int value; 
    private String name; 

    public JsonNumber(String name, int value) {
        this.value = value; 
        this.name = name; 
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(JsonVisitor visitor) {
        visitor.visit(this);
    }

}
