package project3;

import java.util.Scanner;

    public class CurrencyConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            double usdToEur = 0.85;

            double usdToGbp = 0.75;

            double usdToInr = 74.50;

            double usdToJpy = 110.00;


            System.out.println("Welcome to the Currency Converter!");

            while (true) {
                System.out.println("\nSelect the currency you want to convert from (type 'exit' to quit):");
                System.out.println("1. USD (US Dollar)");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("4. INR (Indian Rupee)");
                System.out.println("5. JPY (Japanese Yen)");
                System.out.print("Enter your choice: ");
                String fromCurrency = scanner.nextLine();



                if (fromCurrency.equalsIgnoreCase("exit")) {

                    System.out.println("Exiting the Currency Converter. Goodbye!");
                    break;
                }

                System.out.print("Enter the amount you want to convert: ");
                double amount = scanner.nextDouble();


                scanner.nextLine();


                System.out.println("\nSelect the currency you want to convert to:");
                System.out.println("1. USD (US Dollar)");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("4. INR (Indian Rupee)");
                System.out.println("5. JPY (Japanese Yen)");
                System.out.print("Enter your choice: ");
                String toCurrency = scanner.nextLine();

                double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount, usdToEur, usdToGbp, usdToInr, usdToJpy);

                if (convertedAmount != -1) {
                    System.out.println("Converted Amount: " + convertedAmount + " " + toCurrency);

                }
                else {
                    System.out.println("Invalid currency selection. Please try again.");
                }
            }

            scanner.close();
        }


        public static double convertCurrency(String fromCurrency, String toCurrency, double amount,
                                             double usdToEur, double usdToGbp, double usdToInr, double usdToJpy) {


            double usdEquivalent = 0;


            switch (fromCurrency.toLowerCase()) {

                case "1": // USD to USD
                    usdEquivalent = amount;
                    break;
                case "2":
                    usdEquivalent = amount / usdToEur;
                    break;
                case "3":

                    usdEquivalent = amount / usdToGbp;
                    break;
                case "4":

                    usdEquivalent = amount / usdToInr;
                    break;
                case "5":
                    usdEquivalent = amount / usdToJpy;
                    break;
                default:
                    return -1;
            }


            switch (toCurrency.toLowerCase()) {


                case "1":
                    return usdEquivalent;

                    case "2":
                    return usdEquivalent * usdToEur;

                case "3":
                    return usdEquivalent * usdToGbp;

                    case "4":
                    return usdEquivalent * usdToInr;

                    case "5":
                    return usdEquivalent * usdToJpy;

                    default:
                    return -1;
        }
    }

}
