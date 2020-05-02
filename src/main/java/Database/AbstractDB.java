package Database;

import User.User;

public abstract class AbstractDB {
	abstract User login(String username, String password);
	abstract User create(String username, String password);
	abstract User findUser(String username);
}
