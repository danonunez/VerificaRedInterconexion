package cl.danoespinoza.vri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dano Espinoza <dano@danoespinoza.cl>
 */
public class Main {

    public static void main(String[] args) {
        int dim;
        int[][] matriz;

        String line = "============================";
        String startLine = "=========INICIO=============";
        String endLine = "===========FIN==============";

        System.out.println(line);
        System.out.println(startLine);
        System.out.println(line);

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Ruta del archivo: ");
            File file = new File(input.nextLine());

            input = new Scanner(file);

            while (input.hasNext()) {
                dim = input.nextInt();
                matriz = new int[dim][dim];

                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        int read = input.nextInt();
                        matriz[i][j] = read;
                    }
                }

                System.out.println(line);
                System.out.println("Dimension: " + dim + "\n");

                System.out.println("Matriz de adyacencia: ");
                imprimirMatriz(dim, matriz);

                System.out.print("Full: ");
                if (esFull(dim, matriz)) {
                    System.out.println("Si.");
                } else {
                    System.out.println("No.");
                }

                System.out.print("Estrella: ");
                if (esEstrella(dim, matriz)) {
                    System.out.println("Si.");
                } else {
                    System.out.println("No.");
                }

                System.out.print("Anillo: ");
                if (esAnillo(dim, matriz)) {
                    System.out.println("Si.");
                } else {
                    System.out.println("No.");
                }
            }

            System.out.println(line);
            System.out.println(endLine);
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean esFull(int dim, int[][] matriz) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i == j && matriz[i][j] == 1) {
                    return false;
                } else if (i != j && (matriz[i][j] == 0 || matriz[j][i] == 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esEstrella(int dim, int[][] matriz) {
        boolean conectado = false;
        int conexiones;
        int nodoCentral = 0;

        for (int i = 0; i < dim; i++) {
            conexiones = 0;
            for (int j = 0; j < dim; j++) {
                if (i == j && matriz[i][j] == 1) {
                    return false;
                }
                if ((matriz[i][j] == 1 && matriz[j][i] == 0) || (matriz[i][j] == 0 && matriz[j][i] == 1)) {
                    return false;
                }
                if (conexiones > 1 && i != nodoCentral) {
                    return false;
                }
                if (matriz[i][j] == 1 && matriz[j][i] == 1) {
                    if (conectado && (i != nodoCentral && j != nodoCentral)) {
                        return false;
                    } else {
                        conexiones++;

                        if (!conectado) {
                            conectado = true;

                            if ((j + 1 < dim) && matriz[i][j + 1] == 1 && matriz[j + 1][i] == 1) {
                                nodoCentral = i;
                            } else if ((i + 1 < dim) && matriz[i + 1][j] == 1 && matriz[j][i + 1] == 1) {
                                nodoCentral = j;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean esAnillo(int dim, int[][] matriz) {
        int[] nodos = new int[dim];
        int conexiones;

        for (int i = 0; i < dim; i++) {
            conexiones = 0;
            for (int j = 0; j < dim; j++) {
                if (i == j && matriz[i][j] == 1) {
                    return false;
                }
                if (conexiones > 2) {
                    return false;
                }
                if (matriz[i][j] == 1 && matriz[j][i] == 1) {
                    conexiones++;
                    nodos[i] = conexiones;
                }
            }
        }

        for (int i = 0; i < dim; i++) {
            if (nodos[i] != 2) {
                return false;
            }
        }

        return true;
    }

    public static void imprimirMatriz(int dim, int[][] matriz) {
        String ret = "  ";
        for (int i = 0; i < dim; i++) {
            ret += i + " ";
        }
        ret += "\n";
        for (int i = 0; i < dim; i++) {
            ret += i + " ";
            for (int j = 0; j < dim; j++) {
                ret += matriz[i][j] + " ";
            }
            ret += "\n";
        }
        System.out.println(ret);
    }

}
