import main.JsonParserVisitor;
import main.components.JsonNumber;
import main.components.JsonObject;
import main.components.JsonString;

public class Main {
    public static void main(String[] args) {
        JsonString jsonString = new JsonString("name", "juan");
        JsonNumber jsonNumber = new JsonNumber("age", 20);
        JsonObject jsonObject = new JsonObject("", jsonNumber, jsonString); 
        
        JsonParserVisitor jsonParserVisitor = new JsonParserVisitor(); 

        jsonObject.accept(jsonParserVisitor);
    }
    
}
