import java.util.Scanner;

public class RoomChargeCalculator {

    // initialing global scanner variable
    public static Scanner in = new Scanner(System.in);

    // user answer
    public static String yesNo;

    // our fixed prices
    public static int deluxDoublefixedPrice = 5000;
    public static int standardFamilyfixedPrice = 3000;
    public static int standardSinglefixedPrice = 2000;

    // out extra services price
    public static int balconyPrice = 500;
    public static int parkingPrice = 200;
    public static int tvPrice = 200;
    public static int kitchenPrice = 1000;
    public static int wifiPrice = 100;
    public static int gardenPrice = 200;
    public static int acPrice = 500;

    // main method
    public static void main(String[] args) {

        // user menu
        System.out.println("Welcome to Room Charge Calculator!!\n**Please choose a room you afford**");
        System.out.println("1.Delux Double Room");
        System.out.println("2.Standard Family Room");
        System.out.println("3.Standard Single Room");
        System.out.println("4.Quit");
        System.out.print("Please Enter Number 1-4: ");
        int chooseNum = in.nextInt();

        // user choose action
        switch (chooseNum) {
            case 1:
                System.out.println();
                System.out.println("Delux Double room  fixed price: " + deluxDoublefixedPrice + "\n");

                // show additional item price
                System.out.println("**** Our aditional services ****");
                System.out.println("For Balcony Charge: " + balconyPrice);
                System.out.println("For Parking Charge: " + parkingPrice);
                System.out.println("For TV Charge: " + tvPrice);
                System.out.println("For Kitchen Charge: " + kitchenPrice);
                System.out.println("For WiFi Charge: " + wifiPrice);

                // user answer input
                System.out.print("Do you need more service? Yes/No: ");
                yesNo = in.next();

                // condition on user answer
                if (yesNo.toLowerCase().equals("yes")) {
                    System.out.println();

                    // balcony
                    System.out.print("Do you need balcony? yes/no: ");
                    String balcony = in.next();
                    boolean balconyConfirmed = confirmExtra(balcony);
                    // System.out.println(balconyConfirmed);

                    // parking
                    System.out.print("Do you need Parking? yes/no: ");
                    String parking = in.next();
                    boolean parkingConfirmed = confirmExtra(parking);
                    // System.out.println(parkingConfirmed);

                    // TV
                    System.out.print("Do you need TV? yes/no: ");
                    String tv = in.next();
                    boolean tvConfirmed = confirmExtra(tv);
                    // System.out.println(tvConfirmed);

                    // kitchen
                    System.out.print("Do you need Kitchen? yes/no: ");
                    String kitchen = in.next();
                    boolean kitchenConfirmed = confirmExtra(kitchen);

                    // wifi
                    System.out.print("Do you need WiFi? yes/no: ");
                    String wifi = in.next();
                    boolean wifiConfirmed = confirmExtra(wifi);
                    // System.out.println(wifiConfirmed);

                    // calling the method
                    getChargeDeluxDouble(balconyConfirmed, parkingConfirmed, tvConfirmed, kitchenConfirmed,
                            wifiConfirmed);
                } else {
                    System.out.println("***********************");
                    System.out.println("Your total Room Charge : " + deluxDoublefixedPrice);
                }
                break;

            case 2:
                System.out.println();
                System.out.println("Standard Family room fixed price: " + standardFamilyfixedPrice + "\n");

                kitchenPrice = 500;
                // show additional item price
                System.out.println("**** Our aditional services ****");
                System.out.println("For Parking Charge: " + parkingPrice);
                System.out.println("For Kitchen Charge: " + kitchenPrice);
                System.out.println("For Garden Charge: " + gardenPrice);

                // user answer input
                System.out.print("Do you need our extra services? Yes/No: ");
                yesNo = in.next();

                // condition base on user answer
                if (yesNo.toLowerCase().equals("yes")) {
                    System.out.println();

                    // parking
                    System.out.print("Do you need Parking? yes/no: ");
                    String parking = in.next();
                    boolean parkingConfirmed = confirmExtra(parking);

                    // kitchen
                    System.out.print("Do you need Kitchen? yes/no: ");
                    String kitchen = in.next();
                    boolean kitchenConfirmed = confirmExtra(kitchen);

                    // garden
                    System.out.print("Do you need Garden? yes/no: ");
                    String garden = in.next();
                    boolean gardenConfirmed = confirmExtra(garden);

                    // calling the method
                    getChargeStandardFamily(parkingConfirmed, kitchenConfirmed, gardenConfirmed);
                } else {
                    System.out.println("***********************");
                    System.out.println("Your total Room Charge : " + standardFamilyfixedPrice);
                }
                break;

            case 3:
                System.out.println();
                System.out.println("Standard Single Fixed Price: " + standardSinglefixedPrice + "\n");
                // show additional item price
                System.out.println("**** Our aditional services ****");
                System.out.println("For Parking Charge: " + parkingPrice);
                System.out.println("For AC Charge: " + acPrice);
                System.out.println("For WiFi Charge: " + wifiPrice);

                // user answer input
                System.out.print("Do you need our extra services? Yes/No: ");
                yesNo = in.next();

                // condition base on user answer
                if (yesNo.toLowerCase().equals("yes")) {

                    // parking
                    System.out.print("Do you need Parking? yes/no: ");
                    String parking = in.next();
                    boolean parkingConfirmed = confirmExtra(parking);

                    // kitchen
                    System.out.print("Do you need AC? yes/no: ");
                    String ac = in.next();
                    boolean acConfirmed = confirmExtra(ac);

                    // garden
                    System.out.print("Do you need Wifi? yes/no: ");
                    String wifi = in.next();
                    boolean wifiConfirmed = confirmExtra(wifi);

                    // calling the method
                    getChargeStandardSingle(parkingConfirmed, acConfirmed, wifiConfirmed);
                } else {
                    System.out.println("***********************");
                    System.out.println("Your total Room Charge : " + standardSinglefixedPrice);
                }

                break;
            case 4:
                System.out.println("Sorry to see you leave(-_-)");
                in.close();
                break;

            default:
                System.out.println("Out of input bound");
                in.close();
                break;
        }
    }

