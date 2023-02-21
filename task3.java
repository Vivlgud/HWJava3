package Java.HWork3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class task3 {

    public static ArrayList<Integer> CreateArray() {
        int sizeArray=(int) ((Math.random() * 10)+1);
        ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i = 0; i < sizeArray; i++) {
            int num=(int) (Math.random() * 10);
            array.add(num);
        }
        return array;
    }

    public static int MinValues(ArrayList<Integer> num) {
        int min = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (min > num.get(i)) {
                min = num.get(i);
            }
        }
        return min;
    }

    public static int MaxValues(ArrayList<Integer> num) {
        int max = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (max < num.get(i)) {
                max = num.get(i);
            }
        }
        return max;
    }

    public static float AverageValues(ArrayList<Integer> num) {
        float sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        return sum / num.size();
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = CreateArray();
        System.out.println("Исходный массив: "+ array);

        int min = MinValues(array);
        System.out.println("Минимальное значение: "+ min);
        int max = MaxValues(array);
        System.out.println("Максимальное значение: "+ max);
        float average = AverageValues(array);
        System.out.println("Среднее арифметическое: "+ average);
    }
    
}
