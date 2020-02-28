package com.vi.srv;

import com.vi.pojo.BaseProvince;

public interface BaseProvinceSrv {
     void genProvinceData();
     void save(BaseProvince t);
     void testTrsati();

     default String getAAA(){
          return  "NAME";
     }
}
