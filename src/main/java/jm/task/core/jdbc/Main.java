package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 30);
        userService.saveUser("Анна", "Петрова", (byte) 28);
        userService.saveUser("Сергей", "Кузнецов", (byte) 35);
        userService.saveUser("Елена", "Васильева", (byte) 27);

        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }

//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}