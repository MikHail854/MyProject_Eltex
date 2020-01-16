package ru.chigurov.lab1;

public interface ICrudAction {
    /**
     * create - заполнение объекта случайными значениями и инкремент счётчика.
     * read - вывод данных на экран
     * update - ввод данных с клавиатуры
     * delete - принудительное зануление данных в объекте и декремент счетчика
     */

    void create();

    void read();

    void update();

    void delete();
}
