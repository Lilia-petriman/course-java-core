package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате 'dd/MM/yyyy'. В профиле игрока необходимо
 * месяц выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 */
class Task05 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte monthNumber = 1;

        String monthName = getMonthName(monthNumber);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getMonthName(byte monthNumber) {
        String Month;
        if( monthNumber == 1 ){
            Month = "JANUARY";
        } else if ( monthNumber == 2 ){
            Month = "FEBRUARY";
        } else if (monthNumber == 3){
            Month = "MARCH";
        } else if (monthNumber == 4){
            Month = "APRIL";
        } else if (monthNumber == 5){
            Month = "MAY";
        }else if (monthNumber == 6){
            Month = "JUNE";
        }else if (monthNumber == 7){
            Month = "JULY";
        }else if (monthNumber == 8){
            Month = "AUGUST";
        }else if (monthNumber == 9){
            Month = "SEPTEMBER";
        }else if (monthNumber == 10){
            Month = "OCTOBER";
        }else if (monthNumber == 11){
            Month = "NOVEMBER";
        }else if (monthNumber == 12){
            Month = "DECEMBER";
        }else  Month = null;
        return  Month;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
    }
}
