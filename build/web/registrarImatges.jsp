<%-- 
    Document   : registrarImatges
    Created on : 26/10/2018, 01:31:18
    Author     : jrubiralta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Imatge</title>
    </head>
    <body>
        <div>
            <h1 id="headerRegistreImatge">Registrar imatge</h1>
            <p id="dades"><strong>Introdueix les dades que es demanen a continuació</strong></p>
            <form method="post" action="processRequest" id="registrarImatge" enctype="multipart/form-data">
                <label for="titol"><br>Títol:<br></label>
                <input type="text" name="titol" id="titol">
                <br>
                <textarea cols='30' rows='10' name="textArea" id="textArea" placeholder="Escriu una breu descripció..."></textarea>
                <br>
                <label for="clau"><br>Paraules clau:<br></label>
                <input type="text" name="clau" id="clau">
                <br>
                <label for="autor"><br>Autor:<br></label>
                <input type="text" name="autor" id="autor">
                <br>
                <label for="creacio"><br>Data de creació:<br></label>
                <input type="date" name="creacio" id="creacio">
                <br>
                <input type="submit" name="registrar" id="registrar" value="Registrar">
                <input type="reset" name="netejar" id="netejarQuestionari" value="Esborrar dades">
            </form>
        </div>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
	org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
	 // TODO initialize WS operation arguments here
	org.me.imatge.Imatge imatge = new org.me.imatge.Imatge();
	// TODO process result here
        
        imatge.setId(7);
        imatge.setTitol("provw");
        imatge.setDescripcio("La prova de AD");
        imatge.setAutor("Joan");
        imatge.setKeywords("Key");
        imatge.setDataCreacio("21/02/2012");
        
        int result = port.registreImatge(imatge);
        
        if (result == 1) {
            out.println("<h1>Usuari registrat amb èxit</h1>");
        } else {
            out.println("<h1>Error al registrar l'usuari</h1>");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        System.out.print(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>