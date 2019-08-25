package database.pack;

import database.pack.ItemHolderTempates.UserTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDAOImpl implements StandartDAOtestAPI<UserTemplate> {

    private List<UserTemplate> users = new ArrayList<>();

    @Override
    public Optional get(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List getAll() {
        return users;
    }

    @Override
    public void save(UserTemplate user) {
        users.add(user);
    }

    @Override
    public void update(UserTemplate user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setUserType(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(UserTemplate user) {
        users.remove(user);
    }
}
