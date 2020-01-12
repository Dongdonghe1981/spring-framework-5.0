package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void insertUser(){
		userDao.insert();
		System.out.println("insert completed");
	}

	@EventListener
	public void listen(){

	}
}
