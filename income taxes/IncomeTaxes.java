import java.util.Scanner;

public class IncomeTaxes {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double userIncome;
    double totalPaid;
    double percentPaid;

    // GET USER INCOME
    System.out.print("Enter your yearly income: ");
    userIncome = s.nextDouble();

    // OUTPUT TAXES
    totalPaid = calculateTaxes(userIncome);
    percentPaid = totalPaid / userIncome;
    System.out.println("Total paid: $" + totalPaid);
    System.out.println(percentPaid + "% of " + userIncome);
  }

  private static double calculateTaxes(double i) {
    double t = 0;
    double r = i;

    if (i > 105000) {
      t += (r - 105000) * 0.22;
      r = 105000;
    }
    if (i > 65000) {
      t += (r - 65000) * 0.19;
      r = 65000;
    }
    if (i > 35000) {
      t += (r - 35000) * 0.16;
      r = 35000;
    }
    if (i > 15000) {
      t += (r - 15000) * 0.10;
      r = 15000;
    }
    
    return t;
  }

}
