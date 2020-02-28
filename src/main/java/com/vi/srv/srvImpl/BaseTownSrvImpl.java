package com.vi.srv.srvImpl;

import com.vi.mapper.*;
import com.vi.pojo.BaseCity;
import com.vi.pojo.BaseCounty;
import com.vi.pojo.BaseTown;
import com.vi.pojo.DictCooperationRegion;
import com.vi.srv.BaseTownSrv;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class BaseTownSrvImpl implements BaseTownSrv {
    @Autowired(required = false)
    private BaseProvinceMapper baseProvinceMapper;

    @Autowired(required = false)
    private DictCooperationRegionMapper dictCooperationRegionMapper;

    @Autowired(required = false)
    private BaseCountyMapper baseCountyMapper;

    @Autowired(required = false)
    private BaseCityMapper baseCityMapper;

    @Autowired(required = false)
    private BaseTownMapper baseTownMapper;

    @Autowired
    private Sid sid;


    @Override
    public void genTownData() {
        List<BaseCity> list = baseCityMapper.selectAll();//市
        for (BaseCity city : list) {
            new Thread() {
                public void run() {
                    Example example = new Example(DictCooperationRegion.class);
                    Example.Criteria criteria = example.createCriteria();
                    criteria.andEqualTo("pid", city.getCityId());
                    List<DictCooperationRegion> countries = dictCooperationRegionMapper.selectByExample(example);//（区）/县
                    for (DictCooperationRegion dicCounty : countries) {
                        initByCounty(dicCounty);
                    }
                }
            }.start();
        }
    }

    public void initByCounty(DictCooperationRegion dicCounty) {
        Example example = new Example(BaseTown.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("countyId", dicCounty.getCountyId());
        List<BaseTown> towns = baseTownMapper.selectByExample(example);//乡
        for (BaseTown inst : towns) {
            DictCooperationRegion dicTown = new DictCooperationRegion();
            dicTown.setId(sid.nextShort());
            dicTown.setPid(dicCounty.getCountyId());
            dicTown.setAllName(dicCounty.getAllName() + "-" + inst.getTownName());
            dicTown.setCode(inst.getTownId().toString());
            dicTown.setNodeName(inst.getTownName());
            dicTown.setProvinceId(dicCounty.getProvinceId());
            dicTown.setProvinceName(dicCounty.getProvinceName());
            dicTown.setCityId(dicCounty.getCityId());
            dicTown.setCity(dicCounty.getCountyName());
            dicTown.setCountyId(dicCounty.getCountyId());
            dicTown.setCountyName(dicCounty.getCountyName());
            dicTown.setTownId(inst.getTownId().toString());
            dicCounty.setTownName(inst.getTownName());
            dictCooperationRegionMapper.insert(dicTown);
        }
    }

}
