<!--
    JDBC JSP Example using Apache/Tomcat
    ------------------------------------
 -->

<html>
<head><title>JSP Page</title></head>
<body>

<%@ page import="java.sql.*" %>

<%
    try {
	// The newInstance() call is a work around for some broken Java implementations
        Class.forName("org.gjt.mm.mysql.Driver");
    }
    catch (Exception E) {
%>	<%= "Unable to load JDBC driver" %>
<%  }

    try {
	// Open MySQL JDBC Connection
	Connection Conn = DriverManager.getConnection(
	    "jdbc:mysql://localhost/mydatabase?user=myusername&password=mypassword");

	// Do something with the Connection
	Statement Stmt = Conn.createStatement();
	ResultSet RS = Stmt.executeQuery("SELECT myfield from mytable");

	// Return results to the HTML page
	while (RS.next()) {
%>   	    <%= RS.getString(1) %> <br>
<%	}
	// Clean up after ourselves
	RS.close();
	Stmt.close();
	Conn.close();    
    }
    catch (SQLException E) {
%>	<%= "SQLException: " + E.getMessage()   %> <br>
	<%= "SQLState:     " + E.getSQLState()  %> <br>
	<%= "VendorError:  " + E.getErrorCode() %> <br>
<%  }	
%>
</body>
</html>
		    