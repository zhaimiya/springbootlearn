package com.vi.mapper;

import com.vi.pojo.DictCooperationRegion;
import com.vi.utils.MyMapper;

import java.util.List;
import java.util.Map;

public interface DictCooperationRegionMapper extends MyMapper<DictCooperationRegion> {
    List<DictCooperationRegion> queryByMap(Map map);
}