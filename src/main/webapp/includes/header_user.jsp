<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>


<%@page import="FunctionLayer.User"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <nav>   
            <ul>
                <li><a href="FrontController?command=shop" style="float: left"><button>Shop</button></a></li>
                <li><a href="FrontController?page" style="float: left"><button>Min Profil</button></a></li>
                <li><a href="FrontController?command=help" style="float: left"><button>Få hjælp til din betilling</button></a>   </li>
            </ul>
        </nav>
  <% User user = (User)session.getAttribute("user");  %>
  <% Order order = (Order) request.getAttribute("order");%>
        