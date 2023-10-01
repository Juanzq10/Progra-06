package main;

import main.components.JsonNumber;
import main.components.JsonObject;
import main.components.JsonString;

public interface JsonVisitor {
    void visit(JsonNumber jsonArray);

    void visit(JsonString jsonString);

    void visit(JsonObject jsonObject); 
}
