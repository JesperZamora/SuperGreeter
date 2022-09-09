import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter s = new SuperGreeter();
        s.start();
        s.greet();
        s.age();
    }

    public void start() {
        System.out.println("Det virker!");
    }

    public void greet() {
        System.out.println("Hej hvad hedder du?");
        Scanner sc = new Scanner(System.in);
        String navn = sc.nextLine();
        System.out.println("Hej "+ navn);
    }

    public void age() {
        System.out.println("Hvor gamel er du?");
        Scanner sc = new Scanner(System.in);
        int alder = sc.nextInt();
        System.out.println("Du er "+ alder + "år");
    }



}
