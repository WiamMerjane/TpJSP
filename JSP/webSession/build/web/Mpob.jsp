<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mot de passe oublié</title>
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

        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0; /* Ajout de marges verticales */
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            background-color: #6f42c1; /* Bleu mauve */
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 3px;
        }

        input[type="submit"]:hover {
            background-color: #593a93; /* Légèrement plus sombre au survol */
        }

        h3 {
            margin-top: 10px;
            color: #333;
        }

        h4 {
            color: #ff0000;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="Mdob" method="post">
            <h1>Mot de passe oublié</h1>
            <div class="form-group">
                <label for="email">E-mail :</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Envoyer">
            </div>
            <h4><%= request.getParameter("msg") %></h4>
        </form>
    </div>
</body>
</html>
