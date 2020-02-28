package com.vi.srv.srvImpl;

import com.vi.mapper.BaseCityMapper;
import com.vi.mapper.BaseProvinceMapper;
import com.vi.mapper.DictCooperationRegionMapper;
import com.vi.pojo.BaseCity;
import com.vi.pojo.BaseProvince;
import com.vi.pojo.DictCooperationRegion;
import com.vi.srv.BaseCitySrv;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class BaseCitySrvImpl implements BaseCitySrv {
    @Autowired(required = false)
    private BaseProvinceMapper baseProvinceMapper;

    @Autowired(required = false)
    private DictCooperationRegionMapper dictCooperationRegionMapper;

    @Autowired(required = false)
    private BaseCityMapper baseCityMapper;

    @Autowired
    private Sid sid;

    @Override
    public void genCityData(){
        List<BaseProvince> list = baseProvinceMapper.selectAll();
        for (BaseProvince baseProvince : list) {
            Example example = new Example(DictCooperationRegion.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andLike("code",baseProvince.getProvinceId().toString().substring(0,2)+"%");
            List<DictCooperationRegion> provinces = dictCooperationRegionMapper.selectByExample(example);
            for (DictCooperationRegion dicprovince : provinces) {
                Example cityexample = new Example(BaseCity.class);
                Example.Criteria citycriteria = cityexample.createCriteria();
                citycriteria.andEqualTo("provinceId",dicprovince.getProvinceId());
                List<BaseCity> baseCities = baseCityMapper.selectByExample(cityexample);
                for (BaseCity baseCity : baseCities) {
                    DictCooperationRegion dictcity = new DictCooperationRegion();
                    dictcity.setId(sid.nextShort());
                    dictcity.setPid(dicprovince.getProvinceId());
                    dictcity.setAllName(dicprovince.getAllName()+"-"+baseCity.getCityName());
                    dictcity.setCode(baseCity.getCityId().toString());
                    dictcity.setNodeName(baseCity.getCityName());
                    dictcity.setProvinceId(dicprovince.getProvinceId());
                    dictcity.setProvinceName(dicprovince.getProvinceName());
                    dictcity.setCityId(baseCity.getCityId().toString());
                    dictcity.setCity(baseCity.getCityName());
                    dictCooperationRegionMapper.insert(dictcity);
                }
            }
        }
    }



}
