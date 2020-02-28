package com.vi.srv.srvImpl;

import com.vi.mapper.BaseCityMapper;
import com.vi.mapper.BaseCountyMapper;
import com.vi.mapper.BaseProvinceMapper;
import com.vi.mapper.DictCooperationRegionMapper;
import com.vi.pojo.BaseCity;
import com.vi.pojo.BaseCounty;
import com.vi.pojo.BaseProvince;
import com.vi.pojo.DictCooperationRegion;
import com.vi.srv.BaseCitySrv;
import com.vi.srv.BaseCountySrv;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class BaseCountySrvImpl implements BaseCountySrv {
    @Autowired(required = false)
    private BaseProvinceMapper baseProvinceMapper;

    @Autowired(required = false)
    private DictCooperationRegionMapper dictCooperationRegionMapper;

    @Autowired(required = false)
    private BaseCountyMapper baseCountyMapper;

    @Autowired(required = false)
    private  BaseCityMapper baseCityMapper;

    @Autowired
    private Sid sid;


    @Override
    public void genCountyData() {
        List<BaseProvince> list = baseProvinceMapper.selectAll();//省
        for (BaseProvince baseProvince : list) {
            new Thread() {
                public void run() {
                    Example example = new Example(DictCooperationRegion.class);
                    Example.Criteria criteria = example.createCriteria();
                    criteria.andEqualTo("pid", baseProvince.getProvinceId());
                    List<DictCooperationRegion> BaseCities = dictCooperationRegionMapper.selectByExample(example);//（区）/县
                    for (DictCooperationRegion baseCity : BaseCities) {
                        initByProvince(baseCity);
                    }
                }
            }.start();
        }
    }

    public void initByProvince(DictCooperationRegion city) {
        Example example = new Example(BaseCounty.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("cityId", city.getCityId());
        List<BaseCounty> BaseCounties = baseCountyMapper.selectByExample(example);//（区）/县
        for (BaseCounty inst : BaseCounties) {
            DictCooperationRegion dictCounty = new DictCooperationRegion();
            dictCounty.setId(sid.nextShort());
            dictCounty.setPid(city.getCityId().toString());
            dictCounty.setAllName(city.getAllName() + "-" + inst.getCountyName());
            dictCounty.setCode(inst.getCountyId().toString());
            dictCounty.setNodeName(inst.getCountyName());
            dictCounty.setProvinceId(city.getProvinceId().toString());
            dictCounty.setProvinceName(city.getProvinceName());
            dictCounty.setCityId(inst.getCityId().toString());
            dictCounty.setCity(inst.getCountyName());
            dictCounty.setCountyId(inst.getCountyId().toString());
            dictCounty.setCountyName(inst.getCountyName());
            dictCooperationRegionMapper.insert(dictCounty);
        }
    }

}
