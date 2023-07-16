package JavaProgram.Animals;

public abstract class Animal {
    protected int id;
    protected String name;
    protected String commands;
    protected String classAnimal;

    protected Animal(int id, String classAnimal, String name, String commands) {
        this.id = id;
        this.classAnimal = classAnimal;
        this.name = name;
        this.commands = commands;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("id: %d Тип: %s, Кличка: %s, Команды: %s\n", id, classAnimal, name, commands);
    }

    public String setOrder(String commands) {
        return this.commands = commands;
        }
}
