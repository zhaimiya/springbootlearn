package com.vi.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class InvokeTest {
    public static String getSqlStr(Object o) throws IllegalAccessException, InvocationTargetException {

        StringBuilder sql = new StringBuilder("insert into");
        Class clazz = o.getClass();
        String clazzName = clazz.getName();
        //TableName
        String tabName = clazzName.substring(clazzName.lastIndexOf("."), clazzName.length());
        sql.append(tabName).append("(");

        //获取所有方法
        Method[] methods = clazz.getDeclaredMethods();

        List<String> fieldList = new ArrayList<String>();
        List valueList = new ArrayList();
        String methodName;
        String fieldName;
        for (Method method : methods) {
            methodName = method.getName();
            if (methodName.startsWith("get") && !methodName.equals("getClass")) {
                fieldName = methodName.substring(3, methodName.length());
                fieldList.add(fieldName);
                Object res = method.invoke(o, null);
                System.out.println(res);
                if (res instanceof String) {
                    valueList.add("\"" + res + "\"");
                } else {
                    valueList.add(res);
                }
            }
        }

        int size = fieldList.size();
        //拼接sql语句字段
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                sql.append(fieldList.get(i)).append(",");
            } else {
                sql.append(fieldList.get(i)).append(") values (");
            }
        }

        //拼接sql值字段
        for (int j = 0; j < size; j++) {
            if (j < size - 1) {
                sql.append(valueList.get(j)).append(",");
            } else {
                sql.append(valueList.get(j)).append(")");
            }
        }
        return sql.toString();
    }
}
