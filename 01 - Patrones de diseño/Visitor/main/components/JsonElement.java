package main.components;

import main.JsonVisitor;

public interface JsonElement {
    void accept(JsonVisitor visitor); 
}
