package com.test.maven.goods.server.service.Impl;

import com.test.common.entity.Enterprise;
import com.test.common.entity.EnterpriseExample;
import com.test.common.result.CommonPage;
import com.test.maven.goods.server.dao.EnterpriseMapper;
import com.test.maven.goods.server.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {


    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Override
    public List<Enterprise> list(CommonPage page) {
        List<Enterprise> enterprises = enterpriseMapper.selectByExample(new EnterpriseExample());
        return enterprises;
    }
}
