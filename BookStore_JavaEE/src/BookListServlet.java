

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.BookRepository;

@WebServlet("/BookListServlet")

public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Inject("/book/");

	private BookRepository bookRepo;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
