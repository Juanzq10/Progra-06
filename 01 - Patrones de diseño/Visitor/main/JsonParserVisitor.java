package main;

import main.components.JsonElement;
import main.components.JsonNumber;
import main.components.JsonObject;
import main.components.JsonString;

public class JsonParserVisitor implements JsonVisitor {

    @Override
    public void visit(JsonNumber jsonNumber) {
        System.out.println(jsonNumber.getName() + ": " + jsonNumber.getValue() + ";");
    }

    @Override
    public void visit(JsonString jsonString) {
        System.out.println(jsonString.getName() + ": " + "\"" + jsonString.getValue() + "\";");
    }

    @Override
    public void visit(JsonObject jsonObject) {
        String name = jsonObject.getName(); 
        if (!name.isEmpty() || !name.isBlank()) {
            System.out.print(name + ": ");
        }

        System.out.println("{");

        for (JsonElement element : jsonObject.getElements()) {
            System.out.print("    ");
            element.accept(this);
        }

        System.out.println("}");
    }

}
