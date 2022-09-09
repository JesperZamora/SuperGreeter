import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter s = new SuperGreeter();
        s.start();
        s.greet();
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


}
