package Polymorphism;
public class Animal {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.run();
    }
}
class Dog {
    public void run(){
        System.out.println("Dog is runing");
    }
}

class Cat extends Dog {
    @Override
    public void run(){
        System.out.println("Cat is runing");
    }
    class Calculator {
        int add(int a, int b){
            return a + b;
        }
        double add(double a, double b){
            return a + b;
        }
    }

}

