<%@include file="//includes/header_user.jsp" %>
<h1>Welcome to lego Shop</h1>



    Velkommen <%=user.getEmail()%>


<form name="login" action="FrontController" method="POST">
    <input type="hidden" name="command" value="house_lego">
    <h3>Length:</h3>
    <input type="number" name="length" value="0">
    <br>
    <h3>Width:</h3>
    <input type="number" name="width" value="0">
    <br>
    <h3>Height on wall:</h3>
    <input type="number" name="height" value="1">
    <br>
    <input type="submit" name="submit" value="Bestil Lego">
</form>
<br>
<%@include file="//includes/footer_user.jsp" %>
