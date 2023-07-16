package JavaProgram;

// 1. Написать программу, имитирующую работу реестра домашних животных.

//     Функционал 
//     a. Завести новое животное
//     б. определять животное в правильный класс
//     в. увидеть список команд, которое выполняет животное
//     г. обучить животное новым командам 

// 1. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int 
// переменной̆ на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа 
// можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа 
// счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, 
// если при заведения животного заполнены все поля.
// - Вообще можно просто проигнорировать try-with-resources и просто добавить возможность добавления нового животного.
// Условно у Вас есть какой-то функционал и я пишу в консоль "3"(Этот пункт будет отвечать за добавление нового животного), 
// после этого мне к примеру выдается список всех животных, чтобы я выбрал кого именно я хочу добавить, а далее я уже заполняю 
// информацию по данному животному
import java.util.ArrayList;
import java.util.Scanner;

import JavaProgram.Animals.*;

public class main {
    
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        try (Scanner scan = new Scanner(System.in, "UTF-8");
                Counter counter = new Counter()) {
            boolean run = true;
            while (run) {
                view.chooseMode();
                String mode = program.getInfoFromUser(scan, "Выберите режим: ");
                switch (mode) {
                    case "1": // Запись нового животного
                        view.chooseAnimal();
                        String choose_animal = program.getInfoFromUser(scan, "Выберите животное: ");
                        program.add_animal(animals, choose_animal, scan);
                        counter.add();
                        break;
                    case "2": // Вывести количество животных
                        System.out.println(counter.getSum());
                        break;
                    case "3": // Вывести базу животных
                        view.get_base(animals);
                        break;
                    case "4": // Вывести определенного животного
                        int id = program.search_id(program.getInfoFromUser(scan, "Введите id животного: "),
                                animals, scan);
                        if (id != -1) {
                            System.out.println(animals.get(id).toString());
                        } else {
                            System.out.println("Животного с таким id нет !");
                        }
                        break;
                    case "5": // Обучить новым командам
                        int find_id = program.search_id(program.getInfoFromUser(scan, "Введите id животного: "),
                                animals, scan);
                        if (find_id != -1){
                            animals.get(find_id).setOrder(program.getInfoFromUser(scan, "Введите команды:"));
                        } else {
                            System.out.println("Животного с таким id нет !");
                        }
                        break;
                    case "6": // Выход из программы
                        run = false;
                        break;
                }
            }
        }
    }
}