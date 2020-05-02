<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>联系人信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
  </head>
  <body>
<form name='saveContactPersonInfo' action='saveContactPersonInfo.action' method='post'>
	  <input type='hidden' name='customerId' value='${contactpersoninfo.customerinfo.customerId }' id='customerId'>
	  <table width='100%' height='48' border='1'  align="center" cellpadding='0' cellspacing='0'  bordercolor='#FFFFFF' bordercolordark='#aaaaaa'  bordercolorlight='#FFFFFF'>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>姓名：</td><td><input type='text' name='contactName' value='<s:property value='#request.contactpersoninfo.contactName'/>' ></td>
	  <td bgcolor='#eeeeee'>职务：</td><td><input type='text' name='contactPost' value='${contactpersoninfo.contactPost }' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>客户姓名：</td> <td><input type='text' name='customerName' value='${contactpersoninfo.customerinfo.customerName }' id='customerName' readOnly='readonly'><img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenCustomer()'/></td>
	  <td bgcolor='#eeeeee'>Q Q：</td><td><input type='text' name='contactQQNumber' value='${contactpersoninfo.contactQqnumber }' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>生日：</td><td><input type='text' name='contactBirthday' value='${contactpersoninfo.contactBirthday}' id='contactBirthday' readOnly='readonly' onfocus='HS_setDate(this)'></td>
	  <td bgcolor='#eeeeee'>性别：</td><td>
      <s:if test='#request.contactpersoninfo.contactSex != "男 " '>
          男<input type='radio' name='contactSex' value='男' checked>
          女<input type='radio' name='contactSex' value='女' > 
         </s:if>	   
         <s:else >
                   男<input type='radio' name='contactSex' value='男' >
                  女<input type='radio' name='contactSex' value='女' checked> 
         </s:else>   
	  </td>
	  </tr>
	  <tr style='padding:5px;'> 
	  <td bgcolor='#eeeeee'>个人手机：</td> <td><input type='text' name='contactMobilePhone' value='${contactpersoninfo.contactMobilePhone }' ></td>
	  <td bgcolor='#eeeeee'>办公电话：</td> <td><input type='text' name='contactOfficePhone' value='${contactpersoninfo.contactOfficePhone }' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>电子邮箱：</td> <td><input type='text' name='contactEmail' value='${contactpersoninfo.contactEmail }' ></td> 
	  <td bgcolor='#eeeeee'>登记日期：</td> <td><input type='text' name='contactRegistDate' value='${contactpersoninfo.contactRegistDate}' id='contactRegistDate' readOnly='readonly' onfocus='HS_setDate(this)'></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>备注：</td><td colspan='3'><textarea name='contactRemarks' cols='50' rows='3' >${contactpersoninfo.contactRemarks}</textarea></td>
	  </tr>
	  <tr align='center'>
	  <td colspan='4'>  <input type='submit' value='提交'  ><input type='reset' value='重置'></td>
	  </tr></table>
	  </form>
  </body>
</html>

