<%@page import="ma.projet.entites.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
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
        }

        h1 {
            color: #6f42c1; /* Bleu mauve */
        }

        form {
            margin-top: 20px;
        }

        input[type="submit"] {
            background-color: #e74c3c; /* Rouge */
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 3px;
        }
    </style>
    <body>
        <%
            Client c = (Client) session.getAttribute("client");

            if (c != null) {
        %>
            <div class="container">
                <h1>Welcome MR : <%= c.getNom() + " " + c.getPrenom()%> </h1>
                <form action="deconnexion">
                    <input type="submit" value="deconnexion">
                </form>
            </div>
        <%
            } else {
                response.sendRedirect("Authentification.jsp");
            }
        %>
    </body>
</html>
