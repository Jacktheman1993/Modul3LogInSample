package DBAccess;

import static DBAccess.UserMapper.enkelorder;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The purpose of UserMapper is to...
 *
 * @author kasper
 */
public class UserMapper
{

    public static void createUser(User user) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getRole());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setId(id);
        }
        catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT id, role FROM users "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                String role = rs.getString("role");
                int id = rs.getInt("id");
                User user = new User(email, password, role);
                user.setId(id);
                return user;
            }
            else
            {
                throw new LoginSampleException("Could not validate user");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static Order enkelorder(int height, int length, int width)
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM order where user_id = id";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, height);
            ps.setInt(2, length);
            ps.setInt(3, width);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                height = rs.getInt("height");
                length = rs.getInt("lenght");
                width = rs.getInt("width");
                Order order = new Order(height, length, width);
                return order;
            }
            else
            {
                throw new Exception("THE CAKE IS A LIEEE");
            }

        }
        catch (Exception e)
        {

        }
        return null;
    }

    public static void createOrder(Order order)
    {
         try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO order (height, length, width) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getHeigth());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getWidth());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setOrderID(id);
        }
        catch (Exception ex)
        {
        }
    }

}
