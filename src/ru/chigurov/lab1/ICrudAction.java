package ru.chigurov.lab1;

public interface ICrudAction {
    /**
     * create - заполнение объекта случайными значениями и инкремент счётчика.
     */
    public void create();

    /**
     * read - вывод данных на экран
     */
    public void read();

    /**
     * update - ввод данных с клавиатуры
     */
    public void update();

    /**
     * delete - принудительное зануление данных в объекте и декремент счетчика
     */
    public void delete();
}
