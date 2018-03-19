<%@page import="zkx.hmy.wrj.controller.EmployeController"%>
<%@page import="zkx.hmy.wrj.controller.ConnectionClasse"%>
<%@ page import="zkx.hmy.wrj.model.Production"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//ConnectionClasse.getEntityManager();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ZHAO Kaixing-HU Mengyu-WANG Rujia</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="bootstrap.min.css" rel="stylesheet" type="text/css">
  </head>

  <body>

		<div class="box col-md-12" >
            <div class="box-inner">
                <div class="box-header well">
                    <h2>Production Management--ZHAO Kaixing/HU Mengyu/WANG Rujia</h2>
                     <div class="box-icon">
                        <a href="index.jsp" class="btn btn-minimize btn-round btn-default">Retourner a l'acceuil</a>
                     </div>  
                </div>

                <div class="box-content">
                    <table class="table table-striped table-bordered responsive" width="80%">
                        <thead>
                        <tr>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;IDEmploye</th>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;Heure de Travail</th>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;Nom</th>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;Telephone</th>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;Prenom</th>
                              
                              
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                        <% 
                        	EmployeController pController=new EmployeController();
                        	List resultList=pController.getEmployeList();
                        	for(int i=0;i<resultList.size();i++){
                        		Object[] objects = (Object[])resultList.get(i);
                        	
                        %>
                
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[0] %></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[1]%></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[2]%></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[3]%></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[4]%></td>
                        	
                        </tr>
                       
                        </tbody>
						<%
                        	}
                    	%>
                    </table>   
                </div>
            </div>
        </div>

  </body>
</html>