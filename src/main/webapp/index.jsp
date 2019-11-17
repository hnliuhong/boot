<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>商品入库</title>
  </head>
  <body>
    <%=application%>
    <form method="post" action="${pageContext.request.contextPath}/product/save">
         产品名称:<input type="text" name="name" /><br />
         产品价格:<input type="text" name="price" /><br />
         产品备注:<input type="text" name="remark" /><br />
        <button type="submit">提交</button>
    </form>
  </body>
</html>
