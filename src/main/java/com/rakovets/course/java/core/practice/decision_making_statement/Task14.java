package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        //int day = 12;
        //int month = 12;
        int year = 1989;

        String monthName = getZodiacYearName (year);
        System.out.printf("Result: %s", year);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     //* @param day   число дня рождения
     //* @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int chinesCalendar = year % 12;
        String myYear;
        switch (chinesCalendar) {
            case  0 :
                myYear = "Monkey";
                break;
            case  1 :
                myYear = "Rooster";
                break;
            case  2 :
                myYear = "Dog";
                break;
            case  3 :
                myYear = "Pig";
                break;
            case  4 :
                myYear = "Rat";
                break;
            case  5 :
                myYear = "Ox";
                break;
            case  6 :
                myYear = "Tiger";
                break;
            case  7 :
                myYear = "Rabbit";
                break;
            case  8 :
                myYear = "Dragon";
                break;
            case  9 :
                myYear = "Snake";
                break;
            case  10 :
                myYear = "Horse";
                break;
            case  11 :
                myYear = "Ram";
                break;
            default : myYear = null;
        }
        return myYear;
    }
}
