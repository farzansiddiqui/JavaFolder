package leetCode;

public class ThreadClass {
    
    public static void main(String[] args) {
        InnerThreadClass threadImplements = new InnerThreadClass();
        threadImplements.start();
       

    }
    
    
    /**
     * InnerThreadClass
     */
  
}
 class InnerThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
        
    }
