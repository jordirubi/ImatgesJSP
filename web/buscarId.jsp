<%-- 
    Document   : buscarId
    Created on : 26/10/2018, 01:52:59
    Author     : jrubiralta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar per ID</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
	org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
	 // TODO initialize WS operation arguments here
	int id = 10;
	// TODO process result here
	org.me.imatge.Imatge result = port.searchById(id);

        String titol = result.getTitol();
            int id_imatge = result.getId();
            String descripcio = result.getDescripcio();
            String clau = result.getKeywords();
            String autor = result.getAutor();
            String creacio = result.getDataCreacio();
            
            out.println("<h2>" + titol +"</h2>");
            out.println("<p>Descripció: " + descripcio +"</p>");
            out.println("<p>Autor: " + autor +"</p>");
            out.println("<p>Data de creació: " + creacio +"</p>");
            out.println("<form action=\"modificarImagen.jsp\" method=\"post\">"
                                + "<input type=\"hidden\" value=\"" + id_imatge + "\" name=\"id_imatge\" id=\"id_imatge\">"
                                + "<input type=\"submit\" value=\"Modificar\">"
                                        + "</form>");
            
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
