 import java.util.Scanner;  


class Main {
  public static void main(String[] args) {

     Scanner myObj4 = new Scanner(System.in); 
    System.out.println("What is the name of the plane?");
    String name = myObj4.nextLine();  

     Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter the passenger cappacity");
    int passCap = myObj.nextInt();  


    Scanner myObj1 = new Scanner(System.in); 
    System.out.println("Enter the plane speed, miles per hour");
    int planeSpeed = myObj1.nextInt();  

    Scanner myObj2 = new Scanner(System.in); 
    System.out.println("Enter the fuel cappacity in gallons");
    int fuelCap = myObj2.nextInt();  

    Scanner myObj3 = new Scanner(System.in); 
    System.out.println("Enter the burn rate for gallons per mile");

    int burnRate = myObj3.nextInt();  
    
    airplane a = new airplane(passCap,planeSpeed,fuelCap,burnRate);

    System.out.println("Here is your information \n Airplane name: "+name+"\n Passenger Cappacity: "+passCap+" \n Speed of airpane: "+planeSpeed+"\n Fuel Cappacity: "+fuelCap+" \n Burn rate: "+burnRate);

    int time = a.planeTime(passCap,planeSpeed,fuelCap,burnRate);
    System.out.println(name+" has an endurance of this many hours: "+time+" for "+passCap+" people");

    int fuel = a.planeFuelNeeded(passCap,planeSpeed,fuelCap,burnRate);
    System.out.println(name+" needs this many gallons of fuel: "+fuel+" for "+passCap+" people");

    int divNum= a.numOfPpl(passCap);
    int numOfBags = divNum*2;

    double cost = a.costOfPlane(passCap);
    System.out.println(name+" is going to charge $"+cost+" per person "+passCap+" people because of "+numOfBags+" bags in the plane");
    
  }
}
