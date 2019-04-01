package services;

import java.util.List;
import models.User;
import enums.Gender;
import enums.UserStatus;

public interface UserService {

  List<User> getAllUsers(List list);

  public User addUser(List list, Integer age, String username, Gender gender, UserStatus userStatus);

  User updateUserByName(String username);

  User getUserByUsername(String username);

  boolean deleteUserByUserName(String username);

  //TODO: add more interactions with users
}
