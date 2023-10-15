package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #6f42c1; /* Bleu mauve */\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                background-color: #fff; /* Blanc */\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\n");
      out.write("                max-width: 400px;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 20px auto; /* Auto-centrage vertical et horizontal */\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group {\n");
      out.write("                margin: 10px 0;\n");
      out.write("                width: 100%; /* Utilise toute la largeur du conteneur */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"email\"],\n");
      out.write("            input[type=\"password\"]\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin: 5px 0; /* Ajout de marges verticales */\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            input[type=\"submit\"],\n");
      out.write("            input[type=\"reset\"] {\n");
      out.write("                background-color: #6f42c1; /* Bleu mauve */\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .links {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                //display: block;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: Arial, sans-serif; /* Remplacez par la police de votre choix */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <form action=\"Authentification\" method=\"post\">\n");
      out.write("                <h1>Authentification</h1>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">Email :</label>\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" value=\"");
      out.print( request.getParameter("email"));
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\">Mot de passe :</label>\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"password\" value=\"\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" value=\"connexion\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"Mpob.jsp\">Mot de passe oblier</a></td> \n");
      out.write("                    <td><a href=\"Inscription.jsp\">Creé un nouveau compte</a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                            if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("                    <td><h3>");
      out.print( request.getParameter("msg"));
      out.write("</h3></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
