package cm.service;

import java.util.List;

//import java.sql.Connection;

import com.dao.Logindao;
import com.dao.LogindaoImpl;
import com.exception.LoginException;
import com.model.User;

public class LoginServiceImpl implements LoginService{

	@Override
	public User createUser(User user) throws LoginException {
		LogindaoImpl.getConnection();
		if(user.getPassword().length()>=5) {
			Logindao logindao=new LogindaoImpl();
			logindao.createUser(user);
		}
		else {
			throw new LoginException("Password must be greater than 5 chars");
		}
		return user;
	}
	
	@Override
	public User searchByUserId(int id) throws LoginException {
		int length=String.valueOf(id).length();
		User user=null;
		if(length>=1) {
			Logindao logindao=new LogindaoImpl();
			user=logindao.searchByUserId(id);
		}else {
			throw new LoginException("userid is incorrect");
		}
		//System.out.println(user.getUserId());
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Logindao logindao=new LogindaoImpl();
		List<User> users=logindao.getAllUsers();
		return users;
	}

	@Override
	public User readUser(String username, String pwd) throws LoginException {
		LogindaoImpl.getConnection();
		User user=null;
		if(pwd.length()>=5) {
			Logindao logindao=new LogindaoImpl();
			user=logindao.readUser(username, pwd);
		}else {
			throw new LoginException("given data is incorrect");
		}
		return user;
	}

	@Override
	public User updateUser(String pwd,String username) throws LoginException {
		User user =null;
		if(pwd.length()>=5) {
			Logindao logindao=new LogindaoImpl();
			user=logindao.updateUser(pwd,username);
		}
		else {
			throw new LoginException("Password must be greater than 5 chars");
		}
		return user;
	}

	@Override
	public User deleteUser(int userId) throws LoginException {
		User user =null;
		if(userId!=0) {
			Logindao logindao=new LogindaoImpl();
			user=logindao.deleteUser(userId);
		}
		else {
			throw new LoginException("userId is not valid");
		}
		return user;
	}

}