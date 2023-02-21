package Java.HWork3;
// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class task2 {

    public static ArrayList<Integer> CreateArray() {
        int sizeArray=(int) ((Math.random() * 10)+1);
        ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i = 0; i < sizeArray; i++) {
            int num=(int) (Math.random() * 10);
            array.add(num);
        }
        return array;
    }

    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                num.remove(i);
                i--;
            }
        }
        return num;
    }  

    
    
    public static void main(String[] args) {

        ArrayList<Integer> array = CreateArray();
        System.out.println("Исходный массив: "+ array);

        ArrayList<Integer> result = RemoveEven(new ArrayList<Integer>(array));
        System.out.println("Массив без четных чисел: "+ result);
    }
}        
