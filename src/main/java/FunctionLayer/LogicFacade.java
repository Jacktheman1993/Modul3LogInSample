package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static Order enkelOrder(int orderID, int height, int length, int width)
    {
        return UserMapper.enkelorder(orderID, height, length, width);
    }
    public static Order createOrder(int orderID, int height, int length, int width)
    {
        Order order = new Order(orderID, height, length, width);
        UserMapper.createOrder(order);
        return order;
    }
}
