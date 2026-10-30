public class ejercicio03 {
    public static void main(String[] args) {

        // INICIO VARIABLES

        char[][] matriz = new char[5][5];

        // FINAL VARIABLES

        // INICIO PROGRAMA

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ' ';
                if (i == 0) {
                    matriz[i][j] = 'X';
                }
                if (i == matriz.length - 1) {
                    matriz[i][j] = 'X';
                }
                if (i == j) {
                    matriz[i][j] = 'X';
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // FINAL PROGRAMA
    }
}
