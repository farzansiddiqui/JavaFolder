
public class AutoMatic implements Car {
    private String carType = "Automatic";

    @Override
    public void turnOnCar() {
    System.out.println("turn on car");
       
    }

    @Override
    public void turnOffCar() {
    System.out.println("turn off Car");
    }

    @Override
    public String carType() {
        return this.carType;
    }
    
}
