class airplane{

 private int passCap;
  private int speed;//in miles (assumed per hour)
  private int fuelCap;//gallons
  private int burnRate;//rate of gallons used per hour
  private int fuelNeeded;
  private int time;//hours

  public airplane() {
    passCap = 0;
    speed = 0;
    fuelCap = 0;
    burnRate = 0;
  }

  public airplane(int planePassCap, int planeSpeed, int planeFuelCap, int planeBurnRate) {
    passCap = planePassCap;
    speed = planeSpeed;
    fuelCap = planeFuelCap;
    burnRate = planeBurnRate;
  }
  public int planeTime(int length, int planeBurnRate, int fuelCap, int planeSpeed ){
    int temp=planeSpeed*planeBurnRate;
    time = fuelCap/temp;
    return time;
  }

  
  public int planeFuelNeeded(int length, int planeBurnRate, int fuelCap, int planeSpeed ){
    fuelNeeded = (fuelCap-(time*planeBurnRate));
    return fuelNeeded;
  }
  public int numOfPpl(int planePassCap){
    return planePassCap;
  }

  public double costOfPlane(int planePassCap){
    double cost;
    if(planePassCap<100){
      cost = planePassCap*10.15;
    }
      if(planePassCap>150){
        cost = planePassCap*9.56;
      }
    else{
      cost = planePassCap*9.16;
    }
    return cost;
  }

  
}