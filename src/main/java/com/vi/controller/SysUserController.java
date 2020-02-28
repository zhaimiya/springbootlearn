package com.vi.controller;

import com.vi.pojo.BaseProvince;
import com.vi.pojo.SysUser;
import com.vi.srv.BaseProvinceSrv;
import com.vi.srv.SysUserSrv;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/sysuser")
public class SysUserController {

    @Autowired
    private SysUserSrv sysUserSrv;

    @Autowired
    private Sid sid;

    @RequestMapping("/getuser")
    public SysUser getUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(sid.nextShort());
        sysUser.setName("mi_111");
        return sysUser;
    }

    @RequestMapping("/saveuser")
    public SysUser saveUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(sid.nextShort());
        sysUser.setName("mi_");
        sysUserSrv.saveUser(sysUser);
        return sysUser;
    }

    @RequestMapping("/pageuser")
    public List<SysUser> pageUser(Integer pageNum, Integer pageSize) {
        SysUser sysUser = new SysUser();
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 10;
        }
        return sysUserSrv.pageList(sysUser, pageNum, pageSize);
    }

    @RequestMapping("/getStrVal")
    public String getStrVal() {
        return sysUserSrv.getStrVal();
    }


}
