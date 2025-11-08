import Loose_Cupling.EmailNotificationService;
import Loose_Cupling.NotificationService;
import Tight_Couplin.UserService;

public class Main {

    public static void main(String [] args){

        /// Tight Cupling
        UserService userService =new UserService();
        userService.notifyUser("Order place!");

        /// Loose Cupling

        NotificationService emailService= new EmailNotificationService();
        Loose_Cupling.UserService userServiceLoose= new Loose_Cupling.UserService(emailService);
         userServiceLoose.notifyUser("Order processed");


    }

}
