

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ajouter
 */
@WebServlet("/Ajouter")
public class Ajouter extends HttpServlet {
	public static ArrayList<Etudiant> list=new ArrayList<Etudiant>(); 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", list);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Ajout.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Etudiant e;
	    String idParam = request.getParameter("id");
	            int id = Integer.parseInt(idParam);
	            String nom = request.getParameter("nom");
	            String prenom = request.getParameter("prenom");
	            int age = Integer.parseInt(request.getParameter("age"));
	            e = new Etudiant(id, nom, prenom, age);
	            list.add(e);
	            request.setAttribute("list", list);
		doGet(request, response);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Ajout.jsp" ).forward( request, response );

	}
}
