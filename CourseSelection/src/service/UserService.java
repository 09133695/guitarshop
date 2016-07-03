/**
 * 
 */
package service;

import exception.RoleNotExistException;
import exception.UserExistException;
import model.User;

/**
 * @author JiHan
 *
 */
public interface UserService {
	/**
	 * 登陆
	 * @param account
	 * @param password
	 * @return
	 */
	User logIn(String account,String password);
	/**
	 * 用户是否已存在
	 * @param user
	 * @return
	 */
	Boolean isUserExist(User user);
	/**
	 * 创建一个用户
	 * @param user
	 * @return
	 * @throws RoleNotExistException 
	 * @throws UserExistException 
	 */
	Integer createUser(User user) throws RoleNotExistException, UserExistException;
	/**
	 * 根据标识属性获取用户实例
	 * @param id
	 * @return
	 */
	User getUserByID(Integer id);
}
