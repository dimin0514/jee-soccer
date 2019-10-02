<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>


<p:choose>
	<p:when test="${page eq 'main'}">  
		<jsp:include page="2_position.jsp"/>
		<jsp:include page="4_find_by_teamid_position.jsp"/>
		<jsp:include page="5_find_by_teamid_height_name.jsp"/>
	</p:when>
	<p:when test="${page eq 'a_position'}">
	  <jsp:include page="a_position.jsp"/>
	</p:when>
</p:choose>



<jsp:include page="../common/foot.jsp"/>