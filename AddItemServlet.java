package kz.javaee.servlets;

import kz.javaee.servlets.kz.javaee.db.DBManager;
import kz.javaee.servlets.kz.javaee.db.Items;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/additem")
public class AddItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        int price = Integer.parseInt(request.getParameter("price"));

        Items it = new Items(null,name,price,amount);
        DBManager.addItem(it);
        response.sendRedirect("/additem?success");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("/additem.jsp").forward(request,response);
    }
}
