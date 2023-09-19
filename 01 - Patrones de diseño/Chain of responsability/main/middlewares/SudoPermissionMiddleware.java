package main.middlewares;

import main.Server;

public class SudoPermissionMiddleware extends Middleware {
    private Server server; 

    public SudoPermissionMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasSudoPermission(email)) {
            System.out.println(email + ": You do not sudo permission to access");
            return false;
        }

        return checkNext(email, password);
    }
    
}
