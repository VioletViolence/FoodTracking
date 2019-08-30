package business.logic;

import WebSide.UserEnum;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectliquorservlet",
        urlPatterns = "/SelectUser"
)

public class SampleUserServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userType = req.getParameter("Type");

        UserServiceModel userServiceModel = new UserServiceModel();
        UserEnum u = UserEnum.valueOf(userType);

        List liquorBrands = userServiceModel.getAvailableUsers(u);

        req.setAttribute("types", liquorBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
