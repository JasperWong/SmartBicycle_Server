<%--
  Created by IntelliJ IDEA.
  User: lulee007
  Date: 16/1/21
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<%--显示我们的设置的标题--%>
<h1>${title}</h1>
<%--显示我们从数据库取出来的用户数据--%>
<table>
    <thead>
    <tr>
        <td>
            Name
        </td>
        <td>
            date
        </td>
        <td>
            distanceDay
        </td>
    </tr>
    </thead>
    <tbody>
    <%--struts2的遍历标签,循环取出用户的信息--%>
    <s:iterator value="userDays" id="userDay">
        <tr>
            <td>${userDay.username}</td>
            <td>${userDay.date}</td>
            <td>${userDay.distanceDay}</td>
        </tr>

    </s:iterator>
    </tbody>
</table>

</body>
</html>
