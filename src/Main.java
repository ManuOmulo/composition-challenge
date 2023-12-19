public class Main {
  public static void main(String[] args) {
    Refrigerator lg = new Refrigerator(false);
    DishWasher mika = new DishWasher(false);
    CoffeeMaker ramtons = new CoffeeMaker(false);

    SmartKitchen myKitchen = new SmartKitchen(ramtons, mika, lg);
    SmartKitchen newKitchen = new SmartKitchen();

    newKitchen.pourMilk();

    myKitchen.doKitchenWork();
  }
}
