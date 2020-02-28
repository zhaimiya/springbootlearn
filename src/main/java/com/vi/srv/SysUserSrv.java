package com.vi.srv;

import com.vi.pojo.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserSrv {

     void saveUser(SysUser sysUser);

     List<SysUser> pageList(SysUser sysUser,Integer startPage,Integer pageSize);

    default String getStrVal(){
         return  "Hello Tomorrow";
    }

}
