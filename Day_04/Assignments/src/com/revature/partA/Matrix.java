/*Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object.
The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices*/

package com.revature.partA;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.columns != m2.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                result.setElement(i, j, m1.elements[i][j] + m2.elements[i][j]);
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.columns != m2.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix result = new Matrix(m1.rows, m2.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                for (int k = 0; k < m1.columns; k++) {
                    result.elements[i][j] += m1.elements[i][k] * m2.elements[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(2, 3);
        Matrix addedMatrix = Matrix.add(matrix1, matrix2);
        if (addedMatrix != null) {
            System.out.println("Added Matrix:");
            addedMatrix.printMatrix();
        }
        Matrix matrix3 = new Matrix(3, 2);
        Matrix multipliedMatrix = Matrix.multiply(matrix1, matrix3);
        if (multipliedMatrix != null) {
            System.out.println("Multiplied Matrix:");
            multipliedMatrix.printMatrix();
        }
    }
}

