package com.rakovets.course.java.core.practice.looping_statement;

/**
 * Разработать программу для бухгалтерии.
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом.
 * <p>
 * Например:
 * 1234567890 -> "1 234 567 890"
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1234567890;


        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result: %s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */
    static String convertToAccountingFormat(long amount) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        long remainAmount;
        int divider = 1000;
        String result = "";
        String space = " ";
        //Повторяющийся код - Вариант 1
        /*if (amount > 0) {
            while (amount >= divider) {
                remainAmount = amount % divider;
                amount = (amount - remainAmount) / divider;
                result = space + remainAmount + result;
            }
            return  amount  + result;
        } else {
            while (-amount >= divider) {
                remainAmount = - amount % divider;
                amount = (amount + remainAmount) / divider;
                result = space + remainAmount + result;
            }
            return amount + result;
        }*/
        // Вариант 2
        long amountModule = Math.abs(amount);
        while (amountModule >= divider) {
            remainAmount = amountModule % divider;
            amountModule = (amountModule - remainAmount) / divider;
            result = space + remainAmount + result;
        }
        if (amount >= 0) {
            return amountModule + result;
        } else {
            result = "-" + amountModule + result;
            return result;
        }
    }
}


