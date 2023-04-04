package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number; //номер операции
        String delete_numberOrWord;
        List<String> list = new LinkedList<>();
        list.add("Добавить");
        list.add("Показать");
        list.add("Удалить");
        List<String> buy = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите одну из операций: 1)добавить, 2)показать, 3)удалить");
            number = scanner.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("Какую покупку хотите добавить?");
                    buy.add(scanner.next());
                    break;
                }
                case 2: {
                    print(buy);
                    break;
                }
                case 3: {
                    print(buy);
                    System.out.println("Какую покупку хотите удалить? Введите номер или название");
                    delete_numberOrWord = scanner.next();

                    try {
                        int toNumber = Integer.parseInt(delete_numberOrWord) - 1;
                        buy.remove(toNumber);
                    } catch (Exception ex) {
                        buy.remove(delete_numberOrWord);
                    }
                    break;
                }
                default:
                    System.out.println("Такой команды не существует");
            }
        }
    }

    public static void print(List<String> buy) {
        System.out.println("Список покупок: ");
        for (int i = 0; i < buy.size(); i++) {
            int c = i + 1;
            System.out.println(c + ". " + buy.get(i));
        }
    }
}
