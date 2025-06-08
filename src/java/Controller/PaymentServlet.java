/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet("/pay")
public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        String method = req.getParameter("method");
        String number = req.getParameter("number");
        String amount = req.getParameter("amount");

        session.setAttribute("paymentMethod", method);
        session.setAttribute("paymentNumber", number);
        session.setAttribute("paymentAmount", amount);

        resp.sendRedirect("delivery.html");
    }
}
