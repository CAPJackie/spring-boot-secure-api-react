package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        users.add( new User(
                "juan.ramirez-me@mail.escuelaing.edu.co",
                "qwerty",
                "Juan David",
                "Ramirez Mendoza",
                "CAPJackie")
        );
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( int id )
    {
        return users.get( id );
    }

    @Override
    public void createUser( User user )
    {
        users.add(user);
    }

    @Override
    public User findUserByUsername( String username )
    {
        for(User user: users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        for(User user: users){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

}
