package kz.javaee.servlets.kz.javaee.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DBManager {

    private static Connection connection;

    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_ee_db?useUnicode=true&serverTimezone=UTC","root","");

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static boolean addItem(Items item){
        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" + "INSERT INTO items(id,name, price, amount)");

            statement.setString(1,item.getName());
            statement.setInt(2,item.getPrice());
            statement.setInt(3,item.getAmount());

            rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){

        }
        return rows>0;

    }

    public static ArrayList<Items> getItems(){
        return null;
    }

    public static Items getItem(Long id){
        return null;
    }
}

