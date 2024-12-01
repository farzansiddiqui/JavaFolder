 public class Employee {
    private Notification notification;

    Employee(Notification notification){
        this.notification = notification;
    }

    public void notifytoUser(){
        notification.notifiyCheck();
    }
}
