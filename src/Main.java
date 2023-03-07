import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dni = scan.nextInt();
        switch (dni){
            case 1:
                System.out.println("киргизкий");
                break;
            case 2:
                System.out.println("матем");
                break;
            case 3:
                System.out.println("русский");
                break;
            case 4:
                System.out.println("биолог");
                break;
            case 5:
                System.out.println("физра");
                break;
            case 6:
                System.out.println("химия");
                break;
            case 7:
                System.out.println("свободны");
                break;
            default:
                System.out.println("такого дня нет");
                break;
            case 8:
        }
    }
}