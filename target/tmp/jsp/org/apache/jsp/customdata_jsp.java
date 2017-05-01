package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class customdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"text-align: center\">客户管理</h1>\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"cm-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\" closed=\"true\"\r\n");
      out.write("\t\tbuttons=\"#cm-dlg-buttons\" closable=\"false\" closed=\"true\" modal=\"false\">\r\n");
      out.write("\t\t<form id=\"cm-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"name\" class=\"label-top\">客户姓名:</label> <input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入客户姓名',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[2,10]'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"name\" name=\"name\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"education\" class=\"label-top\">教育水平:</label> <select id=\"education\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-combobox\" panelHeight=\"auto\" name=\"education\" style=\"width:100px;\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"editable:false\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">本科</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">专科</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">高中</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">硕士</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"phoneNo\" class=\"label-top\">手机:</label> <input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入客户手机',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:['number']\"\r\n");
      out.write("\t\t\t\t\t\tid=\"phoneNo\" name=\"phoneNo\" style=\"width: 270px;margin-left: 20px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"qq\" class=\"label-top\">qq:</label><span style=\"margin-left: 32px\"> <input class=\"easyui-textbox\" id=\"qq\" name=\"qq\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"missingMessage:'请输入客户qq',tipPosition:'bottom',validateOnCreate:false,validateOnBlur:true,validType:'QQ'\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 270px;\" /></span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"email\" class=\"label-top\">邮箱:</label> <span style=\"margin-left: 20px\"> <input class=\"easyui-textbox\" id=\"email\"\r\n");
      out.write("\t\t\t\t\t\tname=\"email\" style=\"width: 270px\" /></span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"customStatus\" class=\"label-top\">客户状态:</label><select id=\"customStatus\"\r\n");
      out.write("\t\t\t\t\t\tpanelHeight=\"auto\" class=\"easyui-combobox\" name=\"customStatus\" style=\"width:100px;\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"editable:false\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\" selected=\"selected\">新增未上门</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">新增已上门</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">销售跟进中</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">咨询跟进中</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">死单</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">已报名</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"cm-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveCustom()\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#cm-ff').form('resetValidation').form('reset');$('#cm-dlg').dialog('close');\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div id=\"cm-query\" class=\"easyui-panel\" closed=\"true\" noheader=\"true\" closable=\"true\">\r\n");
      out.write("\t\t\t<div id=\"cm-toolbar\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\"\r\n");
      out.write("\t\t\t\t\tonclick=\"javascript:$('#cm-dg').edatagrid('saveRow')\">保存修改</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\"\r\n");
      out.write("\t\t\t\t\tonclick=\"javascript:$('#cm-dg').edatagrid('cancelRow')\">退出编辑</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-large-clipart\" plain=\"true\" onclick=\"allotToSales()\">新增未上门客户分配</a>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-large-clipart\" plain=\"true\"\r\n");
      out.write("\t\t\t\t\tonclick=\"openAllotDlg()\">新增已上门客户分配</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table id=\"cm-dg\" title=\"查询结果\" singleSelect=\"true\" toolbar=\"#cm-toolbar\" autoSave=\"false\"\r\n");
      out.write("\t\t\t\tidField=\"id\" pagination=\"true\" pageSize=\"5\" pageList=\"[5,10,15,20]\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"id\" width=\"100\" align=\"center\">客户编号</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"name\" width=\"100\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\t\teditor=\"{type:'validatebox',options:{required:true}}\">客户姓名</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"education\" width=\"100\" align=\"center\" formatter=\"eduFormat\"\r\n");
      out.write("\t\t\t\t\t\t\teditor=\"{type:'combobox',options:{data:[{'education':'1','text':'本科'},\r\n");
      out.write("\t\t\t\t{'education':'2','text':'专科'},\r\n");
      out.write("\t\t\t\t{'education':'3','text':'高中'},\r\n");
      out.write("\t\t\t\t{'education':'4','text':'硕士'}],valueField:'education',textField:'text',panelHeight:'auto'}}\">教育水平</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=phoneNo width=\"100\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\t\teditor=\"{type:'validatebox',options:{required:true}}\">手机</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=qq width=\"150\" align=\"center\" editor=\"{type:'validatebox'}\">qq</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=email width=\"150\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\t\teditor=\"{type:'validatebox',options:{validType:'email'}}\">邮箱</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=customStatus width=\"100\" formatter=\"statuFormat\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\t\teditor=\"{type:'combobox',options:{data:[{'customStatus':'0','text':'新增未上门'},\r\n");
      out.write("\t\t\t\t{'customStatus':'1','text':'新增已上门'},\r\n");
      out.write("\t\t\t\t{'customStatus':'2','text':'销售跟进中'},\r\n");
      out.write("\t\t\t\t{'customStatus':'3','text':'咨询跟进中'},{'customStatus':'4','text':'死单'},{'customStatus':'5','text':'已报名'}],valueField:'customStatus',textField:'text',panelHeight:'auto'}}\">状态</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=createDate width=\"200\" align=\"center\">创建日期</th>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"consult-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\"\r\n");
      out.write("\t\tbuttons=\"#consult-dlg-buttons\" closed=\"true\" closable=\"true\" modal=\"false\" title='请选择咨询师'>\r\n");
      out.write("\t\t<form id=\"consult-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"consultManId\" class=\"label-top\">请选择咨询师:</label> <input id=\"cosulterID\"\r\n");
      out.write("\t\t\t\t\t\tname=\"consultManId\" style=\"height: 32px;width: 100px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"consult-dlg-buttons\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\tonclick=\"allotToConsult()\" style=\"width:90px\">确认分配</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\tonclick=\"javascript:$('#consult-dlg').dialog('close')\" style=\"width:90px\">取消</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"import-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\" closed=\"true\"\r\n");
      out.write("\t\tclosable=\"true\" modal=\"false\" title='批量导入客户信息'>\r\n");
      out.write("\t\t<form id=\"import-ff\" method=\"post\" enctype=\"multipart/form-data\" style=\"margin: 20px\">\r\n");
      out.write("\t\t\t<div style=\"margin-bottom:40px\">\r\n");
      out.write("\t\t\t\t<input class=\"easyui-filebox\" name=\"file\" id=\"file\" labelPosition=\"top\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"prompt:'请选择客户excel文件...'\" style=\"width:100%\" buttonText=\"选择文件\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" style=\"width:50%;margin-left: 25%\"\r\n");
      out.write("\t\t\t\t\tonclick=\"upload()\">确认上传</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"dld-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\" closed=\"true\"\r\n");
      out.write("\t\tclosable=\"true\" modal=\"false\" title='请选择要导出的'>\r\n");
      out.write("\t\t<form id=\"import-ff\" method=\"post\" enctype=\"multipart/form-data\" style=\"margin: 20px\">\r\n");
      out.write("\t\t\t<div style=\"margin-bottom:40px\">\r\n");
      out.write("\t\t\t\t<input class=\"easyui-filebox\" name=\"file\" id=\"file\" labelPosition=\"top\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"prompt:'请选择客户excel文件...'\" style=\"width:100%\" buttonText=\"选择文件\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" style=\"width:50%;margin-left: 25%\"\r\n");
      out.write("\t\t\t\t\tonclick=\"upload()\">确认导出</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('#cm-dg').edatagrid({\r\n");
      out.write("\t\t\t\tupdateUrl : 'updateCustom.do'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction saveCustom() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#cm-ff').form('submit', {\r\n");
      out.write("\t\t\t\turl : 'insertCustom.do',\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data ==1) {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('OK', \"客户添加成功!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t$('#cm-ff').form(\"resetValidation\").form(\"reset\");\r\n");
      out.write("\t\t\t\t\t\t$('#cm-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t$('#cm-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('Sorry', '客户已存在!', 'error');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction eduFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.education == 1) {\r\n");
      out.write("\t\t\t\treturn '本科';\r\n");
      out.write("\t\t\t} else if (row.education == 2) {\r\n");
      out.write("\t\t\t\treturn '专科';\r\n");
      out.write("\t\t\t} else if (row.education == 3) {\r\n");
      out.write("\t\t\t\treturn '高中';\r\n");
      out.write("\t\t\t} else if (row.education == 4) {\r\n");
      out.write("\t\t\t\treturn '硕士';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 客户状态格式化方法 */\r\n");
      out.write("\t\tfunction statuFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.customStatus == 0) {\r\n");
      out.write("\t\t\t\treturn '新增未上门';\r\n");
      out.write("\t\t\t} else if (row.customStatus == 1) {\r\n");
      out.write("\t\t\t\treturn '新增已上门';\r\n");
      out.write("\t\t\t} else if (row.customStatus == 2) {\r\n");
      out.write("\t\t\t\treturn '销售跟进中';\r\n");
      out.write("\t\t\t} else if (row.customStatus == 3) {\r\n");
      out.write("\t\t\t\treturn '咨询跟进中';\r\n");
      out.write("\t\t\t} else if (row.customStatus == 4) {\r\n");
      out.write("\t\t\t\treturn '死单';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\treturn '已报名';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 搜索执行方法 */\r\n");
      out.write("\t\tfunction queryCustom() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar value = null;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar type = queryType();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 'createDate') {\r\n");
      out.write("\t\t\t\tvalue = $('#qdate').datebox('getValue');\r\n");
      out.write("\t\t\t} else if (type == 'customStatus') {\r\n");
      out.write("\t\t\t\tvalue = $(\"#state\").val();\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tvalue = \"%25\" + $(\"#param\").val() + \"%25\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 'all') {\r\n");
      out.write("\t\t\t\t$(\"#cm-dg\").edatagrid({\r\n");
      out.write("\t\t\t\t\turl : 'queryCustom.do',\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function() {\r\n");
      out.write("\t\t\t\t\t\t$('#cm-query').panel('open');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (value !== \"%25%25\" && value !== '') {\r\n");
      out.write("\t\t\t\t\t$(\"#cm-dg\").edatagrid({\r\n");
      out.write("\t\t\t\t\t\turl : 'queryCustom.do?' + type + \"=\" + value,\r\n");
      out.write("\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data.rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('sorry', '未查询到相关记录！', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#cm-query').panel('open');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('error', '请输入查询条件！', 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 获取查询条件类型 */\r\n");
      out.write("\t\tfunction queryType() {\r\n");
      out.write("\t\t\tvar type = $('#qtype').val();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 'createDate') {\r\n");
      out.write("\t\t\t\t$(\"#date\").css('display', 'inline');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#date\").css('display', 'none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 'customStatus') {\r\n");
      out.write("\t\t\t\t$(\"#state\").css('display', 'inline');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#state\").css('display', 'none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (type != 'createDate' && type != 'customStatus' && type != 'all') {\r\n");
      out.write("\t\t\t\t$(\"#input\").css('display', 'inline');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#input\").css('display', 'none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn type;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 分配状态为新增为上门的客户 */\r\n");
      out.write("\t\tfunction allotToSales() {\r\n");
      out.write("\t\t\t$.post('allotCustom.do', function(data) {\r\n");
      out.write("\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('OK', '所有新增客户已分配!', 'info');\r\n");
      out.write("\t\t\t\t\t$('#cm-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('Sorry', '无新增客户!', 'warning');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 打开分配已上门客户对话框 */\r\n");
      out.write("\t\tfunction openAllotDlg() {\r\n");
      out.write("\t\t\tvar row = $('#cm-dg').datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (row == null) {\r\n");
      out.write("\t\t\t\t$.messager.alert('Sorry', '请选择客户!', 'warning');\r\n");
      out.write("\t\t\t} else if (row.customStatus != 1) {\r\n");
      out.write("\t\t\t\t$.messager.alert('Sorry', '必须是新增已上门客户，请重新选择!', 'warning');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$('#cosulterID').combobox({\r\n");
      out.write("\t\t\t\t\turl : 'queryConsulters.do',\r\n");
      out.write("\t\t\t\t\tvalueField : 'id',\r\n");
      out.write("\t\t\t\t\ttextField : 'realname',\r\n");
      out.write("\t\t\t\t\tpanelHeight : 'auto',\r\n");
      out.write("\t\t\t\t\teditable : false,\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('#consult-dlg').dialog('open');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 分配已上门客户 */\r\n");
      out.write("\t\tfunction allotToConsult() {\r\n");
      out.write("\t\t\tvar row = $('#cm-dg').datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\"#cosulterID\").combobox('getValue') != '') {\r\n");
      out.write("\t\t\t\t$('#consult-ff').form('submit', {\r\n");
      out.write("\t\t\t\t\turl : 'allotToConsult.do',\r\n");
      out.write("\t\t\t\t\tonSubmit : function(param) {\r\n");
      out.write("\t\t\t\t\t\tparam.customId = row.id;\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#consult-dlg').dialog('close')\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', \"客户分配成功!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t\t$('#cm-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('Sorry', '客户分配失败!', 'error');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$.messager.alert('Sorry', '请选择咨询师!', 'warnning');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 上传excel 批量导入用户 */\r\n");
      out.write("\t\tfunction upload() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar file = $(\"#file\").filebox('getValue');\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (file == '') {\r\n");
      out.write("\t\t\t\t$.messager.alert('警告', '请选择客户信息excel!', 'warnning');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tvar type = file.substr(file.lastIndexOf(\".\"));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (type == \".xls\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$('#import-ff').form('submit', {\r\n");
      out.write("\t\t\t\t\t\turl : 'batchImportCustom.do',\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data >= 0) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#import-ff').form('reset');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#import-dlg').dialog('close');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('OK', \"成功导入\" + data + \"个客户!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t\t} else if (data == \"false\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#import-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('Sorry', '文件上传失败!', 'error');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('警告', '文件类型不匹配,必须是MS2003版本的.xls文件', 'warnning');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==5 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div style=\"margin: 20px 20px;width: 400px\">\r\n");
        out.write("\t\t<span style=\"font-size: 18;font-weight: bold;\">添加客户：</span><a href=\"javascript:void(0)\"\r\n");
        out.write("\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
        out.write("\t\t\tonclick=\"javascript:$('#cm-dlg').dialog('open').dialog('center').dialog('setTitle','添加权限');\"\r\n");
        out.write("\t\t\tstyle=\"height: 32px\">新增单个客户</a> \r\n");
        out.write("\t\t\t\r\n");
        out.write("\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==7 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div style=\"margin: 20px 20px;width: 400px\">\r\n");
        out.write("\t\t<span style=\"font-size: 18;font-weight: bold;\">添加客户：</span><a href=\"javascript:void(0)\"\r\n");
        out.write("\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
        out.write("\t\t\tonclick=\"javascript:$('#cm-dlg').dialog('open').dialog('center').dialog('setTitle','添加客户');\"\r\n");
        out.write("\t\t\tstyle=\"height: 32px\">新增单个客户</a> <span style=\"margin-left: 30px\">\r\n");
        out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-man'\"\r\n");
        out.write("\t\t\tstyle=\"height: 32px\" onclick=\"javascript:$('#import-dlg').dialog('open')\">excel批量导入</a></span>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t</div>\r\n");
        out.write("\t\r\n");
        out.write("\t<div style=\"margin-left: 20px;margin-bottom: 40px\">\r\n");
        out.write("\t\t<div id=\"navigation\" style=\"margin: 0 auto\">\r\n");
        out.write("\t\t\t<span style=\"font-size: 18;font-weight: bold;\">查询类型:</span><select id=\"qtype\" name=\"qtype\"\r\n");
        out.write("\t\t\t\tstyle=\"width:150px;height: 32px;margin-left: 10px\" onchange=\"queryType()\">\r\n");
        out.write("\t\t\t\t<option value=\"all\" selected=\"selected\">查询所有</option>\r\n");
        out.write("\t\t\t\t<option value=\"name\">按客户姓名查询</option>\r\n");
        out.write("\t\t\t\t<option value=\"customStatus\">按客户状态查询</option>\r\n");
        out.write("\t\t\t\t<option value=\"inviteName\">按邀约人姓名</option>\r\n");
        out.write("\t\t\t\t<option value=\"phoneNo\">按客户手机号码查询</option>\r\n");
        out.write("\t\t\t\t<option value=\"createDate\">按导入日期查询</option>\r\n");
        out.write("\t\t\t</select> <span style=\"display: none\" id=\"input\"><input class=\"easyui-textbox\"\r\n");
        out.write("\t\t\t\tdata-options=\"iconCls:'icon-edit',prompt:'请输入查询条件'\" style=\"width:300px;height: 32px;\" id=\"param\">\r\n");
        out.write("\t\t\t</span> <span style=\"display: none\" id=\"date\">创建日期：<input class=\"easyui-datebox\"\r\n");
        out.write("\t\t\t\tdata-options=\"currentText:'今天'\" style=\"width:110px;height: 32px\" id=\"qdate\">\r\n");
        out.write("\t\t\t</span> <select id=\"state\" name=\"state\" style=\"width:150px;height: 32px;display: none\">\r\n");
        out.write("\t\t\t\t<option value=\"0\" selected=\"selected\">新增未上门</option>\r\n");
        out.write("\t\t\t\t<option value=\"1\">新增已上门</option>\r\n");
        out.write("\t\t\t\t<option value=\"2\">销售跟进中</option>\r\n");
        out.write("\t\t\t\t<option value=\"3\">咨询跟进中</option>\r\n");
        out.write("\t\t\t\t<option value=\"4\">死单</option>\r\n");
        out.write("\t\t\t\t<option value=\"5\">已报名</option>\r\n");
        out.write("\t\t\t</select> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\"\r\n");
        out.write("\t\t\t\tonclick=\"queryCustom()\" style=\"height: 32px;margin-left: 10px\">&nbsp;搜索 &nbsp;</a>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
