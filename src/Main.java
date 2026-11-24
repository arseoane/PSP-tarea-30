import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("\n> ");
            String n = scanner.nextLine();

            if (!n.contains("HOLA")) {
                System.out.println("ERR Identifícate con HOLA");
            }
            else{
                try {
                    String nombre = n.replace("HOLA ", "");
                    Thread partida = new Thread(new Partida(), nombre);
                    System.out.println("OK Hola, " + nombre);
                    partida.start();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("ERR Comando no válido");
                } catch (Exception e) {
                    break;
                }

            }
        }
    }

    static class Partida implements Runnable {
        public void run(){
            int numCorrecto = new Random().nextInt(100);

            while (true){
                System.out.print("\n> ");
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
}
