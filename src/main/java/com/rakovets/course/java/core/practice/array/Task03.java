package com.rakovets.course.java.core.practice.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {5, 4, 5},
                {4, 9, 4},
                {9, 4, 8}
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        int rows = marks.length;
        double[] averageMark = new double [rows];
        for (int i = 0; i < rows; i++) {
            double allSum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                allSum += marks[i][j];
                averageMark[i] = BigDecimal.valueOf(allSum / marks[i].length).setScale(2,RoundingMode.HALF_DOWN).doubleValue();
            }

        }
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMark = new int [marks.length];
        for (int i = 0; i < marks.length; i++) {
            int minNumber = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] < minNumber){
                    minNumber = marks[i][j];
            }
                minMark[i] = minNumber;
         }
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMark = new int [marks.length];
        for (int i = 0; i < marks.length; i++) {
            int maxNumber = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] > maxNumber){
                    maxNumber = marks[i][j];
                }
                maxMark[i] = maxNumber;
            }
        }
        return maxMark;
    }
}