    // confirming user extra choose items
    public static boolean confirmExtra(String answer) {
        boolean confirm;
        if (answer.toLowerCase().equals("yes")) {
            confirm = true;
        } else {
            confirm = false;
        }

        return confirm;

    }

    // get price on user interested extra item
    public static int getPrice(boolean action, int price) {

        if (action == true) {
            return price;
        } else {
            price = 0;
            return price;
        }
    }

    // calculate room charge for Delux Double room
    public static void getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen,
            boolean wifi) {

        // get prices for chosen option
        int getBalconyPrice = getPrice(balcony, balconyPrice);
        int getParkingPrice = getPrice(parking, parkingPrice);
        int getTvPrice = getPrice(tv, tvPrice);
        int getKitchenPrice = getPrice(kitchen, kitchenPrice);
        int getWifiPrice = getPrice(wifi, wifiPrice);

        // calculate total price
        int totalPrice = deluxDoublefixedPrice + getBalconyPrice + getParkingPrice + getTvPrice + getKitchenPrice
                + getWifiPrice;
        System.out.println("***********************");
        System.out.println("Your total Room Charge : " + totalPrice);
    }

    // calculate room charge for Standard Family room
    public static void getChargeStandardFamily(boolean parking, boolean kitchen, boolean garden) {

        // get prices for chosen option
        int getParkingPrice = getPrice(parking, parkingPrice);
        int getKitchenPrice = getPrice(kitchen, kitchenPrice);
        int getGardenPrice = getPrice(garden, gardenPrice);

        // calculate total price
        int totalPrice = standardFamilyfixedPrice + getParkingPrice + getKitchenPrice + getGardenPrice;
        System.out.println("***********************");
        System.out.println("Your total Room Charge : " + totalPrice);
    }

    // calculate room charge for Standard Family room
    public static void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {

        // get prices for chosen option
        int getParkingPrice = getPrice(parking, parkingPrice);
        int getAcPrice = getPrice(ac, acPrice);
        int getWifiPrice = getPrice(wifi, wifiPrice);

        // calculate total price
        int totalPrice = standardSinglefixedPrice + getParkingPrice + getAcPrice + getWifiPrice;
        System.out.println("***********************");
        System.out.println("Your total Room Charge : " + totalPrice);
    }

}
