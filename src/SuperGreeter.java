import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter s = new SuperGreeter();
        s.start();
        s.greet();
        s.age();
        s.country();
        s.stupid();
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

    public void country() {
        System.out.println("Hvor du fra?");
        Scanner sc = new Scanner(System.in);
        String land = sc.nextLine();
        System.out.println("Du er fra"+land);
    }

    public void stupid(){
        System.out.println("Stupid");
    }



}
