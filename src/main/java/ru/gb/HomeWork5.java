package ru.gb;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван Иванович", "Разработчик", "ivanov@mail.ru", "+79153652514", 75000, 33);
        persArray[1] = new Employee("Петров Петр Петрович", "Инженер", "petorv@mail.ru", "+79412365847", 70000, 48);
        persArray[2] = new Employee("Сидоров Филип Антонович", "Дизайнер", "sidorov@mail.ru", "+79145487963", 35000, 25);
        persArray[3] = new Employee("Сидоренко Анна Васильевна", "Бухгалтер", "sidorenko@mail.ru", "+79245647852", 45000, 33);
        persArray[4] = new Employee("Путин Владимир Федорович", "Директор", "putin@mail.ru", "+79025478963", 100000, 55);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].print();
            }
        }
    }
}
