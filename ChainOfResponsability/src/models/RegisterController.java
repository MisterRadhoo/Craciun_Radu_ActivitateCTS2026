package models;

public class RegisterController extends Controller {

    @Override
    public void control(User user, String message) {
         if(user.getName() != null && user.getPassword() != null  && user.getEmail()!=null) {
             System.out.println("User with name: " + user.getName() + " " + message);
         } else {
             super.getNextController().control(user, message);
         }
    }
}
