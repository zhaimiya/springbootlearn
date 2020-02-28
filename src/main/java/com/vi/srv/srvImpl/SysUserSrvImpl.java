package com.vi.srv.srvImpl;

import com.github.pagehelper.PageHelper;
import com.vi.mapper.SysUserMapper;
import com.vi.pojo.SysUser;
import com.vi.srv.SysUserSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class SysUserSrvImpl implements SysUserSrv {
    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);

    }


    @Override
    public List<SysUser> pageList(SysUser sysUser, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
//        if (!StringUtils.isEmptyOrWhitespace(sysUser.getName())) {
        criteria.andLike("name", "%" + sysUser.getName() + "%");
//        }
        System.out.println(example.toString());
        List<SysUser> list = sysUserMapper.selectByExample(example);
        System.out.println(list.toArray());
        System.out.println(list.size());
        System.out.println(list.toString());
        return list;
    }
}
