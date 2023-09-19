package main;

import java.util.HashMap;
import java.util.Map;

import main.middlewares.Middleware;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Map<String, Boolean> logInPermission = new HashMap<>(); 
    private Map<String, Boolean> sudoPermission = new HashMap<>(); 
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logInToAdminConsole(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Welcome " + email);
            return true;
        }

        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public void addLoginPermission(String email, boolean hasPermission) {
        addPermission(email, hasPermission, logInPermission);
    }

    public void addSudoPermission(String email, boolean hasPermission) {
        addPermission(email, hasPermission, sudoPermission);
    }

    private void addPermission(String email, boolean hasPermission, Map<String, Boolean> permissions) {
        if (this.users.containsKey(email)) {
            permissions.put(email, hasPermission); 
        }
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean hasLogInPermission(String email) {
        return logInPermission.containsKey(email); 
    }

    public boolean hasSudoPermission(String email) {
        return sudoPermission.containsKey(email); 
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }

}
