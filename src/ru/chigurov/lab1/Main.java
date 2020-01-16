package ru.chigurov.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

     Tea tea = new Tea();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:\n" +
                "1. Создание объекта\n" +
                "2. Вывод объекта на экран\n" +
                "3. Ввод данных с клавиатуры\n" +
                "4. Принудительное зануление данных\n" +
                "5. Выход");
        int menuSelection = scanner.nextInt();
        while (menuSelection != 5){
            if (menuSelection == 1){
                tea.create();
            }
            if (menuSelection == 2){
                tea.read();
            }
            if (menuSelection == 3){
                tea.update();
            }
            if (menuSelection == 4){
                tea.delete();
            }
            menuSelection = scanner.nextInt();
        }

    }
}
