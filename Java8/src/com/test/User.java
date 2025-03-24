package com.test;

import java.util.Optional;

public class User {
	public static void main(String[] args) {
		/*
		 * User u =new User(); String name = u.getName(102);
		 * System.out.println(name.length());
		 */
		User u =new User();
		Optional<String> name = u.getName(100);
		if(name.isPresent()) {
			String data=name.get();
			System.out.println(data.length());
		}
		
		

}
	
/*
 * String getName(Integer id){ if(id==100) { return "siva"; }else if(id==101){
 * return "ram";
 * 
 * }else if(id==102) { return "satish"; }else { return null; }
 */
		Optional <String> getName(Integer id){
			String name="";
			if(id==100) {
				name= "siva";
			}else if(id==101){
				name= "ram";
				
			}else if(id==102) {
				name=  "satish";
			}
				return Optional.ofNullable(name);
			}

		public String getUsernameById(int userid) {
			// TODO Auto-generated method stub
			return null;
		}
			
		
		
		
	}
	
	

