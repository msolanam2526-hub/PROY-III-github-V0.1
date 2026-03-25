import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuJugadores();
    }
    public static void MenuJugadores(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Jugador:");
        opcion = sc.nextInt();
        switch (opcion){
            case 1: {
                System.out.println("1.- ");
                //metodojugadores()
                break;
            } case 2: {
                System.out.println("2.- ");
                break;
            } case 3: {
                System.out.println("3.- ");
                break;
            } case 4: {
                System.out.println("4. ");
                break;
            }
        }
    }
}