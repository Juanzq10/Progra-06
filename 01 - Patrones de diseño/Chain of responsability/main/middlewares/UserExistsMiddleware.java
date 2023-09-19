package main.middlewares;

import main.Server;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println(email + ": This email is not registered");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong Password");
            return false;
        }

        return checkNext(email, password);
    }

}
