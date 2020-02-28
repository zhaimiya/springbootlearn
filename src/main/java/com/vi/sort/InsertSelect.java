package com.vi.sort;

/**
 * 直接插入排序
 */
public class InsertSelect {
    public static int[] sort(int[] dataSource) {
        if (null == dataSource)
            return null;

        for (int i = 1; i < dataSource.length; i++) {
            int index = i;
            int min = dataSource[index]; //无序第一个
            for (; index > 0; index--) {
                if (min < dataSource[index - 1]) {
                    dataSource[index] = dataSource[index - 1];
                }
            }
            dataSource[index] = min;
        }
        return dataSource;
    }
}
