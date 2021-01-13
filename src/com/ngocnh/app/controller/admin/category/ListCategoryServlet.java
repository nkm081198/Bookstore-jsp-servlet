package com.ngocnh.app.controller.admin.category;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngocnh.app.controller.admin.BaseServlet;
import com.ngocnh.app.entity.Category;
import com.ngocnh.app.service.CategoryServices;

@WebServlet("/admin/list_category")
public class ListCategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public ListCategoryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().println("List Category");
		CategoryServices categoryServices = new CategoryServices(entityManager, request, response);
		categoryServices.listCategory();

	}

}
