package org.example.product_discount_calculator;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name-product");
        double price = Double.parseDouble(req.getParameter("price"));
        double discountPercent = Double.parseDouble(req.getParameter("discountPercent"));
        double discountAmount = price * discountPercent * 0.01;
        double result = price - discountAmount;
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DiscountServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Product " + name + "</h1>");
        out.println("<h2>Discount Percent " + discountPercent + "</h2>");
        out.println("<h2>Price " + result + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
