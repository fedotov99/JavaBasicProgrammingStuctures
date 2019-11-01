package com.company;

public class IndexesOfMultiArray {
    int rowIndex;
    int colIndex;

    public IndexesOfMultiArray(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    @Override
    public String toString() {
        return "(" + rowIndex + ", " + colIndex + ") ";
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }
}
