package cars;

public class Ferrari extends Car{
    private final int TOP_SPEED_MPH;
    private int currentSpeed;
    private boolean wiperBladeStatus=false;

    public Ferrari(String model,int year,int TOP_SPEED_MPH) {
        make = "Ferrari";
        this.model = model;
        this.year = year;
        this.TOP_SPEED_MPH = TOP_SPEED_MPH;
        currentSpeed=20;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    public int getTopSpeedMph(){
        return this.TOP_SPEED_MPH;
    }

    public int getCurrentSpeed(){
        return this.currentSpeed;
    }

    public void turnBladesOnOff(boolean newWiperBladeStatus){

        wiperBladeStatus = newWiperBladeStatus;

        if(wiperBladeStatus){
            System.out.println("Wiper Blade Status is on");
        }else{
            System.out.println("Wiper Blade Status is off");
        }
    }

    public void turnBladesOnOff(String newWiperBladeStatus){
        switch(newWiperBladeStatus.toLowerCase()){
            case  "on":
                if(this.wiperBladeStatus!=true){
                    this.wiperBladeStatus = true;
                    System.out.println("Wiper Blade Status is on");
                }else{
                    System.out.println("Wiper Blade Status is already on");
                }

                break;
            case "off":
                if(this.wiperBladeStatus!=false){
                    this.wiperBladeStatus = false;
                    System.out.println("Wiper Blade Status is off");
                }else{
                    System.out.println("Wiper Blade Status is already off");
                }
                break;
        }
    }

    public void changeVehicleSpeed(int newSpeed){
        if(this.TOP_SPEED_MPH>=newSpeed){
            this.currentSpeed = newSpeed;
        }else{
            System.out.println("Car max speed is:"+this.TOP_SPEED_MPH);
        }
    }



    public void makeTurns(String direction){
        switch(direction.toLowerCase()){
            case "right":
                System.out.println("Turning right \n");
             break;
            case "left":
                System.out.println("Turning left \n");
                break;
        }
    }

    public void displayCarSpecifications(){
        System.out.println("Car Specifications: \n");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", TOP_SPEED_MPH=" + TOP_SPEED_MPH +
                ", currentSpeed=" + currentSpeed + '}';
    }



}
