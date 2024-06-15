import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Principal : ");
        int loan = scanner.nextInt();
        System.out.printf("Annual intrest rate : ");
        double annualIntrestRate = scanner.nextDouble();
        System.out.printf("Period in years : ");
        int period = scanner.nextInt();

        annualIntrestRate = (annualIntrestRate*0.01)/12;
        period = period*12;
        double numerator = Math.pow(1+annualIntrestRate,period);
        double denominator = Math.pow(1+annualIntrestRate,period)-1;

        //mortgage formula
        double mortgage = loan*annualIntrestRate*(numerator/denominator);

        //string formating
        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        //printing result
        System.out.println("Mortgage : "+result);
    }
}