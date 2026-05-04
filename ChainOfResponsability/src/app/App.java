package app;

import models.*;

public class App {

    static void main(String[] args) {
        Controller registerController = new RegisterController();
        Controller loginController = new LoginController();
        Controller logoutController = new LogoutController();

        // chain of responsability
        registerController.setNextController(loginController);
        //loginController.setNextController(logoutController);

        User user = new User(null, "12345", "radu@emailfaker.com");

        loginController.control(user, "has been logged in into account!");
        //logoutController.control(user, "has been logged out from account!");

    }
}
