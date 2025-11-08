package Tight_Couplin;

public class UserService {
    NotificationService notificationService = new NotificationService() ;
        public void notifyUser(String message){
         notificationService.send("Notification hello");
        }



}
