/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;



import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;
//
//@WebServlet("/delivery-data")
public class DeliveryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setAttribute("cart", session.getAttribute("cart"));
        req.setAttribute("method", session.getAttribute("paymentMethod"));
        req.setAttribute("number", session.getAttribute("paymentNumber"));
        req.setAttribute("amount", session.getAttribute("paymentAmount"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("delivery.html");
        dispatcher.forward(req, resp);
    }
}
