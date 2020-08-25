package com.project.minesweeper.model;

public enum Difficulty {

    BEGINNER(9, 9, 10),
    INTERMEDIATE(16, 16 , 40),
    ADVANCED(24, 24, 99);

    protected final int width;
    protected final int height;
    protected final int mineCount;

    Difficulty(int width, int height, int mineCount) {
        this.width = width;
        this.height = height;
        this.mineCount = mineCount;
        
    }
}
