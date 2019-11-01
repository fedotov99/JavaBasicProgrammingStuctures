package com.company;

public class IndexesOfMaxElementsInMultiArrays {
    int rowIndex;
    int colIndex;

    public IndexesOfMaxElementsInMultiArrays(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    @Override
    public String toString() {
        return "(" + rowIndex + ", " + colIndex + ") ";
    }
}
