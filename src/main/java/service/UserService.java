package service;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void addUser(User user);
    void dellUser(int id);
    void searchUser();
    List<User> viewAllUsers() throws IOException, SQLException;
}
