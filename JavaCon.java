public class JavaCon {
    public static void main(String[] args) {
    
        nameChanged(null);
       
    
    }
    
    public static void nameChanged(String printString){
        System.out.println("this function is executed..");
    }
    public static void nameChanged(Object sObject){
            System.out.println("This object function is executed..");
    }
    
}
