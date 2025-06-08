/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author OVERLORD
 */
//@WebServlet("/add-to-cart")
public class cartservlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        List<Map<String, String>> cart = (List<Map<String, String>>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();

        Map<String, String> item = new HashMap<>();
        item.put("title", req.getParameter("title"));
        item.put("price", req.getParameter("price"));
        item.put("image", req.getParameter("image"));

        cart.add(item);
        session.setAttribute("cart", cart);

        resp.sendRedirect("cart.html");
    }
}