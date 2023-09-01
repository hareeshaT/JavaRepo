package cm.service;

import java.util.List;

import com.exception.LoginException;
import com.model.User;

public interface LoginService {
	public abstract User createUser(User user) throws LoginException;
	public abstract User searchByUserId(int id) throws LoginException;
	public abstract List<User> getAllUsers();
	public abstract User readUser(String username,String pwd) throws LoginException;
	public abstract User updateUser(String pwd,String username) throws LoginException;
	public abstract User deleteUser(int userId) throws LoginException;
}
