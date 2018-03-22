<%@include file="//includes/header_user.jsp" %>
        You are now logged in as a customer of our wonderful site.
        <h2>Min Profil</h2>
        <h3>Email: </h3>
        <h3><%=user.getEmail()%></h3>
        <h3>password: </h3>
        <h3><%=user.getPassword()%></h3>
        <h2>Order</h2>
        <table style="border: solid black">
            <tr>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3><%=order.getOrderID() %></h3></a></td>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3>0rder 2</h3></a></td>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3>Order 3</h3></a></td>
            </tr>
        </table>
        <h2>Tideliger Order</h2>
        <table style="border: solid black">
            <tr>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3>Order 1</h3></a></td>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3>Order 2</h3></a></td>
                <td style="border: solid black 1px"><a href="" style="color: black"><h3>Order 3</h3></a></td>
            </tr>
        </table>
<%@include file="//includes/footer_user.jsp" %>
