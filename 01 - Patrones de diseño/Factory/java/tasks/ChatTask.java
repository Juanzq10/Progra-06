package tasks;

import main.TaskExecuter;

public class ChatTask implements TaskExecuter {

    @Override
    public String executeTask() {
        return "\nComo modelo de lenguaje automatizado no estoy capacitado para responder esa consulta, de momento puedo hacer:\n" +
            "- Reproduce music\n" + 
            "- Get albums";
    }

}
