<!DOCTYPE html>
<html>
<head>


<title>Modifier Employe Information</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="description" content="This is my page">
<link id="bs-css" href="bootstrap-cerulean.css" rel="stylesheet">
<link id="bs-css" href="bootstrap.min.css" rel="stylesheet">
<link href="charisma-app.css" rel="stylesheet">

</head>
<body>
    <div class="box col-md-3">
        <div class="box-inner">
            <div class="box-header well">
                <h2>Employe information</h2>
            </div>
            <div class="box-content">
                <form action="ModifierEmploye" method="post">
                    <div class="form-group">
                    	<input type="text" class="form-control"  name="IDEmp" placeholder="ID Employe">
                    	<input type="text" class="form-control"  name="Nom" placeholder="Nom">
                    	<input type="text" class="form-control"  name="Prenom" placeholder="Prenom">
                        <input type="text" class="form-control" name="HeureDeTravail" placeholder="Heure De Travail">                                            
                        <input type="text" class="form-control"  name="Tel" placeholder="Telephone">           
                    </div>      
                    <button type="submit" class="btn btn-default">submit</button>
                </form>

            </div>
        </div>
    </div>
  
  </body>
</html>