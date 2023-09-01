package com.main;

import java.util.List;
import java.util.Scanner;

//import com.dao.Logindao;
import com.dao.LogindaoImpl;
import com.exception.LoginException;
import com.model.User;

import cm.service.LoginService;
import cm.service.LoginServiceImpl;

public class LoginApp {

	public static void main(String[] args) throws LoginException {
		LogindaoImpl.getConnection();
		LoginService loginservice=new LoginServiceImpl();
		
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("enter a userId: ");
		  int id=sc.nextInt(); 
//		  System.out.println("Enter a username: "); 
//		  String name=sc.next(); 
//		  System.out.println("Enter a password: "); 
//		  String pwd=sc.next(); 
		  //User user=new User(); 
		  //user.setUserName(name);
		  //user.setPassword(pwd); 
		  //user.setUserId(id);
		
		/*
		 * try { User userDetails=loginservice.createUser(user); if(userDetails!=null) {
		 * System.out.println(userDetails.getUserName()+", "+userDetails.getPassword());
		 * }
		 * 
		 * } catch (LoginException e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { User userDetails=loginservice.searchByUserId(id);
		 * if(userDetails.getUserId()!=0) {
		 * System.out.println("user with "+id+" userId is found"); }else { throw new
		 * LoginException("incorrect userId"); }
		 * 
		 * } catch (LoginException e) { System.out.println(e.getMessage()); }
		 */
		  
		/*
		 * try { User userDetails = loginservice.readUser(name, pwd);
		 * if(userDetails.getUserId()!=0) {
		 * System.out.println("You have logged in Successfully"); }else {
		 * System.out.println("Your password/username is incorrect"); } } catch
		 * (LoginException e) { e.printStackTrace(); }
		 */
		  
		/*
		 * try { User userDetails=loginservice.updateUser(pwd,name);
		 * if(userDetails!=null) { System.out.println("Password updated successfully");
		 * }else { System.out.println("Password must be greater than 5 chars"); throw
		 * new LoginException("user not there"); } } catch (LoginException e) {
		 * //e.printStackTrace(); System.out.println(e.getMessage()); }
		 */
		
		  User userDetails=loginservice.deleteUser(id);
		  if(userDetails.getUserId()!=0) {
			  System.out.println("user deleted successfully");
		  }
		  else {
			  System.out.println("enter a valid userId");
		  }
//		List<User> userDetails =loginservice.getAllUsers(); for (User isuser :
//		userDetails) {
//		System.out.println(isuser.getUserId()+", "+isuser.getUserName()); }
			 
	}
}
