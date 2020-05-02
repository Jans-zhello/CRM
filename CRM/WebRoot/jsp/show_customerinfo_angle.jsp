<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户添加</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
   function toSup(customerName,customerId){
       window.opener.document.all.customerName.value=customerName;
       window.opener.document.all.customerId.value=customerId;
       window.close();
   }    
    </script>
  </head>
  <body> 
	  <form action="customerInfoQuery.action?currentPage=1" method="post">
		  <table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
		         <tr>
			         <td colspan="2" width="100%" align="center">
			           请输入查询条件：
				         <select name="type" class="textarea">
		                  <option value="customerName" ${customerName }> 客户名称</option>
			              <option value="customerAddress" ${customerAddress }>客户地址</option>
			              <option value="customerProvinces" ${customerProvinces }>所属省份</option>
			              <option value="customerCity" ${customerCity }>所属城市</option>
			              <option value="customerCode" ${customerCode }>公司邮编</option>
			              <option value="bankAccount" ${bankAccount }>银行账号</option>
			              <option value="customerCompanyWebsize" ${customerCompanyWebsize }>公司网址</option>
			              <option value="customerCompanyPhone" ${customerCompanyPhone }>公司电话</option>
			              <option value="noteInformation" ${noteInformation }>备注信息</option>
				         </select>
				         <input name="key"  type="text" class="txt_grey" size="24" value="${key}">
				         <input type="submit" class="subt_grey" value="搜索">
			         </td>
		         </tr>
		  </table>
	  </form>
       <form action="anglecustomerInfo.action" method="post">
	       <span>
	       <input type="text" name="everyPage" value="" placeholder="输入每页展示的数量">
	       <input type="hidden" name="currentPage" value="1">
	       <input type="submit" value="确定">
	       </span>
       </form>
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
				      <td align="center"> 编号</td>
				      <td align="center"> 客户名称</td>
				      <td align="center"> 客户性质</td>
				      <td align="center"> 客户类型</td>
				      <td align="center"> 客户级别</td>
				      <td align="center"> 公司网址</td>
				      <td align="center"> 公司电话</td>
				      <td align="center"> 登记人</td>
				      <td align="center"> 查看详情</td>
				      <td align="center"> 修改</td>
				      <td align="center"> 删除</td>
			  </tr>
			  <s:iterator value="#request.findAllCustomerInfo" id="CustomerInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" name="checkboxDelete" value="${CustomerInfo.customerId }"> </td>
				      <td align="center"> ${CustomerInfo.customerId }</td>
				      <td align="center"><a href="javascript:toSup('${CustomerInfo.customerName}','${CustomerInfo.customerId}');">${CustomerInfo.customerName }</a> </td>
				      <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerProperties.sjzdxxmc }</td>
				      <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerType.sjzdxxmc }</td>
				      <td align="center"> ${CustomerInfo.customerLevel.levelName }</td>
				      <td align="center"> ${CustomerInfo.customerCompanyWebsize }</td>
				      <td align="center"> ${CustomerInfo.customerCompanyPhone }</td>
				      <td align="center"> ${CustomerInfo.register }</td>
				      <td align="center"> <input type="button" name="detail"  value="查看详情" onclick="window.open('customerInfoDetail.action?customerinfoId=${CustomerInfo.customerId}');"> </td>
				      <td align="center"> <img src="<%=basePath%>/image/modify.gif" width="15" height="15" alt="修改信息" onclick="window.open('customerInfoUpdate.action?customerId=${CustomerInfo.customerId}');"></td>
				      <td align="center"> <img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="删除信息" onclick="deleteCustomerInfo(${CustomerInfo.customerId});"></td>
			  </tr>	
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.hasPrePage">
				         <a href="anglecustomerInfo.action?currentPage=1&everyPage=${request.page.everyPage}">首页</a>
				         <a href="anglecustomerInfo.action?currentPage=${request.page.currentPage-1 }&everyPage=${request.page.everyPage}">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>
				      
				       <s:if test="#request.page.hasNextPage">
				         <a href="anglecustomerInfo.action?currentPage=${request.page.currentPage+1 }&everyPage=${request.page.everyPage}">下一页</a>
				         <a href="anglecustomerInfo.action?currentPage=${request.page.totalPage }&everyPage=${request.page.everyPage}">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>
	  </table>
	     <input type="button" value="批量删除" onclick="deleteBetch();"/>
		 <input type="button" value="添加" onclick="window.open('${'customerInfo.action'}')">
  </body>
</html>

