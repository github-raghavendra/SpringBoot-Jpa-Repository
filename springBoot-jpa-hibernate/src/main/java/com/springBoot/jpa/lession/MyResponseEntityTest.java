package com.springBoot.jpa.lession;

import java.net.URI;

class MyResponseEntity<T> {
	
	public static MyBodyBuilder created(URI location){
		return new MyDefaultBuilder();
	}

	public interface MyBodyBuilder {
		
		// First T is input : <T>
		//Second T is output : MyResponseEntity<T>
		public <T>MyResponseEntity<T> myBody(T body);
		public MyBodyBuilder myheaders(); 
	}
	
	private static class MyDefaultBuilder implements MyBodyBuilder{

		@Override
		public <T> MyResponseEntity<T> myBody(T body) {
			return new MyResponseEntity<T>();
		}

		@Override
		public MyBodyBuilder myheaders() {
			return new MyDefaultBuilder();
		}

		

		
	}
}

public class MyResponseEntityTest {

//	public static void main(String[] args) {
//		MyResponseEntity<Object> myResponseEntity = MyResponseEntity.created(null).myheaders().myBody(null);
//		System.out.println(myResponseEntity);
//	}
}
