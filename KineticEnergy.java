import java.util.*;

public class KineticEnergy {

    public static void main(String[] args) {

        double mass, velocity, velocitySquared, kineticEnergy, keround;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter mass in kilograms: ");
        mass = scan.nextDouble();
        
        System.out.print("Enter velocity in meters per second: ");
        velocity = scan.nextDouble();
        
        velocitySquared = Math.pow(velocity, 2);
        kineticEnergy = mass * velocitySquared / 2;
        
        System.out.printf("The object's kinetic energy is: %.2f J.", kineticEnergy);
    }
}
