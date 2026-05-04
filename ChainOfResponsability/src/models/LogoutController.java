package models;

public class LogoutController extends Controller {

    @Override
    public void control(User user, String message) {
        if(user.getName() != null  && user.getPassword() == null && user.getEmail() == null) {
            System.out.println("Use with name: " + user.getName() + " " + message);
        } else {
            super.getNextController().control(user, message);
        }
    }
}
