package com.data.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.main.entity.EMPLOYEE_INFORMATIONS_E;
import com.data.main.mapper.QueryEmployeeMappers;
import com.data.main.service.queysso;

@Service
public class queryssoimpl implements queysso {

    @Autowired
    QueryEmployeeMappers queryEmployeeMapper;
    
    /***
     * 接口实现类,业务处理层
     */
    @Override
    public String querySSoservice() {
        // TODO Auto-generated method stub
        System.out.println("qwert");
        EMPLOYEE_INFORMATIONS_E eMPLOYEE_INFORMATIONS_E = new EMPLOYEE_INFORMATIONS_E();
        eMPLOYEE_INFORMATIONS_E = queryEmployeeMapper.queryssqodao();
        System.out.println("eMPLOYEE_INFORMATIONS_E---------:"+eMPLOYEE_INFORMATIONS_E);
        return eMPLOYEE_INFORMATIONS_E.toString();
    }

}
