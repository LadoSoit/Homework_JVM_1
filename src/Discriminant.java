import java.util.Scanner;

public class Discriminant {

    public static void main1(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        c = input.nextDouble();

        System.out.println(Discriminant.Discr(a, b, c));

    }


    public static double Discr(Double a,Double b,Double c){
        double Discriminant;
        Discriminant = b * b - 4.0 + a * c;
        return Discriminant;
    }

}
