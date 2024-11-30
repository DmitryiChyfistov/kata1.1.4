package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("111", "111", (byte) 30);
        userService.saveUser("222", "222", (byte) 30);
        userService.saveUser("333", "333", (byte) 30);
        userService.saveUser("444", "444", (byte) 30);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
