package Task5;

import java.util.Arrays;

public class Matrix<T> {
    private T[][] arr;
    private int columns;
    private int lines;

    Matrix(int columns, int lines, T[][] arr) {
        this.lines = lines;
        this.columns = columns;
        this.arr = arr;
    }

    Matrix(int columns, int lines) {
        this.lines = lines;
        this.columns = columns;
    }

    Matrix(T[][] arr) {
        this.arr = arr;
        this.lines = arr.length;
        this.columns = arr[0].length;
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public T[][] getArr() {
        return arr;
    }

    public Matrix<Double> sum(Matrix<Double> b) {
        Double[][] a = new Double[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = 0.0;
            }
        }
        Matrix<Double> c = new Matrix<>(lines, columns, a);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                c.getArr()[i][j] = (Double) arr[i][j] + b.getArr()[i][j];
            }
        }
        return c;
    }

    public Matrix<Double> mulByN(int b) {
        Double[][] a = new Double[lines][columns];
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                a[i][j] = 0.0;
            }
        }
        Matrix<Double> c = new Matrix<>(lines, columns, a);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                c.getArr()[i][j] = (Double) arr[i][j] * b;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        System.out.println("Матрица:");
        return Arrays.deepToString(this.arr);
    }
}