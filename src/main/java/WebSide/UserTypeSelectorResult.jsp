<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
    <h1>
        Current Users
    </h1>
        <%
List result= (List) request.getAttribute("types");
Iterator it = result.iterator();
out.println("<br>Users: <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>