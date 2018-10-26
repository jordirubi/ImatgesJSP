<%-- 
    Document   : modificarImatge
    Created on : 26/10/2018, 01:45:25
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
        <h1>Modificar imatge</h1>
        
          <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
	org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
	 // TODO initialize WS operation arguments here
	org.me.imatge.Imatge imatge = new org.me.imatge.Imatge();
	// TODO process result here
        
        imatge.setId(10);
        imatge.setTitol("Modificat");
        imatge.setDescripcio("La prova de AD");
        imatge.setAutor("Jordi");
        imatge.setKeywords("Key");
        imatge.setDataCreacio("21/02/2012");
        
	int result = port.registreImatge(imatge);
        
        if (result == 1) {
            out.println("<h1>Usuari modificat amb èxit</h1>");
        } else {
            out.println("<h1>Error al modificar l'usuari</h1>");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
  
        
    </body>
</html>
