package ss17_io_binary2.exercise.view;

import ss17_io_binary2.exercise.controller.MainController;
import ss17_io_binary2.exercise.exception.DuplicateIDException;

public class View {
    public static void main(String[] args) throws DuplicateIDException {
        MainController.menuController();
    }
}
