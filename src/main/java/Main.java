/*
Создать приложение, в котором возможна работа с пользователями системы:
1)удаление пользователя
2)перевод в другой статус
3)добавление пользователя
4)редактирование
5)получение всех пользователей с их статусами и т.д
*/

import enums.Gender;
import enums.UserStatus;
import models.User;
import services.UserService;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main implements UserService{

  public static void main(String[] args) {

    Main task = new Main();

    List<User> list = new LinkedList<User>();

    User user_1 = new User(24, "Ivan", Gender.MALE, UserStatus.ACTIVE);
    User user_2 = new User(28, "Irina", Gender.FEMALE, UserStatus.INACTIVE);

    list.add(user_1);
    list.add(user_2);

    for (;;) {

      System.out.println("Меню:\n" +
              "1)удаление пользователя\n" +
              "2)перевод в другой статус\n" +
              "3)добавление пользователя\n" +
              "4)редактирование\n" +
              "5)получение всех пользователей с их статусами\n");

      System.out.println("Введите номер нужного пункта: ");

      Scanner scan = new Scanner(System.in);
      int choice = scan.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Удаление пользователя:\n");

          break;

        case 2:
          System.out.println("Перевод в другой статус:\n");
          break;

        case 3:
          System.out.println("Добавление пользователя:\n");

          System.out.println("Введите возраст:\n");
          Integer age = scan.nextInt();

          System.out.println("Введите имя:\n");
          String username = scan.next();

          System.out.println("Выберите пол:\n" +
                             "1)FEMALE\n" +
                             "2)MALE\n" +
                             "3)OTHER\n");
          Gender G = Gender.OTHER;
          int number_1 = scan.nextInt();
          switch (number_1){
            case 1:
              G = Gender.FEMALE;
              break;

            case 2:
              G = Gender.MALE;
              break;

            case 3:
              G = Gender.OTHER;
              break;
          }

          System.out.println("Выберите статус:\n" +
                  "1)ACTIVE\n" +
                  "2)INACTIVE\n" +
                  "3)DELETED\n");

          UserStatus US = UserStatus.DELETED;
          int number_2 = scan.nextInt();
          switch (number_2){
            case 1:
              US = UserStatus.ACTIVE;
              break;

            case 2:
              US = UserStatus.INACTIVE;
              break;

            case 3:
              US = UserStatus.DELETED;
              break;
          }

          task.addUser(list,age, username, G, US);
          break;

        case 4:
          System.out.println("Редактирование:\n");
          break;

        case 5:
          System.out.println("Получение всех пользователей с их статусами:\n");
          break;

        default:
          System.out.println("Ошибка");
          break;
      }

      for (User user : list) {
        System.out.println(user.getUsername() + "," + user.getAge() + "," + user.getGender() + "," + user.getUserStatus() + "\n");
      }
    }
  }

  @Override
  public List<User> getAllUsers(List list) {
    //for (User user : list) {
    //  System.out.println(user.getUsername() + "," + user.getAge()+" лет, " + user.getGender() + "," + user.getUserStatus());
    //}
    return null;
  }

  @Override
  public User addUser (List list, Integer age, String username, Gender gender, UserStatus userStatus) {
    User new_user = new User(age, username, gender, userStatus);
    list.add(new_user);
    return new_user;
  }

  @Override
  public User updateUserByName(String username) {
    return null;
  }

  @Override
  public User getUserByUsername(String username) {
    return null;
  }

  @Override
  public boolean deleteUserByUserName(String username) {

    return false;
  }
}

