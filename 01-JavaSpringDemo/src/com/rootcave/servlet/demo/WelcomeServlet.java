package com.rootcave.servlet.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by melkotoury on 5/27/2017.
 */
@WebServlet(name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet(){
        super();
    }

    /**
     *  @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     * */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1. Create the data (model) and then add it to the request object
        String welcomeMessage[] = {"Hello!", "Welcome to the Spring course."};
        request.setAttribute("myWelcomeMessage",welcomeMessage);

//        2. Retrieve request dispatcher
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");

//        3. Forward request to the view
        requestDispatcher.forward(request,response);

    }
}
