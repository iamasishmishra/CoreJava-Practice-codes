package org.jsp.springpractice;

public class MyDataSource {

	private String username;
	private String password;
	private String driverClassName;
	private String url;

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

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyDataSource [username=" + username + ", password=" + password + ", driverClassName=" + driverClassName
				+ ", url=" + url + "]";
	}
	
}
