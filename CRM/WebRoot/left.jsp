<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>left布局</title>
    <script type="text/javascript" src="js/dtree.js"></script>
    <link rel="stylesheet" type="text/css" href="css/dtree.css">
    <link rel="stylesheet" type="text/css" href="css/leftStyle.css">
    <script type="text/javascript" src="dwr/engine.js"></script>
    <script type="text/javascript" src="dwr/interface/JSjzdflDAO.js"></script>
  </head>
  <body>
  <p> <a href="javascript:d.openAll();">打开全部</a> |  <a href="javascript:d.closeAll();">关闭全部</a></p>
  <script type="text/javascript">
  <!--
    var sjzdarr;
    DWREngine.setAsync(false);
    JSjzdflDAO.findAll(callback);
    DWREngine.setAsync(true);
    function callback(data){
      sjzdarr = data;
    }
    var d = new dTree('d');
      d.config.userCookies=false; //不使用cookies
	  d.config.useStatusText=true;//状态栏显示文本
	  d.config.closeSameLevel=true;//关闭同一层次的节点
      //root
	  d.add(0,-1,"客户关系管理系统");
	  //一级导航栏
	  d.add(1,0,"客户信息");
	  d.add(2,0,"客户服务");
      d.add(3,0,"日程/任务");
      d.add(4,0,"项目管理");
      d.add(5,0,"系统管理");
      d.add(6,0,"数据字典");
      d.add(7,0,"消息提醒"); 
      //二级导航栏
      d.add(11,1,"客户","anglecustomerInfo.action?everyPage=1&currentPage=1","","main");
      d.add(12,1,"联系人","jsp/loadingContactPersonInfo.jsp","","main");
      d.add(21,2,"客户投诉");
      d.add(22,2,"投诉报表");
      d.add(31,3,"日程");
      d.add(32,3,"任务");
      d.add(41,4,"项目立项");
      d.add(42,4,"项目审批");
      d.add(43,4,"项目进程");
      d.add(44,4,"项目总结");
      d.add(45,4,"项目交易");
      d.add(51,5,"角色","showRoleInfo.action?currentPage=1","","main");
      d.add(52,5,"用户");
      d.add(61,6,"录入数据字典分类","showSjzdfl.action","","main");
      var i;
      for(i=0;i<sjzdarr.length;i++){
        if(sjzdarr[i].sjzdflmc != null && sjzdarr[i].sjzdflmc != "" && sjzdarr[i].enable == "yes")
        d.add(62+i,6,sjzdarr[i].sjzdflmc,"showSjzdxx.action?sjzdflId="+sjzdarr[i].sjzdflId,"","main");
      }
      d.add(62+i,6,"客户级别","showCustomerlevel.action","","main");
      d.add(71,7,"短消息");
      document.write(d);
  -->
  </script>
  </body>
</html>
