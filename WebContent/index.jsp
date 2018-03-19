<%@page import="zkx.hmy.wrj.controller.ProductionController"%>
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
                        <a href="production.jsp" class="btn btn-minimize btn-round btn-default">Ajouter production</a>
                        <a href="meuble.jsp" class="btn btn-minimize btn-round btn-default">Ajouter meuble</a>
                        <a href="employe.html" class="btn btn-minimize btn-round btn-default">Ajouter employe</a> 
                        <a href="voirdetail.jsp" class="btn btn-minimize btn-round btn-default">Voir les Meubles</a>  
                        <a href="voiremployedetail.jsp" class="btn btn-minimize btn-round btn-default">Voir les Employes</a>
                        <a class="btn btn-info" href="modifierproduction.jsp">
                                    Modifier Production
                        </a>  
                        <a class="btn btn-info" href="modifiermeuble.jsp">
                                    Modifier Meuble
                        </a>  
                        <a class="btn btn-info" href="modifieremploye.jsp">
                                    Modifier Employe
                        </a>  
                     </div>  
                </div>

                <div class="box-content">
                    <table class="table table-striped table-bordered responsive" width="80%">
                        <thead>
                        <tr>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;IDProduction</th>
                              <th class="center">&nbsp;&nbsp;&nbsp;&nbsp;Nombre de jours</th>
                              <th>&nbsp;&nbsp;&nbsp;&nbsp;Date de debut</th>
                              <th>&nbsp;&nbsp;&nbsp;&nbsp;Date de fin</th>
                              
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                        <% 
                        	ProductionController pController=new ProductionController();
                        	List resultList=pController.getProductionList();
                        	for(int i=0;i<resultList.size();i++){
                        		Object[] objects = (Object[])resultList.get(i);
                        	
                        %>
                
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[0] %></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[1]%></td>
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[2]%></td>              
                            <td class="center">&nbsp;&nbsp;&nbsp;&nbsp;<%=objects[3]%></td>
                        	
                            
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