package Java.HWork3;
// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task1 {
    public static int[] SortOfMerge(int[] array) {
        int[] firstArr = Arrays.copyOf(array, array.length);
        int[] secondArr = new int[array.length];
        int[] result = SortOfMergeInner(firstArr, secondArr, 0, array.length);
        return result;
    }

    public static int[] SortOfMergeInner(int[] firstArr, int[] secondArr,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return firstArr;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = SortOfMergeInner(firstArr, secondArr, startIndex, middle);
        int[] sorted2 = SortOfMergeInner(firstArr, secondArr, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == firstArr ? secondArr : firstArr;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) {
        
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Исходный массив: "+ Arrays.toString(array));

        int[] result = SortOfMerge(array);
        System.out.println("Результат сортировки: "+Arrays.toString(result));
    }
}

   