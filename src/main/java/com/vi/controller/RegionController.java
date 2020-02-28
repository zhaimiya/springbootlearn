package com.vi.controller;

import com.vi.pojo.BaseProvince;
import com.vi.pojo.SysUser;
import com.vi.srv.*;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/region")
public class RegionController {
    @Autowired
    private BaseProvinceSrv baseProvinceSrv;

    @Autowired
    private BaseCitySrv baseCitySrv;

    @Autowired
    private BaseCountySrv baseCountySrv;

    @Autowired
    private BaseTownSrv baseTownSrv;

    @Autowired
    private Sid sid;

    @Autowired
    private SysUserSrv sysUserSrv;

    @RequestMapping("/testtrsation")
    public String testTrasation() {
        baseProvinceSrv.testTrsati();
        return "AAA";
    }

    @RequestMapping("/genprovincedata")
    public String genProvinceData() {
        baseProvinceSrv.genProvinceData();
        return "Province Data OK";
    }

    @RequestMapping("/gencitydata")
    public String genCityData() {
        baseCitySrv.genCityData();
        return "City Data OK";
    }

    @RequestMapping("/gencountydata")
    public String genCountyData() {
        baseCountySrv.genCountyData();
        return "Country Data OK";
    }


    @RequestMapping("/genctowndata")
    public String genTownData() {
        baseTownSrv.genTownData();
        return "town Data OK";
    }


}
