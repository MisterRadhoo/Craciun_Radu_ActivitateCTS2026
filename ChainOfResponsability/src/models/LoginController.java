package models;

public class LoginController extends Controller {

    @Override
    public void control(User user, String message) {
        if(user.getEmail() != null  && user.getPassword() != null) {
            System.out.println("User with email: " + user.getEmail() + " " + message );
        } else {
             super.getNextController().control(user, message);
        }
    }
}
