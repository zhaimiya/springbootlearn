package com.vi.srv.srvImpl;

import com.vi.mapper.BaseProvinceMapper;
import com.vi.pojo.BaseProvince;
import com.vi.pojo.DictCooperationRegion;
import com.vi.pojo.SysUser;
import com.vi.srv.BaseProvinceSrv;
import com.vi.srv.DictCooperationRegionSrv;
import com.vi.srv.SysUserSrv;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BaseProvinceSrvImpl implements BaseProvinceSrv {
    @Autowired(required = false)
    private BaseProvinceMapper baseProvinceMapper;
    @Autowired
    private DictCooperationRegionSrv dictCooperationRegionSrv;
    @Autowired
    private Sid sid;

    @Autowired
    private SysUserSrv sysUserSrv;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(BaseProvince t) {
        baseProvinceMapper.insert(t);
        throw new RuntimeException("111111111111111");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testTrsati() {
        SysUser user = new SysUser();
        user.setId(sid.nextShort());
        user.setName("翟米雅");
        sysUserSrv.saveUser(user);

        BaseProvince t = new BaseProvince();
        t.setId(sid.nextShort());
        t.setProvinceId(999L);
        t.setProvinceName("加油加油!");

        try {
            this.save(t);
        }catch (Exception e){
            System.out.println("LLLLLL");
        }



    }

    @Override
    public void genProvinceData() {
        List<BaseProvince> province = baseProvinceMapper.selectAll();
        for (BaseProvince baseProvince : province) {
            DictCooperationRegion dic = new DictCooperationRegion();
            dic.setProvinceId(baseProvince.getProvinceId().toString());
            dic.setProvinceName(baseProvince.getProvinceName());
            dic.setCode(baseProvince.getProvinceId().toString());
            dic.setAllName(baseProvince.getProvinceName());
            dic.setNodeName(baseProvince.getProvinceName());
            dic.setPid("0");
            dic.setId(sid.nextShort());
            dictCooperationRegionSrv.save(dic);
        }
    }
}
