
//import util classes for Scanner(import all util classes)
import java.util.*;

public class RoomChargeCalculator {

    // create static variables for fixed room prices
    static int fixeddeluxDoubleFee1;
    static int fixedStandardFamilyFee1;
    static int fixedStandardSingelFee1;

    // create static variables for extra facilities
    static int priceForBalcony1;
    static int priceforParking1;
    static int priceForTv1;
    static int deluxDoubleKitchenPrice1;
    static int priceForWifi1;
    static int standardFamilyKitchenPrice1;
    static int priceForGarden1;
    static int priceForAc1;

    // constructor
    public RoomChargeCalculator(int fixeddeluxDoubleFee2, int fixedStandardFamilyFee2, int fixedStandardSingelFee2,
            int priceForBalcony2, int priceforParking2, int priceForTv2, int deluxDoubleKitchenPrice2,
            int priceForWifi2, int standardFamilyKitchenPrice2, int priceForGarden2, int priceForAc2) {

        fixeddeluxDoubleFee1 = fixeddeluxDoubleFee2;
        fixedStandardFamilyFee1 = fixedStandardFamilyFee2;
        fixedStandardSingelFee1 = fixedStandardSingelFee2;
        priceForBalcony1 = priceForBalcony2;
        priceforParking1 = priceforParking2;
        priceForTv1 = priceForTv2;
        deluxDoubleKitchenPrice1 = deluxDoubleKitchenPrice2;
        priceForWifi1 = priceForWifi2;
        standardFamilyKitchenPrice1 = standardFamilyKitchenPrice2;
        priceForGarden1 = priceForGarden2;
        priceForAc1 = priceForAc2;

    }

    // create a method to get selected extra facilities
    public boolean extraFacilities(String confirmFacility) {
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

        int deluxBalconyPrice = facilityPrice(dBalcony, priceForBalcony1);
        int deluxParkingPrice = facilityPrice(dParking, priceforParking1);
        int deluxTvPrice = facilityPrice(dTv, priceForTv1);
        int deluxKitchenPrice = facilityPrice(dKitchen, deluxDoubleKitchenPrice1);
        int deluxWifiPrice = facilityPrice(dWifi, priceForWifi1);

        int totalFacilityAmount = deluxBalconyPrice + deluxParkingPrice + deluxTvPrice + deluxKitchenPrice
                + deluxWifiPrice;

        int paybleAmount = fixeddeluxDoubleFee1 + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Delux-Double Room:- " + paybleAmount + "/- ===\n");
    }

    /*
     * create a method to calculate Standard Family room price with selected
     * facilities
     */
    public static void getChargeStandardFamily(boolean famParking, boolean famKitchen, boolean famGarden) {

        int familyParkingPrice = facilityPrice(famParking, priceforParking1);
        int familyKitchenPrice = facilityPrice(famKitchen, standardFamilyKitchenPrice1);
        int familyGardenPrice = facilityPrice(famGarden, priceForGarden1);

        int totalFacilityAmount = familyParkingPrice + familyKitchenPrice + familyGardenPrice;

        int paybleAmount = fixedStandardFamilyFee1 + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Standard Family Room:- " + paybleAmount + "/- ===\n");
    }

    /*
     * create a method to calculate Standard Single room price with selected
     * facilities
     */
    public static void getChargeStandardSingle(boolean singleParking, boolean singleAc, boolean singleWifi) {
        int singleParkingPrice = facilityPrice(singleParking, priceforParking1);
        int singleAcPrice = facilityPrice(singleAc, priceForAc1);
        int singleWifiPrice = facilityPrice(singleWifi, priceForWifi1);

        int totalFacilityAmount = singleParkingPrice + singleAcPrice + singleWifiPrice;

        int paybleAmount = fixedStandardSingelFee1 + totalFacilityAmount;
        System.out.println("\n=== Total Amount for your Standard Singel Room:- " + paybleAmount + "/- ===\n");
    }

