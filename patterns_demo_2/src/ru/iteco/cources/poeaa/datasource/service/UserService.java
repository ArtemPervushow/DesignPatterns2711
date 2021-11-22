package ru.iteco.cources.poeaa.datasource.service;

import ru.iteco.cources.poeaa.datasource.DbImitator;
import ru.iteco.cources.poeaa.datasource.model.User;
import ru.iteco.cources.poeaa.datasource.repo.UserRepository;

import java.util.List;
import java.util.UUID;

public class UserService {
    //private DbImitator imitator = new DbImitator();

   /* public List<User> getUserByName(String name) {
        String rawResult =
                //неудобно вызывать БД из бизнес-кода
                imitator
                        .getEntityUsingSQL("generated complex sql code " + name);
        //Как разобрать ответ базы данных? Долго
        //Поменяется диалект базы- как переписать все бизнес-методы?
        //Если я захочу использовать вообще NoSQL-БД?
        //Как переиспользовать код?
    }*/

    private UserRepository repository;

    public User getUserByName(String name) throws Exception {
        if(name.isEmpty()){
            throw new Exception("Empty name search exception");
        }
        return repository.getUserByName(name);
    }

    public void createNewUser(User user) throws Exception {
        if(!repository.createUser(user))
            throw new Exception("User mot created");
    }

    public void updateUser(User user) {
        if(repository.getByUUID(user.getUuid()) != null) {//????
            repository.updateUser(user);
        }
    }

    public User getUserByUUID(UUID uuid) {
        return repository.getByUUID(uuid);
    }

    public List<User> getAdultUsers(){
        return repository.getByCondition(new String[]{"age", ">=", "18"});
    }
}
