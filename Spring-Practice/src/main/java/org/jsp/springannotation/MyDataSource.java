package org.jsp.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {

	@Value(value="${dbuser.name}")
	private String username;
	@Value(value="${dbuser.password}")
	private String password;
	@Value(value="${dbuser.url}")
	private String url;
	@Value(value="${dbuser.driverName}")
	private String driverClassName;
	
	@Value(value="${hibernate.mappingResouce}")
	private String mappingResource;
	@Value(value="${hibernate.hbm2ddl_auto}")
	private String hbm2ddl_auto;
	@Value(value="${hibernate.dialect}")
	private String dialect;
	@Value(value="${hibernate.format_sql}")
	private String format_sql;
	@Value(value="${hibernate.show_sql}")
	private String show_sql;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getMappingResource() {
		return mappingResource;
	}

	public void setMappingResource(String mappingResource) {
		this.mappingResource = mappingResource;
	}

	public String getHbm2ddl_auto() {
		return hbm2ddl_auto;
	}

	public void setHbm2ddl_auto(String hbm2ddl_auto) {
		this.hbm2ddl_auto = hbm2ddl_auto;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getFormat_sql() {
		return format_sql;
	}

	public void setFormat_sql(String format_sql) {
		this.format_sql = format_sql;
	}

	public String getShow_sql() {
		return show_sql;
	}

	public void setShow_sql(String show_sql) {
		this.show_sql = show_sql;
	}

	
	public void display() {
		System.out.println("Username : " + username);
		System.out.println("password : " + password);
		System.out.println("url : " + url);
		System.out.println("driverClassName : " + driverClassName);
		System.out.println("mappingResource : " + mappingResource);
		System.out.println("hbm2ddl_auto : " + hbm2ddl_auto);
		System.out.println("dialect : " + dialect);
		System.out.println("format_sql : " + format_sql);
		System.out.println("show_sql : " + show_sql);
		
	}

}
