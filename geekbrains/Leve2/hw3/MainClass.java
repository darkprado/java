import java.util.HashSet;

public class MainClass {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Oleg", 123456789, 78945641, 454468461, 454468461);
        phoneBook.add("Olga", 123485789, 78945641, 454468461, 654668486);
        phoneBook.add("Ivan", 123456789, 78945641, 454468461, 654668486);
        phoneBook.add("Artem", 123456789, 78945641, 454468461, 654668486);

        System.out.println(phoneBook.get("Oleg"));

    }

}
