
    import java.util.Scanner;

    class task8 {//  calculate the kilometer per hour4
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the speed in miles per hour: ");
            double mph = sc.nextDouble();
            double kph = mph * 1.60934; // Conversion factor
            System.out.println("The speed in kilometers per hour is: " + kph);
        }
    }
    
