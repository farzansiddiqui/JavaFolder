public class StaticClass extends Animal{
    static int count = 0;

    StaticClass() {
        count++;
        System.out.println(count);
    }
    @Override
    void run() {
       System.out.println("printValue");
    }
  
    public static void main(String[] args) {
        int n = 2;
        boolean isPrime = true;
        Animal animal = new StaticClass();
        animal.run();
        for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
        
    }
    

}

class Animal {
    void run(){
        System.out.println("call Animal");
    }
}
