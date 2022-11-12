package cars;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Driver {


    public static void main(String [] args){
        boolean stopDriving=false;

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please define the car's model \n");
            String model =  reader.readLine();

            System.out.println("Please define the car's year \n");
            int year =  Integer.parseInt(reader.readLine());

            System.out.println("Please define the top speed \n");
            int topSpeed =  Integer.parseInt(reader.readLine());

            Ferrari ferrariCar = new Ferrari(model,year,topSpeed);

            System.out.println("1 Print car settings  \n");

            do{
                System.out.println("Perform the following action  \n");
                System.out.println("1 Print car specifications  \n");
                System.out.println("2 Turn left  \n");
                System.out.println("3 Turn right  \n");
                System.out.println("4  Turn the wiper blades on  \n");
                System.out.println("5  Turn the wiper blades off  \n");
                System.out.println("6  Change vehicle's speed  \n");
                int optionSelected = Integer.parseInt(reader.readLine());

                switch(optionSelected){
                    case 1:
                            ferrariCar.displayCarSpecifications();
                        break;
                        case 2:
                            ferrariCar.makeTurns("Left");
                            break;
                         case 3:
                        ferrariCar.makeTurns("Right");
                        break;
                    case 4:
                        ferrariCar.turnBladesOnOff("On");
                        break;
                    case 5:
                        ferrariCar.turnBladesOnOff("Off");
                        break;
                    case 6:
                        System.out.println("Please set the speed  \n");
                        int speed = Integer.parseInt(reader.readLine());
                        ferrariCar.changeVehicleSpeed(speed);
                        break;
                    case 0:
                        System.out.println("Stop driving  \n");
                        stopDriving = true;
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            }while(!stopDriving);



        }catch(Exception e){
            System.out.println("Please send  a valid parameter  \n");
        }
    }
}
