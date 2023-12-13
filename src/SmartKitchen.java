public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;

  public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
    this.brewMaster = brewMaster;
    this.dishWasher = dishWasher;
    this.iceBox = iceBox;
  }

  public SmartKitchen() {
    brewMaster = new CoffeeMaker();
    iceBox = new Refrigerator();
    dishWasher = new DishWasher();
  }

  public void addWater() {
    brewMaster.setHasWorkToDo(true);
    brewMaster.brewCoffee();
    System.out.println("Making Coffee");
  }

  public void pourMilk() {
    iceBox.setHasWorkToDo(true);
    iceBox.orderFood();
    System.out.println("Pouring Milk");
  }

  public void loadDishwasher() {
    dishWasher.setHasWorkToDo(true);
    dishWasher.doDishes();
    System.out.println("Loading the dish washer");
  }


  public void doKitchenWork() {
    addWater();
    pourMilk();
    loadDishwasher();
  }
}
