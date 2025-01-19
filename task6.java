import java.util.Scanner;

class task6 { //Dollar conver to rupees
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in Dollars: ");
        int dollars = sc.nextInt();
        int rupees = 278;
        int value = dollars * rupees;
        System.out.println("Value in Rupees is: " + value);
    }
}

    

