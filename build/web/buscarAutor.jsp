<%-- 
    Document   : buscarAutor
    Created on : 26/10/2018, 01:59:43
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
        <h1>Buscar per autor</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
	org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String autor = "Jordi";
	// TODO process result here
	java.util.List<org.me.imatge.Imatge> result = port.searchByAutor(autor);
        
        for (int i = 0; i < result.size(); i++) {
            org.me.imatge.Imatge imatge = (org.me.imatge.Imatge) result.get(i);
            String titol = imatge.getTitol();
            int id_imatge = imatge.getId();
            String descripcio = imatge.getDescripcio();
            String clau = imatge.getKeywords();
            String autor2 = imatge.getAutor();
            String creacio = imatge.getDataCreacio();
            
            out.println("<h2>" + titol +"</h2>");
            out.println("<p>Descripció: " + descripcio +"</p>");
            out.println("<p>Autor: " + autor2 +"</p>");
            out.println("<p>Data de creació: " + creacio +"</p>");
            out.println("<form action=\"modificarImagen.jsp\" method=\"post\">"
                                + "<input type=\"hidden\" value=\"" + id_imatge + "\" name=\"id_imatge\" id=\"id_imatge\">"
                                + "<input type=\"submit\" value=\"Modificar\">"
                                        + "</form>");
        }    
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
