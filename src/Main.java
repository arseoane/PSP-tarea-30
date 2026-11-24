import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCorrecto = new Random().nextInt(100);

        while (true){
            System.out.print("\nAdivina el número: ");
            String n = scanner.nextLine();

            try{
                int numero = Integer.parseInt(n);
                if (numero == numCorrecto){
                    System.out.println("ACIERTO");
                    break;
                } else if (numero < numCorrecto) {
                    System.out.println("MAYOR");
                } else {
                    System.out.println("MENOR");
                }
            } catch (NumberFormatException e) {
                if (n.equals("ADIOS")){
                    System.out.println("OK Hasta luego");
                    break;
                }
                else{
                    System.out.println("ERR Comando no válido");
                }
            }
        }

    }
}
