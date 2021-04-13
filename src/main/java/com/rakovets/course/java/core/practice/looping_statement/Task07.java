package com.rakovets.course.java.core.practice.looping_statement;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для фитнес браслета.
 *
 * @author Dmitry Rakovets
 */
class Task07 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startDistance = 1000;
        int finishDistance = 40000;
        double dailyProgress = 5;

        double totalDistance = calculateTotalDistance(startDistance, finishDistance, dailyProgress);
        System.out.printf("Result: %f", totalDistance);
    }

    /**
     * Рассчитывает пробег (т.е дистанцию, которую пробежал спортсмен за все тренировки), который совершит спортсмен
     * при подготовке к марафону.
     *
     * @param startDistance             дистанция которую пробегает спортсмен до начала тренировки
     * @param finishDistance            дистанция которую желает пробежать спортсмен после окончания тренировок
     * @param dailyProgressAsPercentage ежедневный прогресс в процентах по отношению к предыдущему забегу
     * @return пробег (с точностью до 2 знаков после десятичного разделителя)
     */
    static double calculateTotalDistance(int startDistance, int finishDistance, double dailyProgressAsPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double distance = 0.0;
        double start = (double) startDistance;
        double end = (double) finishDistance;
        if (start > 0) {
            while (start <= end) {
                start = start + start * dailyProgressAsPercentage / 100;
                distance += start;
            }
            return BigDecimal.valueOf(distance).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        } else {
            distance = 0.0;
            return distance;
        }

    }
}
//Корректно ли сделано приведение***
