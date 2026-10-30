import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {

        // INICIO VARIABLES

        Scanner input = new Scanner(System.in);
        float[][] notas = new float[20][6];
        float mejorNota;
        float peorNota;

        // FINAL VARIABLES

        // INICIO PROGRAMA

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ":");
                notas[i][j] = input.nextFloat();
            }
        }

        mejorNota = notas[0][0];
        peorNota = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            notas[i][4] = notas[i][0];
            notas[i][5] = notas[i][0];

            for (int j = 0; j < 3; j++) {
                notas[i][3] = notas[i][3] + notas[i][j];
                if (notas[i][j] > notas[i][4]) {
                    notas[i][4] = notas[i][j];
                }
                if (notas[i][j] < notas[i][5]) {
                    notas[i][5] = notas[i][j];
                }
            }
            notas[i][3] = notas[i][3] / 3;

            if (notas[i][4] > mejorNota) {
                mejorNota = notas[i][4];
            }
            if (notas[i][5] < peorNota) {
                peorNota = notas[i][5];
            }
        }

        System.out.println("Notas de los alumnos: (Nota1, Nota2, Nota3, Promedio, Mayor, Menor)");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("Mejor nota del curso: " + mejorNota);
        System.out.println("Peor nota del curso: " + peorNota);

        // FINAL PROGRAMA
    }
}
