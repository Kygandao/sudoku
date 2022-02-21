package com.company.SudokuJava.userinterface;

import com.company.SudokuJava.domain.SudokuGameBoard;

public interface IUserInterface {

    interface EventListener {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterface.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGameBoard game);
        void showDialog(String message);
        void showError(String message)
    }
}
