package main.components;

import main.JsonVisitor;

public class JsonObject implements JsonElement {
    private String name; 
    private JsonElement[] elements; 

    public JsonObject(String name, JsonElement... elements) {
        this.name = name; 
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public JsonElement[] getElements() {
        return elements;
    }

    @Override
    public void accept(JsonVisitor visitor) {
        visitor.visit(this);
    }
    
    
}
