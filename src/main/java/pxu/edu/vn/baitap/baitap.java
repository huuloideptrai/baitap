package pxu.edu.vn.baitap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

/**
 * Servlet implementation class baitap
 */
@WebServlet("/baitap")
public class baitap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public baitap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse
    		response)

    		throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
    		String title = "Bai Tap";
    		String docType = "<!doctype html public \"-//w3c//dtd html   4.0 " +   "transitional//en\">\n";
    		out.println(docType +

    		"<html>\n" +
    		"<head><title>" + title + "</title></head>\n" +
    		"<body bgcolor=\"#f0f0f0\">\n" +
    		"<h1 align=\"center\">" + title + "</h1>\n" +
    		"<ul>\n" +
    		" <li><b>First Name</b>: "
    		+ request.getParameter("first_name") + "\n" +
    		" <li><b>Last Name</b>: "
    		+ request.getParameter("last_name") + "\n" +
    		"</ul>\n" +
    		"</body></html>");
    		
    		
    		}
    		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
