

public class Main {
    public static void main(String[] args) {
        KitchenAppliance kitchenAppliance = new KitchenAppliance();

        if (kitchenAppliance.find("Voltage")){
            System.out.println("keyword found");
        }else {
            System.out.println("keyword not found");
        }


    }
}
