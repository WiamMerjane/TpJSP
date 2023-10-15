<%-- 
    Document   : Authentification
    Created on : 10 oct. 2023, 11:32:00
    Author     : Cloud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                margin: 0;
                padding: 0;
                background-color: #6f42c1; /* Bleu mauve */
                font-family: Arial, sans-serif;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .container {
                background-color: #fff; /* Blanc */
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                max-width: 400px;
                width: 100%;
                text-align: center;
                margin: 20px auto; /* Auto-centrage vertical et horizontal */
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            .form-group {
                margin: 10px 0;
                width: 100%; /* Utilise toute la largeur du conteneur */
            }

            input[type="email"],
            input[type="password"]
            {
                width: 100%;
                padding: 10px;
                margin: 5px 0; /* Ajout de marges verticales */
                border: 1px solid #ccc;
                border-radius: 3px;
            }


            input[type="submit"],
            input[type="reset"] {
                background-color: #6f42c1; /* Bleu mauve */
                color: #fff;
                border: none;
                padding: 10px 20px;
                cursor: pointer;
                border-radius: 3px;
            }

            .links {
                margin-top: 20px;
            }
            label {
                //display: block;
                font-weight: bold;
                font-family: Arial, sans-serif; /* Remplacez par la police de votre choix */
            }
        </style>
    </head>


    <body>
        <div class="container">

            <form action="Authentification" method="post">
                <h1>Authentification</h1>

                <div class="form-group">
                    <label for="email">Email :</label>
                    <input type="email" id="email" name="email" value="" required>
                </div>
                <div class="form-group">
                    <label for="password">Mot de passe :</label>
                    <input type="password" id="password" name="password" value="" required>
                </div>
                <div class="form-group">
                    <input type="submit" value="connexion">
                </div>

                <tr>
                    <td><a href="Mpob.jsp">Mot de passe oblier</a></td> 
                    <td><a href="Inscription.jsp">Creé un nouveau compte</a></td>
                </tr>
                <tr>
                    <%
                            if (request.getParameter("msg") != null) {%>
                    <td><h3><%= request.getParameter("msg")%></h3></td>
                    <%}%>
                </tr>

            </form>
        </div>
    </body>
</html>
