package com.test.maven.goods.server.config;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

@Configuration
@MapperScan("com.test.maven.goods.server.dao")
public class MybatisConfig {

	/**
	 * 配置mybatis的分页插件pageHelper
	 * @return
	 */
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql"); 
		pageHelper.setProperties(properties);
		return pageHelper;
	}
	

}
