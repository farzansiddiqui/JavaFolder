package interfacePackage;

public class Tesla implements Car{
    private String carType= "Tesla";

    @Override
    public void turnOnCar() {
     System.out.println("turn on car");
    
    }

    @Override
    public void turnOffCar() {
      System.out.println("turn of car");
    }

    @Override
    public String carType() {
        return this.carType;
    }
    
}
