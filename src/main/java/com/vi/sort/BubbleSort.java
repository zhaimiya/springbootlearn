package com.vi.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] sort(int[] datasource) {
        if(null == datasource)
            return null;
        int len = datasource.length;
        for (int i = len; i > 1; i--) {
            int temp;
            for (int j = 1; j<i ; j++) {
                if(datasource[j-1]>datasource[j]){
                    temp = datasource[j];
                    datasource[j] = datasource[j-1];
                    datasource[j-1] = temp;
                }
            }
        }
        return datasource;
    }
}
