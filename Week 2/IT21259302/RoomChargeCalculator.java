
//import util classes for Scanner
import java.util.*;

public class RoomChargeCalculator {

    // create global variables for room prices without extra facilities
    public static int fixeddeluxDoubleFee = 5000;
    public static int fixedStandardFamilyFee = 3000;
    public static int fixedStandardSingelFee = 2000;

    // create global variables extra facility prices
    public static int priceForBalcony = 500;
    public static int priceforParking = 200;
    public static int priceForTv = 200;
    public static int deluxDoubleKitchenPrice = 1000;
    public static int priceForWifi = 100;
    public static int standardFamilyKitchenPrice = 500;
    public static int priceForGarden = 200;
    public static int priceForAc = 500;

    // create a method to get selected extra facilities
    public static boolean extraFacilities(String confirmFacility) {
        boolean facility;
        if (confirmFacility.toLowerCase().equals("yes")) {
            facility = true;
        } else {
            facility = false;
        }
        return facility;
    }

    // create a method to get selected extra facility prices
    public static int facilityPrice(boolean selection, int facPrice) {
        if (selection == true) {
            return facPrice;
        } else {
            return facPrice = 0;
        }
    }

    // create a method to claculate Delux-Double room price with selected facilities
    public static void getChargeDeluxDouble(boolean dBalcony, boolean dParking, boolean dTv, boolean dKitchen,
            boolean dWifi) {

        int deluxBalconyPrice = facilityPrice(dBalcony, priceForBalcony);
        int deluxParkingPrice = facilityPrice(dParking, priceforParking);
        int deluxTvPrice = facilityPrice(dTv, priceForTv);
        int deluxKitchenPrice = facilityPrice(dKitchen, deluxDoubleKitchenPrice);
        int deluxWifiPrice = facilityPrice(dWifi, priceForWifi);

        int totalFacilityAmount = deluxBalconyPrice + deluxParkingPrice + deluxTvPrice + deluxKitchenPrice
                + deluxWifiPrice;

        int paybleAmount = fixeddeluxDoubleFee + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Delux-Double Room:- " + paybleAmount + "/- ===");
    }

    /*
     * create a method to calculate Standard Family room price with selected
     * facilities
     */
    public static void getChargeStandardFamily(boolean famParking, boolean famKitchen, boolean famGarden) {

        int familyParkingPrice = facilityPrice(famParking, priceforParking);
        int familyKitchenPrice = facilityPrice(famKitchen, standardFamilyKitchenPrice);
        int familyGardenPrice = facilityPrice(famGarden, priceForGarden);

        int totalFacilityAmount = familyParkingPrice + familyKitchenPrice + familyGardenPrice;

        int paybleAmount = fixedStandardFamilyFee + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Standard Family Room:- " + paybleAmount + "/- ===");
    }

    /*
     * create a method to calculate Standard Single room price with selected
     * facilities
     */
    public static void getChargeStandardSingle(boolean singleParking, boolean singleAc, boolean singleWifi) {
        int singleParkingPrice = facilityPrice(singleParking, priceforParking);
        int singleAcPrice = facilityPrice(singleAc, priceForAc);
        int singleWifiPrice = facilityPrice(singleWifi, priceForWifi);

        int totalFacilityAmount = singleParkingPrice + singleAcPrice + singleWifiPrice;

        int paybleAmount = fixedStandardSingelFee + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Standard Singel Room:- " + paybleAmount + "/- ===");
    }

