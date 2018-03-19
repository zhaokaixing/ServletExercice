<%@page import="zkx.hmy.wrj.controller.MeubleController"%>
<%@ page import="zkx.hmy.wrj.model.Meuble"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//ConnectionClasse.getEntityManager();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<title>Ajouter Production Information</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link id="bs-css" href="bootstrap-cerulean.css" rel="stylesheet">
<link id="bs-css" href="bootstrap.min.css" rel="stylesheet">
<link href="charisma-app.css" rel="stylesheet">
</head>
<body>
<div class="box col-md-3">
		<div class="box-inner">
			<div class="box-header well" data-original-title="">
				<h2>
					Production Information
				</h2>
			</div>
			<div class="box-content">
				<form action="ProductionServlet" method="post" role="form">
					<div class="form-group">
						<input type="text" class="form-control" name="jour" placeholder="Nombre Jour"> 
						<input type="text" class="form-control" name="debut" placeholder="Date Debut"> 
						<input type="text" class="form-control" name="fin" placeholder="Date Fin"> 
					</div>
					<br>
					<label for="exampleInputEmail1">Meuble</label>
					<% 
                        MeubleController mController = new MeubleController();
						List meubleList = mController.getMeubleList();
						for(int i=0;i<meubleList.size();i++){
							Object[] objects = (Object[])meubleList.get(i);
						
	                %>
					<label> <input name="meuble" type="checkbox" value=<%=objects[0] %> /><%=objects[0] %></label>
					<%
						}
					%>
					<br>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>