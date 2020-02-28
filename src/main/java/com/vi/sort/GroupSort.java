package com.vi.sort;

public class GroupSort {
    public static int[] sort(int[] dataSource) {
        if (null == dataSource)
            return null;
        int len = dataSource.length;
        int increace = len / 2;
        int count = 1;
        for (; increace > 0; increace /= 2) {
            for ( int i = count*(increace+1); i < len; i=i+increace,count++) {
                int minVal = dataSource[i]; //值
                int j = i; // 下标
                for (; j >j-increace; j=j-increace) {
                    if (minVal > dataSource[j - increace]) {
                        dataSource[j] = dataSource[j - increace];
                    }
                }
                dataSource[j] = minVal;
            }
        }


        return dataSource;
    }

    public static int[] shellSort(int[] dataSource) {
        int h = 1;
        while(h<dataSource.length/3){
            h = 3*h+1;
        }
        int gap = h;
        for(;gap>0;gap = (gap-1)/3){
            for(int i=gap;i<dataSource.length;i++){
                for(int j = i;j>gap-1;j=j-gap){
                    if(dataSource[j]<dataSource[j-gap]){
                     swap(dataSource,j,j-gap);
                    }
                }
            }
        }
        return dataSource;
    }

    public  static  void swap(int[] dataSource,int x,int y){
        int temp = dataSource[x];
        dataSource[x] =  dataSource[y];
        dataSource[y] = temp;
    }
}
