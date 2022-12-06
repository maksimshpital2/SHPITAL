package Task1;

import java.util.Random;

abstract class Graph {
    public static void main(String[] args) {
        Random random = new Random();
        int vertexCount = random.nextInt(101);
        int[][] g = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (i == j) {
                    g[i][j] = 0;
                } else {
                    if (Math.random() >= 0.5) {
                        g[i][j] = 1;
                        g[j][i] = 1;
                    } else {
                        g[i][j] = 0;
                        g[j][i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.print("\n");
        }
        int amount = 0;
        int a = 0;
        for (int i = 0; i < vertexCount; i++) {
            for (int j = a; j < vertexCount; j++) {
                if (g[i][j] == 1) {
                    amount++;
                }
            }
            a++;
        }
        System.out.print(amount);
    }
}
