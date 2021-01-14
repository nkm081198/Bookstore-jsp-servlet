package com.ngocnh.app.controller.admin.category;

import com.ngocnh.app.controller.BaseServlet;
import com.ngocnh.app.service.CategoryServices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin/delete_category")
public class DeleteCategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

    public DeleteCategoryServlet() {
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoryServices categoryServices = new CategoryServices(entityManager, request, response);
		categoryServices.deleteCategory();
	}

	
}
