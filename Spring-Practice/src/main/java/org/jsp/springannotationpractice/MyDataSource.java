package org.jsp.springannotationpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {

	@Value(value = "${dbuser.name}")
	private String username;
	@Value(value = "${dbuser.password}")
	private String password;
	@Value(value = "${dbuser.url}")
	private String url;
	@Value(value = "${dbuser.driverName}")
	private String driverClassName;

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

	@Override
	public String toString() {
		return "MyDataSource [username=" + username + ", password=" + password + ", url=" + url + ", driverClassName="
				+ driverClassName + "]";
	}
	
	
}
