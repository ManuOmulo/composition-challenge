public class Main {
  public static void main(String[] args) {
    SmartKitchen newKitchen = new SmartKitchen();

    newKitchen.getIceBox().setHasWorkToDo(true);
    newKitchen.getIceBox().orderFood();

    System.out.println("--------------------------");

    newKitchen.setKitchenState(true, false, true);
    newKitchen.doKitchenWork();
  }
}
