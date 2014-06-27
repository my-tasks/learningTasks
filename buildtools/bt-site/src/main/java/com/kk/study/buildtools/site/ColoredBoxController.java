package com.kk.study.buildtools.site;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kk.study.buildtools.dao.BoxDAO;
import com.kk.study.buildtools.dao.IBoxDAO;

@WebServlet("/")
public class ColoredBoxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBoxDAO dao = new BoxDAO();

	/**
	 * Default constructor.
	 */
	public ColoredBoxController() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("boxes", dao.getAll());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
