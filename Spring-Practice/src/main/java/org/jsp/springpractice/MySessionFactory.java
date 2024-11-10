package org.jsp.springpractice;

import java.util.List;
import java.util.Properties;

public class MySessionFactory {

	private MyDataSource dataSource;
	private List<String> mappingResouces;
	private Properties hibernateProperties;

	public MyDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<String> getMappingResouces() {
		return mappingResouces;
	}

	public void setMappingResouces(List<String> mappingResouces) {
		this.mappingResouces = mappingResouces;
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

}
