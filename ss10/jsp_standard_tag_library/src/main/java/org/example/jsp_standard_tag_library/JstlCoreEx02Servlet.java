package org.example.jsp_standard_tag_library;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/jstlCoreExample02")
public class JstlCoreEx02Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public JstlCoreEx02Servlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Chuẩn bị dữ liệu từ DB (Mô phỏng).
        List<Dept> list = DBUtils.queryDepartments();
        // Lưu dữ liệu vào thuộc tính (attribute) 'departments' của request.
        request.setAttribute("departments", list);
        // Tạo đối tượng RequestDispatcher
        // để forward (chuyển tiếp) yêu cầu tới jstl_core_example02.jsp
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/jsps/jstl_core_example02.jsp");
        // Forward (Chuyển tiếp) yêu cầu, để hiển thị trên trang JSP.
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}