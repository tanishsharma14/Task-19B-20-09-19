<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<fr:form action="saveStudent" modelAttribute="student">
	Id:<fr:input path="id" /><fr:errors path="id"></fr:errors>	<br>
	Name:<fr:input path="name"/><fr:errors path="name"></fr:errors> <br><br><br>
	Branch: <fr:select  path="mobile" items="${blist}"></fr:select><br>
	Email:  <fr:input path="email"/> <fr:errors path="email"></fr:errors><br>
	<%-- Mobile: <fr:input path="mobile"/><fr:errors path="mobile"></fr:errors><br> --%>
	<input type="submit" name="submit">
	</fr:form>
</body>
</html>