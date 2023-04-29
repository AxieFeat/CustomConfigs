package me.axiefeat.Api;

public class FileNotFoundException extends Exception {
    public FileNotFoundException(String file) {
        super("Ошибка при получении " + file + " в .jar файле");
    }
}
