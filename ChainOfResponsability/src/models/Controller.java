package models;

public abstract class Controller {

    private Controller nextController;

     public Controller getNextController() {
         return nextController;
    }

     public void setNextController(Controller controller) {
         this.nextController = controller;
    }

     public abstract void control(User user, String message);

}
