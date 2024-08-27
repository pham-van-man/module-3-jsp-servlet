package org.example.product_discount_calculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name-product");
        double price = Double.parseDouble(req.getParameter("price"));
        double discountPercent = Double.parseDouble(req.getParameter("discountPercent"));
        double discountAmount = price * discountPercent * 0.01;
        double result = price - discountAmount;
        req.setAttribute("name", name);
        req.setAttribute("discountPercent", discountPercent);
        req.setAttribute("result", result);
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException ignored) {
        }
//        HttpSession session = req.getSession();
//        session.setAttribute("name", name);
//        session.setAttribute("discountPercent", discountPercent);
//        session.setAttribute("result", result);
//        try {
//            resp.sendRedirect("result.jsp");
//        } catch (IOException ignored) {
//        }
    }
}
