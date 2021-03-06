package at.wrk.fmd.dto;

import java.util.ArrayList;
import java.util.List;

import at.wrk.fmd.pojo.User;

public class UserCreationDto {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}