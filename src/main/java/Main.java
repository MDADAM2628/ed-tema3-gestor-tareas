import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcionMenu(sc, opcion);
        }
    }

    public static void opcionMenu(Scanner sc, int opcion){
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
        }
    }
    public static void suma(){

    }

    public static void resta(){

    }

    public static void multiplicar(){

    }

    public static void dividir(){

    }
}