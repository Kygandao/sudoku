package com.company.SudokuJava.domain;

import java.io.Serializable;

public class SudokuGameBoard implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGameBoard(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
