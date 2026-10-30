import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {

        // INICIO VARIABLES

        Scanner input = new Scanner(System.in);
        int n;
        int m;
        int[][] matriz;
        int[] sumas;

        // FINAL VARIABLES

        // INICIO PROGRAMA

        System.out.println("Introduce el numero de filas:");
        n = input.nextInt();
        System.out.println("Introduce el numero de columnas:");
        m = input.nextInt();

        matriz = new int[n][m];
        sumas = new int[m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el numero de la fila " + (i + 1) + ", columna " + (j + 1) + ":");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumas[j] = sumas[j] + matriz[i][j];
            }
        }

        System.out.println("Suma de cada columna:");
        for (int j = 0; j < sumas.length; j++) {
            System.out.print(sumas[j] + " ");
        }
        System.out.println();

        // FINAL PROGRAMA
    }
}
