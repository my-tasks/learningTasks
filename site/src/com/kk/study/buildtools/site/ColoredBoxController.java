package com.kk.study.buildtools.site;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kk.study.buildtools.comparator.HeightComparator;
import com.kk.study.buildtools.dao.BoxDAO;
import com.kk.study.buildtools.dao.IBoxDAO;
import com.kk.study.buildtools.model.Box;

@WebServlet("/c")
public class ColoredBoxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBoxDAO dao = new BoxDAO();

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
		request.setAttribute("boxes", dao.getAll());
		System.out.println("Boxes are loaded to the request "+request.getLocalName());
		request.getRequestDispatcher("boxes.jsp").forward(request, response);
	}

}
