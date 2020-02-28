package com.vi.sort;

/**
 * 选择排序
 */
public class SelectionSort {
    public static int[] sort(int[] dataSource) {
        if (null == dataSource)
            return null;

        for (int i = 0; i < dataSource.length - 1; i++) {
            int minIndex = i + 1;
            for (int j = minIndex; j < dataSource.length - 1; j++) {
                if (dataSource[minIndex] > dataSource[j + 1]) {
                    minIndex = j+1;
                }
            }
            int temp;
            if (dataSource[i] > dataSource[minIndex]) {
                temp = dataSource[minIndex];
                dataSource[minIndex] = dataSource[i];
                dataSource[i] = temp;
            }
        }
        return dataSource;
    }
}
