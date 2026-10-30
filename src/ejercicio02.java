import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {

        // INICIO VARIABLES

        Scanner input = new Scanner(System.in);
        int n;
        int m;
        int[][] matriz;
        int[][] resultados;

        // FINAL VARIABLES

        // INICIO PROGRAMA

        System.out.println("Introduce el numero de filas:");
        n = input.nextInt();
        System.out.println("Introduce el numero de columnas:");
        m = input.nextInt();

        matriz = new int[n][m];
        resultados = new int[3][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el numero de la fila " + (i + 1) + ", columna " + (j + 1) + ":");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            resultados[1][j] = matriz[0][j];
            resultados[2][j] = matriz[0][j];

            for (int i = 0; i < n; i++) {
                resultados[0][j] = resultados[0][j] + matriz[i][j];
                if (matriz[i][j] > resultados[1][j]) {
                    resultados[1][j] = matriz[i][j];
                }
                if (matriz[i][j] < resultados[2][j]) {
                    resultados[2][j] = matriz[i][j];
                }
            }
        }

        System.out.println("Suma, mayor y menor de cada columna:");
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.print(resultados[i][j] + " ");
            }
            System.out.println();
        }

        // FINAL PROGRAMA
    }
}
