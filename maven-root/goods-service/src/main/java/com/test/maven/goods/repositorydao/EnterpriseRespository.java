package com.test.maven.goods.repositorydao;

import com.test.maven.goods.repositoryentity.EnterpriseElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface EnterpriseRespository extends ElasticsearchRepository<EnterpriseElastic, String> {



}
