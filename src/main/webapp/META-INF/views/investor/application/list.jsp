<%-- Chus 27.10.2019

		list.jsp

 --%>
 
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
    <acme:list-column code="investor.application.list.label.creation" path="creation" width="30%"/>
	<acme:list-column code="investor.application.list.label.statement" path="statement" width="40%"/>
	<acme:list-column code="investor.application.list.label.money" path="money" width="30%"/>
</acme:list>