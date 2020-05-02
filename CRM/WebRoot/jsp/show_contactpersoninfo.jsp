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
      <!-- 显示窗口的地方 -->
<div id="here"></div>
<!-- 要嵌入到窗口的内容 -->
<div id="contactpersoninfowin" style="display:none;">
<form name='saveContactPersonInfo' action='saveContactPersonInfo.action' method='post'>
	  <input type='hidden' name='customerId' value='' id='customerId'>
	  <table width='100%' height='48' border='1' cellpadding='0' cellspacing='0'  bordercolor='#FFFFFF' bordercolordark='#aaaaaa'  bordercolorlight='#FFFFFF'>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>姓名：</td><td><input type='text' name='contactName' value='<s:property value='#request.contactpersoninfo.contactName'/>' ></td>
	  <td bgcolor='#eeeeee'>职务：</td><td><input type='text' name='contactPost' value='' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>客户姓名：</td> <td><input type='text' name='customerName' value='' id='customerName' readOnly='readonly'><img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenCustomer()'/></td>
	  <td bgcolor='#eeeeee'>Q Q：</td><td><input type='text' name='contactQQNumber' value='' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>生日：</td><td><input type='text' name='contactBirthday' value='' id='contactBirthday' readOnly='readonly' onfocus='HS_setDate(this)'></td>
	  <td bgcolor='#eeeeee'>性别：</td><td>男<input type='radio' name='contactSex' value='男' 
         checked> 女<input type='radio' name='contactSex' value='女' ></td>
	  </tr>
	  <tr style='padding:5px;'> 
	  <td bgcolor='#eeeeee'>个人手机：</td> <td><input type='text' name='contactMobilePhone' value='' ></td>
	  <td bgcolor='#eeeeee'>办公电话：</td> <td><input type='text' name='contactOfficePhone' value='' ></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>电子邮箱：</td> <td><input type='text' name='contactEmail' value='' ></td> 
	  <td bgcolor='#eeeeee'>登记日期：</td> <td><input type='text' name='contactRegistDate' value='' id='contactRegistDate' readOnly='readonly' onfocus='HS_setDate(this)'></td>
	  </tr>
	  <tr style='padding:5px;'>
	  <td bgcolor='#eeeeee'>备注：</td><td colspan='3'><textarea name='contactRemarks' cols='50' rows='3' ></textarea></td>
	  </tr>
	  <tr align='center'>
	  <td colspan='4'>  <input type='button' value='提交' onclick="contactpersonAdd()" ><input type='reset' value='重置'></td>
	  </tr></table></form>
