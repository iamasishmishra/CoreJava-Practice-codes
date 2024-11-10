package org.jsp.springpractice;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Demo {                   //implements InitializingBean, DisposableBean {

	static {
		System.out.println("Demo class has been loaded.");
	}

	public Demo() {
		System.out.println("Demo object has been created.");
	}

//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Demo has been initialized");
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("Demo has been destroyed.");
//	}
	
	public void hii(){
		System.out.println("Demo has been initialized");
	}
	
	public void bye() {
		System.out.println("Demo has been destroyed.");
	}
	
}
