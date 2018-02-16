package com.TechLibBackEnd;

import com.niit.TechLibBackEnd.DaoImpl.UserDaoImpl;
import com.niit.TechLibBackEnd.Model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User user=new User();
        user.setAddress("abc");
        user.setEmail("abc@jh.com");
        user.setUsername("pqr");
        user.setMobile("97287273");
        user.setRole("admin");
        user.setPassword("w4543");
        user.setEnabled(true);
        UserDaoImpl us=new UserDaoImpl();
        us.insertUser(user);

        System.out.println( "table created!" );   
    }
}
