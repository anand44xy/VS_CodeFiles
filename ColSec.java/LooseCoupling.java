interface NotificationService {
    void sendNotification(String message);
}

class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message){
        System.out.println("Sending email notification: " + message);
    }

}

class UserService{
    private NotificationService notificationService;
    
    //Constructor injection 
    UserService(NotificationService notificationService){
        this.notificationService=notificationService;
    }


    public void doSomething(){
        //Use the notification service
        notificationService.sendNotification("Hello, user!");
    }
}


public class LooseCoupling {

    public static void main(String[] args) {
       NotificationService notificationService=new EmailNotificationService();
       UserService userService=new UserService(notificationService);

       userService.doSomething();
    }
}


/*
 * In this example, the UserService class depends on the NotificationService interface rather than a concrete implementation. 
 * By injecting the NotificationService instance through the constructor, we achieve loose coupling.
 * If you decide to introduce a different implementation of NotificationService, such as a SMSNotificationService,
 * you can easily swap it out without modifying the UserService class. This flexibility allows for easier maintenance, 
 * testing, and future changes in the system.


 */