    // main method
    public static void main(String[] args) {

        // create variables for room prices without extra facilities and store values
        int fixeddeluxDoubleFee = 5000;
        int fixedStandardFamilyFee = 3000;
        int fixedStandardSingelFee = 2000;

        // create variables for extra facility prices and store values
        int priceForBalcony = 500;
        int priceforParking = 200;
        int priceForTv = 200;
        int deluxDoubleKitchenPrice = 1000;
        int priceForWifi = 100;
        int standardFamilyKitchenPrice = 500;
        int priceForGarden = 200;
        int priceForAc = 500;

        // create object and pass value to constructor
        RoomChargeCalculator roomObj = new RoomChargeCalculator(fixeddeluxDoubleFee, fixedStandardFamilyFee,
                fixedStandardSingelFee, priceForBalcony, priceforParking, priceForTv, deluxDoubleKitchenPrice,
                priceForWifi, standardFamilyKitchenPrice, priceForGarden, priceForAc);

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

            System.out.print("\nDo you want to add Additional Services for delux-Double Room? (Yes/No): ");
            cusAnswer = sc.next();

            // check customer enter correct answer
            while (!(cusAnswer.toLowerCase().equals("yes")) && !(cusAnswer.toLowerCase().equals("no"))) {

                System.out.println("\n... Please Enter yes/no for your answer!!!! ...");

                System.out.print("Do you want to add Additional Services for delux-Double Room? (Yes/No): ");
                cusAnswer = sc.next();

            }

            // use toLowerCase() for changing the customer's answer to lowercase letters
            if (cusAnswer.toLowerCase().equals("yes")) {

                System.out.print("\n* Balcony fee:- " + priceForBalcony + "\nDo you want Balcony facility? (Yes/No): ");
                String deluxBalcony = sc.next();
                // check customer enter correct answer
                while (!(deluxBalcony.toLowerCase().equals("yes")) && !(deluxBalcony.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Balcony facility? (Yes/No): ");
                    deluxBalcony = sc.next();
                }

                System.out.print("\n* Parking fee:- " + priceforParking + "\nDo you want Parking facility? (Yes/No): ");
                String deluxParking = sc.next();
                while (!(deluxParking.toLowerCase().equals("yes")) && !(deluxParking.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Parking facility? (Yes/No): ");
                    deluxParking = sc.next();
                }

                System.out.print("\n* Tv fee:- " + priceForTv + "\nDo you want Televsion facility? (Yes/No): ");
                String deluxTv = sc.next();
                while (!(deluxTv.toLowerCase().equals("yes")) && !(deluxTv.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Televsion facility? (Yes/No): ");
                    deluxTv = sc.next();
                }

                System.out.print(
                        "\n* Kitchen fee:- " + deluxDoubleKitchenPrice + "\nDo you want Kitchen facility? (Yes/No): ");
                String deluxKitchen = sc.next();
                while (!(deluxKitchen.toLowerCase().equals("yes")) && !(deluxKitchen.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Kitchen facility? (Yes/No): ");
                    deluxKitchen = sc.next();
                }

                System.out.print("\n* Wifi fee:- " + priceForWifi + "\nDo you want Wifi facility? (Yes/No): ");
                String deluxWifi = sc.next();
                while (!(deluxWifi.toLowerCase().equals("yes")) && !(deluxWifi.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Wifi facility? (Yes/No): ");
                    deluxWifi = sc.next();
                }

                /*
                 * call the extraFacilities method and
                 * pass the customers selection(yes/no) to get prices for each facility
                 */

                boolean deluxBalconeySelected = roomObj.extraFacilities(deluxBalcony);
                boolean deluxParkingSelected = roomObj.extraFacilities(deluxParking);
                boolean deluxTvSelected = roomObj.extraFacilities(deluxTv);
                boolean deluxKitchenSelected = roomObj.extraFacilities(deluxKitchen);
                boolean deluxWifiSelected = roomObj.extraFacilities(deluxWifi);

                // call the method and pass the values for calculating total room charge
                getChargeDeluxDouble(deluxBalconeySelected, deluxParkingSelected, deluxTvSelected, deluxKitchenSelected,
                        deluxWifiSelected);
            } else {
                System.out
                        .println(
                                "\n=== Your Total Charge for delux-Double Room:-  " + fixeddeluxDoubleFee + "/- ===\n");
            }
        } else if (choice == 2) {
            System.out.println("\n*** You hava Chosen Standard Family Room ***");
            System.out.println("Fixed fee for Standard Family Room:- " + fixedStandardFamilyFee);

            System.out.print("\nDo you want to add Additional Services for Standard Family Room? (Yes/No): ");
            cusAnswer = sc.next();

            while (!(cusAnswer.toLowerCase().equals("yes")) && !(cusAnswer.toLowerCase().equals("no"))) {
                System.out.println("\n... Please Enter yes/no for your answer!!!! ...");

                System.out.print("Do you want to add Additional Services for Standard Family Room? (Yes/No): ");
                cusAnswer = sc.next();

            }

            if (cusAnswer.toLowerCase().equals("yes")) {

                System.out.print("\n* Parking fee:- " + priceforParking + "\nDo you want Parking facility? (Yes/No): ");
                String familyParking = sc.next();
                while (!(familyParking.toLowerCase().equals("yes")) && !(familyParking.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Parking facility? (Yes/No): ");
                    familyParking = sc.next();
                }

                System.out.print("\n* Kitchen fee:- " + standardFamilyKitchenPrice
                        + "\nDo you want Kitchen facility? (Yes/No): ");
                String familyKitchen = sc.next();
                while (!(familyKitchen.toLowerCase().equals("yes")) && !(familyKitchen.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Kitchen facility? (Yes/No): ");
                    familyKitchen = sc.next();
                }

                System.out.print("\n* Garden fee:- " + priceForGarden + "\nDo you want garden facility? (Yes/No): ");
                String familygarden = sc.next();
                while (!(familygarden.toLowerCase().equals("yes")) && !(familygarden.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want garden facility? (Yes/No): ");
                    familygarden = sc.next();
                }

                boolean fParking = roomObj.extraFacilities(familyParking);
                boolean fKitchen = roomObj.extraFacilities(familyKitchen);
                boolean fGarden = roomObj.extraFacilities(familygarden);

                getChargeStandardFamily(fParking, fKitchen, fGarden);
            } else {
                System.out.println(
                        "\n=== Your Total Charge for Standard Family Room:-  " + fixedStandardFamilyFee + "/- ===\n");
            }
        } else if (choice == 3) {
            System.out.println("\n*** You hava Chosen Standard Single Room ***");
            System.out.println("Fixed fee for Standard Single Room:- " + fixedStandardSingelFee);

            System.out.print("\nDo you want to add Additional Services for Standard Single Room? (Yes/No): ");
            cusAnswer = sc.next();

            while (!(cusAnswer.toLowerCase().equals("yes")) && !(cusAnswer.toLowerCase().equals("no"))) {

                System.out.println("\n... Please Enter yes/no for your answer!!!! ...");

                System.out.print("Do you want to add Additional Services for Standard Single Room? (Yes/No): ");
                cusAnswer = sc.next();
            }

            if (cusAnswer.toLowerCase().equals("yes")) {

                System.out.print("\n* Parking fee:- " + priceforParking + "\nDo you want Parking facility? (Yes/No): ");
                String singleParking = sc.next();
                while (!(singleParking.toLowerCase().equals("yes")) && !(singleParking.toLowerCase().equals("no"))) {

                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Parking facility? (Yes/No): ");
                    singleParking = sc.next();

                }

                System.out.print("\n* Ac fee:- " + priceForAc + "\nDo you want Ac facility? (Yes/No): ");
                String singleAc = sc.next();
                while (!(singleAc.toLowerCase().equals("yes")) && !(singleAc.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Ac facility? (Yes/No): ");
                    singleAc = sc.next();
                }

                System.out.print("\n* wifi fee:- " + priceForWifi + "\nDo you want Wifi facility? (Yes/No): ");
                String singleWifi = sc.next();
                while (!(singleWifi.toLowerCase().equals("yes")) && !(singleWifi.toLowerCase().equals("no"))) {
                    System.out.println("\n... Please Enter yes/no for your answer!!!! ...");
                    System.out.print("*Do you want Wifi facility? (Yes/No): ");
                    singleWifi = sc.next();
                }

                boolean sParking = roomObj.extraFacilities(singleParking);
                boolean sAc = roomObj.extraFacilities(singleAc);
                boolean sWifi = roomObj.extraFacilities(singleWifi);

                getChargeStandardSingle(sParking, sAc, sWifi);
            } else {
                System.out.println(
                        "\n=== Your Total Charge for Standard Single Room:-  " + fixedStandardSingelFee + "/- ===\n");
            }
        } else if (choice == 4) {
            System.out
                    .println(
                            "..... We are always trying to give you a qulity service. Have a Nice day Sir/Madam .....\n");
        } else {
            System.out.println("\n!!!... Wrong Input ...!!!\n ~~~ Try again with 1-4 choises ~~~\n");
        }
        sc.close(); // close the Scanner
    }
}