import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj imie");
        String fname = sc.nextLine();
        System.out.println("podaj nazwisko");
        String lname = sc.nextLine();
        System.out.println("podaj pesel");
        String pesel = sc.nextLine();
        System.out.println("podaj wiek");
        int age = sc.nextInt();

        Person person = new Person(fname, lname, age, pesel);
        System.out.println(person);
    }
}
