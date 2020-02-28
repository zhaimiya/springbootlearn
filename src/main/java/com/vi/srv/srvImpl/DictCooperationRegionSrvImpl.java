package com.vi.srv.srvImpl;

import com.vi.mapper.DictCooperationRegionMapper;
import com.vi.pojo.DictCooperationRegion;
import com.vi.srv.DictCooperationRegionSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DictCooperationRegionSrvImpl implements DictCooperationRegionSrv {
    @Autowired(required = false)
    private DictCooperationRegionMapper dictCooperationRegionMapper;

    @Override
    public void save(DictCooperationRegion d) {
        dictCooperationRegionMapper.insert(d);
    }

    public List<DictCooperationRegion> queryByMap(Map map){
        return dictCooperationRegionMapper.queryByMap(map);
    }

}
