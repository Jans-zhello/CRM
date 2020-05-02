<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>录入各种字典分类信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="updateSjzdxx.action" method="post">
<center><img src="image/user.gif"><font size="2">录入${requestScope.sjzdflmc}</font></center>
	<table align="center" border="1" cellspacing="0">
		<tr bgcolor="#666666" height="27">
			<td align="center"><font color="#FFFFFF" size="2">序号</font></td>
			<td align="center"><font color="#FFFFFF" size="2">启用</font></td>
			<td align="center"><font color="#FFFFFF" size="2">选项</font></td>
		</tr>
		<s:hidden name="sjzdflId" value="%{#request.sjzdflId}"></s:hidden>
		<s:iterator value="#request.allsjzdxx" id="sjzdxx">
			<tr bgcolor="#E3E3E3" >
				<td align="center"><s:property value="%{#sjzdxx.sjzdxxId % 10 == 0 ? #sjzdxx.sjzdxxId % 10 + 10: #sjzdxx.sjzdxxId % 10}"/></td>
				<s:hidden name="sjzdxxIds" value="%{#sjzdxx.sjzdxxId}"></s:hidden>
				<td align="center"><input type="checkbox"  
				<s:if test="#sjzdxx.enable == 'yes' ">
				checked="checked"
				</s:if>
				 name="checks" value='qiyong<s:property value="#sjzdxx.sjzdxxId"/>'> </td>
				<td align="center"><input type="text" name="sjzdxxmcs"  value='<s:property value="#sjzdxx.sjzdxxmc"/>'> </td>
		    </tr>
		</s:iterator>
	</table>
	<br>
	<center><input type="submit" value="提交">  </center>
</form>
    
  </body>
</html>
