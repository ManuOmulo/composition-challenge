public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;


  public SmartKitchen() {
    brewMaster = new CoffeeMaker();
    iceBox = new Refrigerator();
    dishWasher = new DishWasher();
  }


  public CoffeeMaker getBrewMaster() {
    return brewMaster;
  }

  public DishWasher getDishWasher() {
    return dishWasher;
  }

  public Refrigerator getIceBox() {
    return iceBox;
  }

  public void setKitchenState(boolean refrigeratorState, boolean dishWasherState, boolean coffeeMakerState) {
    iceBox.setHasWorkToDo(refrigeratorState);
    dishWasher.setHasWorkToDo(dishWasherState);
    brewMaster.setHasWorkToDo(coffeeMakerState);
  }



  public void doKitchenWork() {
    iceBox.orderFood();
    dishWasher.doDishes();
    brewMaster.brewCoffee();
  }
}
