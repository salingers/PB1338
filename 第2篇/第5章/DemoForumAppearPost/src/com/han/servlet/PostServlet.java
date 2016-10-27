package com.han.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.han.bean.PostBean;
import com.han.db.DBWork;

public class PostServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("gbk");
		String postTitle = request.getParameter("postTitle");
		String postContent = request.getParameter("postContent");
		PostBean post = new PostBean();
		post.setPostTitle(postTitle);
		post.setPostContent(postContent);
		DBWork db = new DBWork();
		if (!(postTitle.length() == 0 && postContent.length() == 0))
		{
			int result = db.addPost(postTitle, postContent);
			if (result == 1)
			{
				request.getSession().setAttribute("post", post);
				response.sendRedirect("success.jsp");
			}
			else
			{
				response.sendRedirect("post.jsp");
			}
		}
		else
		{
			response.sendRedirect("error.jsp");
		}

	}

}
