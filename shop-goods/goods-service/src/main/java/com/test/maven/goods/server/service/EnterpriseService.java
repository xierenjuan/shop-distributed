package com.test.maven.goods.server.service;

import com.test.common.entity.Enterprise;
import com.test.common.result.CommonPage;

import java.util.List;

public interface EnterpriseService {


    List<Enterprise> list(CommonPage page);
}
