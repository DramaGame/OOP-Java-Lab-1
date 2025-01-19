import java.util.Scanner;

class task7 { //java program that calculates the volume of a cylinde
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user to enter the radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        // 3 user to enter the height
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the volume
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

