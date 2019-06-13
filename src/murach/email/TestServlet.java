package murach.email;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
//    super.doPost(req, resp);

    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    try {
      out.println("<h1>Test Servlet Post</h1>");
    } finally {
      out.close();
    }

  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doGet(req, resp);

    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    try {
      out.println("<h1>Test Servlet Get</h1>");
    } finally {
      out.close();
    }

  }
}
