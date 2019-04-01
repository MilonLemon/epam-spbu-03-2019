package models;

import enums.Gender;
import enums.UserStatus;

public class User {

  private Integer age;
  private String username;
  private Gender gender;
  private UserStatus userStatus;

  //TODO: add necessary constructors (use Alt+insert)

  public User(Integer age, String username, Gender gender, UserStatus userStatus) {
    this.age = age;
    this.username = username;
    this.gender = gender;
    this.userStatus = userStatus;
  }


  //TODO: add all necessary getters and setters (use Alt+insert)

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public UserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(UserStatus userStatus) {
    this.userStatus = userStatus;
  }
}
