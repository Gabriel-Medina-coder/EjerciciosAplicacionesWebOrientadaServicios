import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0 -10 00 Excelente
        // 11 - 25 0 Buena calidad
        // 26 - 50 1 Aceptable
        // 50 - 75 2 Limite permitido
        //Mayor a 76 RECHAZADO
        Scanner sc = new Scanner(System.in);
        int hayAuto = 1;
        int nivelEmisiones = -1;
        String engomado = "RECHAZADO";

        while (hayAuto==1){

            while (nivelEmisiones<0){
                System.out.println("Ingresa el nivel de emisiones");
                nivelEmisiones = sc.nextInt();
                if (nivelEmisiones<0){
                    System.out.println("Intenta nuevamente");
                }
            }

            if (nivelEmisiones<11){
                engomado="00";
            } else if (nivelEmisiones<26) {
                engomado="0";
            } else if (nivelEmisiones<51) {
                engomado="1";
            } else if (nivelEmisiones<76) {
                engomado="2";
            }else {
                engomado="RECHAZADO";
            }

            System.out.println("Tu engomado es: " + engomado);
            System.out.println("¿Hay otro auto?");
            System.out.println("1) Si");
            System.out.println("2) No");
            hayAuto=sc.nextInt();
        }

    }
}