package Home_work_5;

public class Main {
    public static void main(String[] args) {

        //Массив из 5 сотрудников.
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Генеральный директор", "IvanovIV@mail.ru", "+7999-888-77-66", 500000, 45);
        persArray[1] = new Person("Иванова Елена Евгеньевна", "Директор HR", "IvanovaEE@mail.r", "+7-999-777-66-55", 300000, 40);
        persArray[2] = new Person("Дмитриев Дмитрий Дмитриевич", "Директор по развитию", "DmitrievDD@mail.ru", "+7-999-666-55-44", 400000, 42);
        persArray[3] = new Person("Дмитриева Диана Борисовна", "Разработчик", "DmitrievaDB@mail.ru", "+7-999-555-44-33", 220000, 31);
        persArray[4] = new Person("Смирнов Сергей Сергеевич", "Начальник охраны", "SmirnovSS@mail.ru", "+7-999-444-33-22", 200000, 55);

        //Цикл для вывода информации о сотрудниках старше 40 лет
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].printInfo();
            }
        }
    }
}
