import java.util.*;

public class SignUp {

  private static ArrayList<User> users = new ArrayList<User>();

  public static void main(String[] args) {
    users.add(new User("admin", "password"));
    users.add(new User("person", "password"));
    users.add(new User("jimbob234", "password"));
    users.add(new User("skater_gurl17", "password"));
    users.add(new User("gary", "password"));

    for (int i = 0; i < users.size(); i++) {
      String username = users.get(i).username;
      String password = users.get(i).password;
      System.out.println(username + " - " + password);
    }
  }

  private static void signUpUser(String username, String password) {
    boolean valid = false;

    // TEST IF PASSWORD STARTS WITH A VOWEL
    boolean startsWithVowel = false;
    char[] vowels = {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (password.charAt[0] == vowels[i]) {
        startsWithVowel = true;
      }
    }

    // char first = password.charAt[0];
    // if (first == "a" || first == "A" ||
    //     first == "e" || first == "E" ||
    //     first == "i" || first == "I" ||
    //     first == "o" || first == "O" ||
    //     first == "u" || first == "U")
    // {
    //   valid = true;
    // }

    // String vowels = "aeiouAEIOU"
    // if vowels.indexOf(password.charAt[0] != -1) {
    //   valid = true;
    // }

    // TEST IF PASSWORD CONAINS SYMBOLS
    boolean hasSymbol = false;
    char[] symbols = {"#", "!", "$", "&", "*"};
    for (int i = 0; i < symbols.length; i++) {
      if (password.contains(symbols[i])) {
        hasSymbol = true;
      }
    }

    // TEST IF USERNAME IS TAKEN
    boolean usernameUnique = true;
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).username() == username) {
        usernameUnique = false;
      }
    }

    if (startsWithVowel && hasSymbol && !usernameUnique) {
      valid = true;
    }
  }

}
