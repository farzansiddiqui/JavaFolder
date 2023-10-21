
public class JavaInterface {
    public static void main(String[] args) {
       Dog dog = new Dog("Siddiqui", "Farzan", 85755, 34);
       dog.printPerson();
       dog.printInt();

    }
}
class Animal {
     protected String firstName;
    protected String lastName;
    protected int idNumber;

    Animal(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public void printPerson(){
         System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
    }
}
 class Dog extends Animal {
    int nID ;
    Dog(String firstName ,String lastName, int idNumber, int nID) {
        super(firstName, lastName, idNumber);
    }
    public int println(){
        return nID;
    }
    public void printInt(){
        System.out.println(println());
    }

   
}
