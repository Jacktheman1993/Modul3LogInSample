<%@include file="//includes/header_user.jsp" %>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>

        <h1>My Profil</h1>
        
        <h2>Order</h2>
        <!---

        --->
        <h2>Tidligere Order</h2>
        <!---
        Går ind på detaljer på de enkel ordre med styk lister, som ikke bliver udregnet i data
        --->
<%@include file="//includes/footer_user.jsp" %>
