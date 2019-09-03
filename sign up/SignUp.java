import java.util.*;

public class SignUp {

  private static ArrayList<User> users = new ArrayList<User>();

  public static void main(String[] args) {
    // SET EXISTING USERS
    users.add(new User("admin", "password"));
    users.add(new User("person", "password"));
    users.add(new User("jimbob234", "password"));
    users.add(new User("skater_gurl17", "password"));
    users.add(new User("gary", "password"));

    Scanner s = new Scanner(System.in);
    System.out.println("Sign up");
    // USERNAME
    System.out.println("Enter Username: ");
    String inputUsername = s.nextLine();
    if (!validUsername(inputUsername)) {
      System.out.println("Sorry, that username is taken.");
      return;
    }
    // PASSWORD
    System.out.println("Enter Password: ");
    String inputPassword = s.nextLine();
    if (!validPassword(inputPassword)) {
      System.out.println("Sorry, that password is not valid.");
      return;
    }
    // ADD USER IF USERNAME AND PASSWORD ARE VALID
    users.add(new User(inputUsername, inputPassword));
    System.out.println("\nYou have been signed up!");
    System.out.println("Here are all the existing users: \n");
    // LIST USERS
    for (int i = 0; i < users.size(); i++) {
      String username = users.get(i).username;
      String password = users.get(i).password;
      System.out.println(username + " - " + password);
    }
  }

  private static boolean validUsername(String username) {
    // TEST IF USERNAME IS TAKEN
    boolean valid = true;
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).username().equals(username)) {
        valid = false;
      }
    }
    return valid;
  }

  private static boolean validPassword(String password) {
    // TEST IF PASSWORD STARTS WITH A VOWEL
    boolean startsWithVowel = false;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < vowels.length; i++) {
      if (Character.toLowerCase(password.charAt(0)) == vowels[i]) {
        startsWithVowel = true;
      }
    }

    // TEST IF PASSWORD CONAINS SYMBOLS
    boolean hasSymbol = false;
    char[] symbols = {'#', '!', '$', '&', '*'};
    for (int i = 0; i < symbols.length; i++) {
      if (password.indexOf(symbols[i]) >= 0) {
        hasSymbol = true;
      }
    }

    // TEST IF NUMBERS ARE ONLY LAST 2 PLACES
    boolean numbersLastTwo = true;
    char[] nums = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
    for (int i = 0; i < nums.length; i++) {
      if (password.indexOf(nums[i]) >= 0 && password.indexOf(nums[i]) < password.length() - 3) {
        numbersLastTwo = false;
      }
    }

    return (startsWithVowel && hasSymbol && numbersLastTwo);
  }

}
