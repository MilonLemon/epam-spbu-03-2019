package services;

import java.util.List;
import models.User;
import enums.Gender;
import enums.UserStatus;

public interface UserService {

  List<User> getAllUsers();

  User addUser(List list, Integer age, String username, Gender gender, UserStatus userStatus);

  User updateUserByName(String username);

  User getUserByUsername(String username);

  boolean deleteUserByUserName(List list, String username);

  //TODO: add more interactions with users
}
