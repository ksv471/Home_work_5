package Home_work_5;

//Класс "Сотрудник"
public class Person {

    private  String FIO; //ФИО
    private  String position; //должность
    private  String email; //e-mail
    private  String telephone; //телефон
    private  int salary; //зарплата
    private  int age; //возраст

    //Конструктор класса
    public Person(String FIO, String position, String email, String telephone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }
    //Метод, который выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println("ФИО " + FIO + " e-mail " + email + " телефон " + telephone + " зарплата " + salary + " возраст " + age);
    }
}