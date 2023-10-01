package main;

import main.middlewares.LoginPermissionMiddleware;
import main.middlewares.Middleware;
import main.middlewares.SudoPermissionMiddleware;
import main.middlewares.UserExistsMiddleware;

public class App {
    public static void main(String[] args) {
        Server server = new Server(); 

        Middleware middleware = Middleware.link(
            new UserExistsMiddleware(server),
            new LoginPermissionMiddleware(server),
            new SudoPermissionMiddleware(server)
        );

        server.setMiddleware(middleware);

        server.register("register@gmail.com", "123");
        server.register("logIn@gmail.com", "123");
        server.register("sudo@gmail.com", "123");

        server.addLoginPermission("logIn@gmail.com", true);
        server.addLoginPermission("sudo@gmail.com", true);

        server.addSudoPermission("sudo@gmail.com", true);

        server.logInToAdminConsole("register@gmail.com", "123");
        server.logInToAdminConsole("logIn@gmail.com", "123");
        server.logInToAdminConsole("sudo@gmail.com", "123");

    }

}
