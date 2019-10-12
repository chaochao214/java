import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("+++++++++++++++++");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter  pw = response.getWriter();
        if("username".equals(username)&&"password".equals("password") ){
        pw.write("loginSuccess");
        }else {
        pw.write("loginFailure");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("+++++++++++++++++");
        doPost(request,response);
    }
}
