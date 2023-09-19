package main.components;

import main.JsonVisitor;

public class JsonString implements JsonElement {
    private String value;
    private String name;  

    public JsonString(String name, String value) {
        this.value = value; 
        this.name = name; 
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
    
    @Override
    public void accept(JsonVisitor visitor) {
        visitor.visit(this);
    }
    
}
