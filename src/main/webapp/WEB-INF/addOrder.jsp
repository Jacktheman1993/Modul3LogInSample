<%@page import="FunctionLayer.order"%>
<%@include file="//includes/header_user.jsp" %>
        <h1>Added order</h1>
        <h2>Height</h2>
            <% order Order = (order)session.getAttribute("height");%>
            <h2>Length</h2>    
            <% session.getAttribute("length"); %>
            <h2>Width</h2>
            <% session.getAttribute("width"); %>
        
<%@include file="//includes/footer_user.jsp" %>
