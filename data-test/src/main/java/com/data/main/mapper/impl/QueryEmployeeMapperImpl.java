package com.data.main.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.data.main.dataSource.daoExtendsUtile;
import com.data.main.entity.EMPLOYEE_INFORMATIONS_E;
import com.data.main.mapper.QueryEmployeeMappers;

@Service
@Repository
public class QueryEmployeeMapperImpl extends daoExtendsUtile implements QueryEmployeeMappers{

    @Override
    public EMPLOYEE_INFORMATIONS_E queryssqodao() {
        // TODO Auto-generated method stub
        EMPLOYEE_INFORMATIONS_E eMPLOYEE_INFORMATIONS_E = new EMPLOYEE_INFORMATIONS_E();
        String xmlid = "com.data.main.mapper.queryssoimpl.queryssqodao";
        List<EMPLOYEE_INFORMATIONS_E> list = new ArrayList<>();
        list = this.getSqlSession().selectList(xmlid);
        return eMPLOYEE_INFORMATIONS_E;
    }


}
