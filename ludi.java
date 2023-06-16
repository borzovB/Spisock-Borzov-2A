package spisock;

public class ludi {
    private int number;
    private String name;
    private String surname;
    /*Определяем, что будет хранить наш класс, создаем поля класса.*/
    public ludi(int number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ludi{" + "number=" + number + ", name=" + name + ", surname=" + surname + '}';
    }
    /*Добавим метод стринг для вывода данных из класса, для всех полей.*/
    
    public static void main(String[] args) {
        ludi r1 = new ludi(1,"Vlad","Borzov");
        System.out.println(r1.toString());
        /*Проверяем, как класс выводит на экран своё содержимое.*/
    }
}
