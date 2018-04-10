package movierental.dao;


import movierental.Login;
import movierental.User;
public interface UserDao {
    void register(User user);
    User validateUser(Login login);
}