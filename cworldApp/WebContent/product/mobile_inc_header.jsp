
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.time.*" %>
<%@ page import="vo.*" %>
<%
request.setCharacterEncoding("utf-8");
MemberInfo loginInfo = (MemberInfo)session.getAttribute("loginInfo");
boolean isLogin = false;
if (loginInfo != null) { 
	isLogin = true; 
}
if (loginInfo != null && loginInfo.getMi_status().equals("b") && !request.getRequestURI().equals("/cworldSite/member/member_dormancy.jsp")){ 
	response.sendRedirect("/cworldSite/member/member_dormancy.jsp");
}%>
