package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printErrorInfo() {
        System.out.println("Ошибка активна? " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printErrorInfo();
        Error error2 = new Error(true, 404, "Страница не найдена");
        error2.printErrorInfo();
        Error error3 = new Error(false, 777, "Неизвестная ошибка");
        error3.printErrorInfo();
    }
}
