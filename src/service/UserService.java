package service;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class UserService {
    public static void checkParam(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("слишком длинный логин");
        }
        if (!(login.matches("[a-zA-Z0-9_]+"))) {
            throw new WrongLoginException("логин содержит недопустимые символы");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("слишком длинный пароль");
        }
        if (!(password.matches("[a-zA-Z0-9_]+"))) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы");
        }
        if (!(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    // метод preCheck позволяет выполнить проверку сразу всех вариантов ошибок
    public static void preCheck(String login, String password, String confirmPassword) {
        System.out.println(login + " " + password + " " + confirmPassword);
        try {
            checkParam(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {

            System.out.println(exception.getMessage());
        }
        System.out.println();
    }
}
