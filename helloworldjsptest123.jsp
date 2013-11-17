<%@ page contentType="text/html;charset=WINDOWS-1252"%>

<%--
   @author  Savitha
   @version 1.1


   Development Environment        :  Oracle9i JDeveloper
   Name of the Application        :  HelloWorld.jsp
   Creation/Modification History  :


       Savitha       05-SEP-2000     Created
       Srinivas      02-Jan-2002     Updated  For OC4J2.0

   Overview of Application        :


      This is a simple JSP sample showing how to display the message
      "Hello Oracle World" within a HTML page.
--%>

<HTML>

  <HEAD>
  <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=WINDOWS-1252">
  <META NAME="GENERATOR" CONTENT="Oracle JDeveloper">
    <TITLE>OC4J JSP Sample - Hello Oracle World</TITLE>
  </HEAD>
    <BODY background="../images/Background.gif">
       <P>

       <BR><BR><BR><BR><BR><BR><BR><BR><BR><BR>
       <B><CENTER><FONT COLOR=BLACK SIZE=5>
         <TABLE BORDER BGCOLOR=BLACK>
            <TR>
               <TD ALIGN=CENTER VALIGN=CENTER>
                  <B><FONT COLOR=RED SIZE=5>
                      <% out.println(" Hello Oracle World"); %> !
                  </B>

               </TD>
            </TR>
         </TABLE>
         </CENTER></B>
       </P>
     </BODY>
</HTML>
