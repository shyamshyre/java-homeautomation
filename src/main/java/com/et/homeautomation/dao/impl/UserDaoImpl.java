package com.et.homeautomation.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.et.homeautomation.dao.UserDao;
import com.et.homeautomation.model.User;
import com.et.homeautomation.repository.UserRepository;





@Repository("userDao")
public class UserDaoImpl implements UserDao {
@Autowired
UserRepository repository;
	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
//	public User findById(int id) {
//		User user = getByKey(id);
//		if(user!=null){
//			Hibernate.initialize(user.getUserProfiles());
//		}
//		return user;
//	}
//
//	public User findBySSO(String sso) {
//		logger.info("SSO : {}", sso);
//		Criteria crit = createEntityCriteria();
//		crit.add(Restrictions.eq("ssoId", sso));
//		User user = (User)crit.uniqueResult();
//		if(user!=null){
//			Hibernate.initialize(user.getUserProfiles());
//		}
//		return user;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<User> findAllUsers() {
//		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
//		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
//		List<User> users = (List<User>) criteria.list();
//		
//		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
//		// Uncomment below lines for eagerly fetching of userProfiles if you want.
//		/*
//		for(User user : users){
//			Hibernate.initialize(user.getUserProfiles());
//		}*/
//		return users;
//	}

	public void save(User user) {
		repository.save(user);
	}



	@Override
	public User findByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteBySSO(String sso) {
		// TODO Auto-generated method stub
		
	}

}
