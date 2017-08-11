package framework.services;

import java.util.List;

import framework.domain.User;

public interface IUserService {
	public void save(User user);
	public List<User> findAll();
	public User findOne(Long id);
	public User findByEmail(String email);
	public User update(User user);
	public void saveFull( User user);		

}