</div>
	  <form action="contactPersonInfoQuery.action?currentPage=1" method="post">
		  <table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
		         <tr>
			         <td colspan="2" width="100%" align="center">
			           请输入查询条件：
				         <select name="type" class="textarea">
		                  <option value="contactName" ${contactName}>联系人名称</option>
				         </select>
				         <input name="key"  type="text" class="txt_grey" size="24" value="${key}">
				         <input type="submit" class="subt_grey" value="搜索">
			         </td>
		         </tr>
		  </table>
	  </form>
  
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
				      <td align="center"> 编号</td>
				      <td align="center"> 客户名称</td>
				      <td align="center"> 联系人姓名</td>
				      <td align="center"> 联系人性别</td>
				      <td align="center"> 联系人职务</td>
				      <td align="center"> 联系人办公电话</td>
				      <td align="center"> 联系人个人电话</td>
				      <td align="center"> 联系人QQ号码</td>
				      <td align="center"> 查看详情</td>
				      <td align="center"> 修改</td>
				      <td align="center"> 删除</td>
			  </tr>
			  <s:iterator value="#request.findAllContactPersonInfo" id="contactPersonInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" name="checkboxDelete" value="${contactPersonInfo.contactId }"> </td>
				      <td align="center"> ${contactPersonInfo.contactId }</td>
				      <td align="center"> ${contactPersonInfo.customerinfo.customerName }</td>
				      <td align="center"> ${contactPersonInfo.contactName }</td>
				      <td align="center"> ${contactPersonInfo.contactSex }</td>
				      <td align="center"> ${contactPersonInfo.contactPost }</td>
				      <td align="center"> ${contactPersonInfo.contactOfficePhone }</td>
				      <td align="center"> ${contactPersonInfo.contactMobilePhone }</td>
				      <td align="center"> ${contactPersonInfo.contactQqnumber }</td>
				      <td align="center"> <input type="button" name="detail"  value="查看详情" onclick="showFindContactPersonInfoDetail(${contactPersonInfo.contactId });"> </td>
				      <td align="center"> <img src="<%=basePath%>/image/modify.gif" width="15" height="15" alt="修改信息" onclick="showUpdateContactPersonInfo(${contactPersonInfo.contactId })"></td>
				      <td align="center"> <img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="删除信息" onclick="deleteContactPersonInfo(${contactPersonInfo.contactId});"></td>
			  </tr>	
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.hasPrePage">
				         <a href="contactPersonInfo.action?currentPage=1">首页</a>
				         <a href="contactPersonInfo.action?currentPage=${request.page.currentPage-1 }">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>
				      
				       <s:if test="#request.page.hasNextPage">
				         <a href="contactPersonInfo.action?currentPage=${request.page.currentPage+1 }">下一页</a>
				         <a href="contactPersonInfo.action?currentPage=${request.page.totalPage }">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>
			  
	  </table>
	     <input type="button" value="批量删除" onclick="deleteContactPersonInfoBetch();">
		 <input type="button" value="添加"     onclick="showContactperinfoAdd();">
		 <script type="text/javascript" src="<%=basePath%>/js/show_floatwin.js"></script>
		 <script type='text/javascript' src='<%=basePath%>/js/date.js'></script>
		 <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
         <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
		 <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddContactPersonInfoAjax.js'></script>
		 <script type="text/javascript" >
		  var showwin = document.getElementById("contactpersoninfowin"); 
		  function showContactperinfoAdd(){
		         if(showwin.style.display == "none"){
		    	 document.getElementById("here").appendChild(createdialog(500,200,showwin,"联系人信息添加",true));
		   }
		 }
		 /* 批量删除 */
		 function deleteContactPersonInfoBetch(){
		   var deleteBetch = window.confirm("是否进行批量删除?");
		   if(deleteBetch){
			    var checkboxDelete = DWRUtil.getValue("checkboxDelete");
			   AddContactPersonInfoAjax.deleteByIds(checkboxDelete,callbackresult);  
		   }
		 }
		 /* 逐一删除 */
		 function deleteContactPersonInfo(id){
		   var deleteBetch = window.confirm("是否进行删除?");
		   if(deleteBetch){
		       AddContactPersonInfoAjax.deleteById(id,callbackresult);
		   }
		 }
		 function callbackresult(data){
		   alert(data);
		   location.reload();
		 }
		 /* 全选删除 */
		 function quanxuan(){
                var quanxuan=document.getElementById("selectAll").checked;
                //alert(quanxuan);
                var selectAll=document.getElementsByName("checkboxDelete");
	            if(quanxuan){
	                for(var i=0;i<selectAll.length;i++){
	                selectAll[i].checked=true;
	                }
	            }else{
		            for(var i=0;i<selectAll.length;i++){
		                selectAll[i].checked=false;
		            }
	            } 
		 }
		 function OpenCustomer(){
		  window.open('anglecustomerInfo.action?currentPage=1&everyPage=2',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
		 }
		 function contactpersonAdd(){
		      var formMap = DWRUtil.getValues("saveContactPersonInfo");//
              AddContactPersonInfoAjax.saveContactPersonInfo(formMap,result);
		   }
        function result(data){
              alert(data);
              location.reload();//窗口刷新本页面
              //self.opener.location.reload();//父窗口刷新
        }
        function showFindContactPersonInfoDetail(contactpersoninfoId){
            window.open('contactPersonInfoDetail.action?contactpersoninfoId='+contactpersoninfoId);
        }
    </script>  
		 <form action="uploadExcelToJava.action" method="post" enctype="multipart/form-data">
			<input type="file"  name="excelFile" > 
			<input type="submit" value="上传Excel文件" > 
	     </form>
	     <a href="uploadDownJavaToExcel.action">下载Excel文件</a>
  </body>
</html>

