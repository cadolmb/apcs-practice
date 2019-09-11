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

  private static double calculateTaxes(double income ) {
    double tax = 0;
    double remainder = income;

    if (income > 105000) {
      tax += (remainder - 105000) * 0.22;
      remainder = 105000;
    }
    if (income > 65000) {
      tax += (remainder - 65000) * 0.19;
      remainder = 65000;
    }
    if (income > 35000) {
      tax += (remainder - 35000) * 0.16;
      remainder = 35000;
    }
    if (income > 15000) {
      tax += (remainder - 15000) * 0.10;
      remainder = 15000;
    }

    return tax;
  }

}
