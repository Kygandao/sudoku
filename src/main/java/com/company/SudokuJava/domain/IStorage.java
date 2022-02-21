package com.company.SudokuJava.domain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGameBoard game) throws IOException;
    SudokuGameBoard getGameData() throws IOException;
}
