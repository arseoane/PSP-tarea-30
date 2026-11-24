
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("\n> ");
            String n = scanner.nextLine().trim();

            if (n.equals("ADIOS")) {
                System.out.println("OK Hasta luego");
                break;
            }

            if (!n.startsWith("HOLA ")) {
                System.out.println("ERR Identifícate con HOLA");
                continue;
            }

            String nombre = n.substring(5).trim();

            if (nombre.isEmpty()) {
                System.out.println("ERR Comando no válido");
                continue;
            }

            System.out.println("OK Hola, " + nombre);

            Partida partida = new Partida();
            partida.run();
        }
    }

    static class Partida implements Runnable {
        public void run() {
            int numCorrecto = new Random().nextInt(100);

            while (true) {
                System.out.print("\n> ");
                String n = scanner.nextLine().trim();

                try {
                    int numero = Integer.parseInt(n);

                    if (numero == numCorrecto) {
                        System.out.println("ACIERTO");
                        break;
                    } else if (numero < numCorrecto) {
                        System.out.println("MAYOR");
                    } else {
                        System.out.println("MENOR");
                    }
                } catch (NumberFormatException e) {
                    if (n.equals("ADIOS")) {
                        System.out.println("OK Hasta luego");
                        break;
                    } else {
                        System.out.println("ERR Comando no válido");
                    }
                }
            }
        }
    }
}
