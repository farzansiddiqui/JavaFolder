public class JavaCon {
    public static void main(String[] args) {
    
        nameChanged(null);
        StringBuffer sBuffer = new StringBuffer("Geeka");
        String vlString = sBuffer.toString();           
        System.out.println(vlString);

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("vlString");
        System.out.println(sBuilder);

    }
    
    public static void nameChanged(String printString){
        System.out.println("this function is executed..");
    }
    public static void nameChanged(Object sObject){
            System.out.println("This object function is executed..");
    }
    
}
