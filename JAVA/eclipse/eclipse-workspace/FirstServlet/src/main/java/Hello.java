import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */449ouest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generfgh4ntType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<h3>HELLO SERVLET </h3>");
		out.print("</body></html>");
		String doctype="<doctype html public \"-//w3c//dtd html 4.0"+"transitional//en\">\n";
		out.println<doctype+
						"<html>\n"+
						"<head><title>"+title+"</title></head>\n"+
						"<body bgcolor=\"#f0f0f0\">\n"+
						"<h1 align=\"Center\">"+title+"</h1><"
						
						+ ""
						+ ""
						+ "+title+"</h1>\n"+
						}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
