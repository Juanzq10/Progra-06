package main.middlewares;

import main.Server;

public class LoginPermissionMiddleware extends Middleware {
    private Server server; 

    public LoginPermissionMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasLogInPermission(email)) {
            System.out.println(email + ": This account has no log in permissions, please ask your administrators");
            return false; 
        } 

        return checkNext(email, password);
    }

}
