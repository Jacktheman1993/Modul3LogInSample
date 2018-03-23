/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author The Overlord
 */
public class Order
{

    public Order(int orderID, int heigth, int length, int width)
    {
        this.orderID = orderID;
        this.heigth = heigth;
        this.length = length;
        this.width = width;
    }
     private int orderID;
     private int heigth;
     private int length;
     private int width;

   
    public int getOrderID()
    {
        return orderID;
    }

    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

    public int getHeigth()
    {
        return heigth;
    }

    public void setHeigth(int heigth)
    {
        this.heigth = heigth;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
   
}
