<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Log in</title>
<link href="css/sdsd.css" rel="stylesheet" type="text/css" />
<link href="css/site.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body {
	background-color: #ADBACE;
	background-image: url(images/bj36.gif);
}
-->
</style>
<link href="old/css/site.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div align="center" class="english">
  <table cellspacing="0" width="100%" align="center" border="0">
    <tbody>
      <tr>
        <td align="middle"><div align="center"> </div></td>
      </tr>
    </tbody>
  </table>
  <p>&nbsp;</p>
  <form name="form1" id="form1" method="post" action="LoginServlet">
    <h1>Login Page</h1>
    <table width="356" border="0">
      <tr>
        <td width="135" height="33">Type d'utilisateur：</td>
        <td width="211"><select name="select" class="input1">
          <option value="admin">Administrateur</option>
          <option value="normal" selected="selected">Utilisateur normal</option>
        </select></td>
      </tr>
      <tr>
        <td height="30">Idtifiant：</td>
        <td><input name="uid" type="text" class="input1" /></td>
      </tr>
      <tr>
        <td height="30" class="font2">Mots de passe：</td>
        <td><input name="pwd" type="password" class="input1" /></td>
      </tr>
    </table>
    <p>&nbsp;    </p>
    <table width="200" border="0">
      <tr>
        <td><input type="submit" name="Submit" value="Login" /></td>
      </tr>
    </table>
    <p>&nbsp;</p>
  </form>
  <p>&nbsp;</p>
  <table height="4" cellspacing="0" width="640" align="center" border="0">
    <tbody>
      <tr>
        <td valign="bottom" width="787" bgcolor="#0b5a7e" height="4"></td>
      </tr>
    </tbody>
  </table>
  <div align="center"><font style="FONT-SIZE: 9pt" face="Tahoma" 
color="#333333">Polytech Tours&copy Copyright;<br />
 <a href="kaixing.zhao@etu.univ-tours.fr"><font color="#005826">Etudiant</font></a><br />
  ZHAO Kaixing/HU Mengyu/WANG Rujia<br />
  </font></div>
</div>
</body>
</html>