    // main method
    public static void main(String[] args) {

        // Create the Scanner variable
        Scanner sc = new Scanner(System.in);

        // variable for answer(yes/no)
        String cusAnswer;

        // room selection list
        System.out.println("---Room List---");
        System.out.println("1.Delux-Double");
        System.out.println("2.Standard-Family");
        System.out.println("3.Standard-Single");
        System.out.println("4.Quit");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\n*** You hava Chosen Delux Double Room ***");
            System.out.println("\nFixed fee for delux Double Room:- " + fixeddeluxDoubleFee);

            System.out.println("\n~~ Additional Services for delux-Double Room ~~");
            System.out.println("Balcony fee:- " + priceForBalcony);
            System.out.println("Parking fee:- " + priceforParking);
            System.out.println("Tv fee:- " + priceForTv);
            System.out.println("Kitchen fee:- " + deluxDoubleKitchenPrice);
            System.out.println("Wifi fee:- " + priceForWifi);

            System.out.print("\nDo you want to add Additional Services for delux-Double Room? (Yes/No): ");
            cusAnswer = sc.next();

            // use toLowerCase() for changing the customer's answer to lowercase letters
            if (cusAnswer.toLowerCase().equals("yes")) {
                System.out.print("\n*Do you want Balcony facility? (Yes/No): ");
                String deluxBalcony = sc.next();
                /*
                 * call the extraFacilities method and
                 * pass the customers selection(yes/no) to get prices for each facility
                 */
                boolean deluxBalconeySelected = extraFacilities(deluxBalcony);

                System.out.print("*Do you want Parking facility? (Yes/No): ");
                String deluxParking = sc.next();
                boolean deluxParkingSelected = extraFacilities(deluxParking);

                System.out.print("*Do you want Televsion facility? (Yes/No): ");
                String deluxTv = sc.next();
                boolean deluxTvSelected = extraFacilities(deluxTv);

                System.out.print("*Do you want Kitchen facility? (Yes/No): ");
                String deluxKitchen = sc.next();
                boolean deluxKitchenSelected = extraFacilities(deluxKitchen);

                System.out.print("*Do you want Wifi facility? (Yes/No): ");
                String deluxWifi = sc.next();
                boolean deluxWifiSelected = extraFacilities(deluxWifi);

                // call the method and pass the values for calculating total room charge
                getChargeDeluxDouble(deluxBalconeySelected, deluxParkingSelected, deluxTvSelected, deluxKitchenSelected,
                        deluxWifiSelected);
            } else {
                System.out
                        .println("\n=== Your Total Charge for delux-Double Room:-  " + fixeddeluxDoubleFee + "/- ===");
            }
        } else if (choice == 2) {
            System.out.println("\n*** You hava Chosen Standard Family Room ***");
            System.out.println("Fixed fee for Standard Family Room:- " + fixedStandardFamilyFee);

            System.out.println("\n~~ Additional Services for Standard Family Room ~~");
            System.out.println("Parking fee:- " + priceforParking);
            System.out.println("Kitchen fee:- " + standardFamilyKitchenPrice);
            System.out.println("Garden fee:- " + priceForGarden);

            System.out.print("\nDo you want to add Additional Services for Standard Family Room? (Yes/No): ");
            cusAnswer = sc.next();

            if (cusAnswer.toLowerCase().equals("yes")) {

                System.out.print("\n*Do you want Parking facility? (Yes/No): ");
                String familyParking = sc.next();
                boolean fParking = extraFacilities(familyParking);

                System.out.print("*Do you want Kitchen facility? (Yes/No): ");
                String familyKitchen = sc.next();
                boolean fKitchen = extraFacilities(familyKitchen);

                System.out.print("*Do you want garden facility? (Yes/No): ");
                String familygarden = sc.next();
                boolean fGarden = extraFacilities(familygarden);

                getChargeStandardFamily(fParking, fKitchen, fGarden);
            } else {
                System.out.println(
                        "\n=== Your Total Charge for Standard Family Room:-  " + fixedStandardFamilyFee + "/- ===");
            }
        } else if (choice == 3) {
            System.out.println("\n*** You hava Chosen Standard Single Room ***");
            System.out.println("Fixed fee for Standard Single Room:- " + fixedStandardSingelFee);

            System.out.println("\n~~ Additional Services for Standard Single Room ~~");
            System.out.println("Parking fee:- " + priceforParking);
            System.out.println("Ac fee:- " + priceForAc);
            System.out.println("wifi fee:- " + priceForWifi);

            System.out.print("\nDo you want to add Additional Services for Standard Single Room? (Yes/No): ");
            cusAnswer = sc.next();

            if (cusAnswer.toLowerCase().equals("yes")) {

                System.out.print("\n*Do you want Parking facility? (Yes/No): ");
                String singleParking = sc.next();
                boolean sParking = extraFacilities(singleParking);

                System.out.print("*Do you want Ac facility? (Yes/No): ");
                String singleAc = sc.next();
                boolean sAc = extraFacilities(singleAc);

                System.out.print("*Do you want Wifi facility? (Yes/No): ");
                String singleWifi = sc.next();
                boolean sWifi = extraFacilities(singleWifi);

                getChargeStandardSingle(sParking, sAc, sWifi);
            } else {
                System.out.println(
                        "\n=== Your Total Charge for Standard Family Room:-  " + fixedStandardFamilyFee + "/- ===");
            }
        } else if (choice == 4) {
            System.out
                    .println(
                            "..... We are always trying to give you a qulity service. Have a Nice day Sir/Madam .....");
        } else {
            System.out.println("\n!!!... Wrong Input ...!!!"); // Show error message for wrong input
        }
    }
}