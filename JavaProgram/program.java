package JavaProgram;

import java.util.ArrayList;
import java.util.Scanner;

import JavaProgram.Animals.*;

public class program {
    // Получение данных от пользователя
    public static String getInfoFromUser(Scanner scan, String message) {
        System.out.print(message);
        String text = scan.nextLine();
        return text;
    }

    public static void add_animal(ArrayList<Animal> animals, String mode, Scanner scan) {
        switch (mode) {
            case "1": // кот
                animals.add(new Cat(animals.size() + 1, program.getInfoFromUser(scan, "Введите имя: "),
                        program.getInfoFromUser(scan, "Введите команды: ")));
                break;
            case "2": // собака
                animals.add(new Dog(animals.size() + 1, program.getInfoFromUser(scan, "Введите имя: "),
                        program.getInfoFromUser(scan, "Введите команды: ")));
                break;
            case "3": // хомяк
                animals.add(new Hamster(animals.size() + 1, program.getInfoFromUser(scan, "Введите имя: "),
                        program.getInfoFromUser(scan, "Введите команды: ")));
                break;
            case "4": // лошадь
                animals.add(new Horse(animals.size() + 1, program.getInfoFromUser(scan, "Введите имя: "),
                        program.getInfoFromUser(scan, "Введите команды: ")));
                break;
            case "5": // осел
                animals.add(new Donkey(animals.size() + 1, program.getInfoFromUser(scan, "Введите имя: "),
                        program.getInfoFromUser(scan, "Введите команды: ")));
                break;
        }
    }

    public static int search_id(String input_id, ArrayList<Animal> animals,  Scanner scan) {
        int id = check_id(input_id);
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int check_id(String input_id) {
        try {
            int id = Integer.parseInt(input_id);
            return id;
        } catch (Exception e) {
            System.out.println("Id должен состоять только из чисел !");
        }
        return 0;
    }
}
