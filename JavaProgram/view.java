package JavaProgram;
import java.util.ArrayList;

import JavaProgram.Animals.Animal;

public class view {

    public static void chooseMode() {
        System.out.println("'1' - Запись нового животного, \n" +
                "'2' - Вывести количество животных, \n" +
                "'3' - Вывести базу животных, \n" +
                "'4' - Вывести определенного животного, \n" +
                "'5' - Обучить новым командам, \n" +
                "'6' - Выход из программы. \n");
    }

    public static void chooseAnimal() {
        System.out.println("'1' - кот \n" +
                "'2' - собака\n" +
                "'3' - хомяк \n" +
                "'4' - лошадь \n" +
                "'5' - осел");
    }

    public static void get_base(ArrayList<Animal> animals) {
        if (animals.isEmpty() == false) {
            for (Animal animal : animals) {
                System.out.println(animal.toString());
                // byte bytes[] = animal.getBytes("windows-1251");
                // String value = URLEncoder.encode(new String(bytes, "UTF-8"), "UTF-8");
            }
        } else {
            System.out.println("Животных нету");
        }
    }
}
