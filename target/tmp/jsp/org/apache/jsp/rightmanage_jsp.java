package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class rightmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>权限管理</h1>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"rightToolbar\" style=\"margin: 0 auto\">\r\n");
      out.write("\t\t<span style=\"font-size: 18;font-weight: bold;margin-left: 20px\">功能导航：</span><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"false\" onclick=\"javascript:$('#rt-dlg').dialog('open').dialog('center').dialog('setTitle','新增权限');\" style=\"height: 32px\">&nbsp;新增权限&nbsp; </a> \r\n");
      out.write("\t\t<span style=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\" onclick=\"javascript:queryRirhts()\" style=\"height: 32px\">&nbsp;查询权限&nbsp;</a></span>\r\n");
      out.write("\t\t<!-- <span style=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-lock\" plain=\"false\" onclick=\"javascript:queryRirhts()\" style=\"height: 32px\">&nbsp;绑定权限&nbsp;</a></span> -->\r\n");
      out.write("\t\t <span style=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-lock\" plain=\"false\" onclick=\"javascript:$('#rt-dlr').dialog('open').dialog('center').dialog('setTitle','绑定权限');\" style=\"height: 32px\">&nbsp;绑定权限&nbsp;</a></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"rt-dlr\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\" buttons=\"#rt-dlg-buttons\" closable=\"false\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"rt-ffr\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label for=\"rightName\" class=\"label-top\">权限名称:</label> <input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入权限名称.长度为3-30',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[3,30]'\" id=\"rightNamer\" name=\"rightNamer\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"pid\" class=\"label-top\">所属职位：</label><input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入职位名称.长度为3-30',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[3,30]'\" id=\"jobName\" name=\"jobName\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("   <div id=\"rt-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"addRirhts()\" style=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#rt-ffr').form('resetValidation').form('reset');$('#rt-dlr').dialog('close');\" style=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addRirhts() {\r\n");
      out.write("\t\t$('#rt-ffr').form(\r\n");
      out.write("\t\t\t\t'submit',\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\turl : 'addRight.do',\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', \"绑定权限成功!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t\t$('#rt-ffr').form(\"clear\");\r\n");
      out.write("\t\t\t\t\t\t\t$('#rt-dlr').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t$('#rt-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('Sorry',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'Failed to save data!', 'error');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('#rt-dg').edatagrid({\r\n");
      out.write("\t\t\tsaveUrl: 'saveRight.do',\r\n");
      out.write("\t\t    updateUrl: 'updateRight.do',\r\n");
      out.write("\t\t    destroyUrl: 'deleteRight.do'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction queryRirhts() {\r\n");
      out.write("\t\t$.post(\"queryAllRights.do\",function(data) {\r\n");
      out.write("\t\t\t$(\"#rt-dg\").edatagrid({data:data});\r\n");
      out.write("\t\t\t$(\"#rt-dg\").edatagrid({onLoadSuccess:function(){\r\n");
      out.write("\t\t\t\t$('#rt-query').panel('open');\r\n");
      out.write("\t\t\t}});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction saveRight() {\r\n");
      out.write("\t\t\t$('#rt-ff').form(\r\n");
      out.write("\t\t\t\t\t'submit',\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\turl : 'insertRight.do',\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('OK', \"权限添加成功!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#rt-ff').form(\"clear\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#rt-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#rt-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('Sorry',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'Failed to save data!', 'error');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction format(value,row){\r\n");
      out.write("\t\t\tif(row.rightType==1){\r\n");
      out.write("\t\t\t\treturn '一级权限'\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn '二级权限'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"rt-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\" buttons=\"#rt-dlg-buttons\" closable=\"false\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"rt-ff\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label for=\"rightName\" class=\"label-top\">权限名称:</label> <input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入权限名称.长度为3-30',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[3,30]'\" id=\"rightName\" name=\"rightName\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"pid\" class=\"label-top\">所属权限：</label><select id=\"pid\" class=\"easyui-combobox\" name=\"pid\" style=\"width:100px;\" data-options=\"editable:false\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">权限管理</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">账号管理</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">报表管理</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">客户资料</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">客户开发</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">客户咨询</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"7\">部门管理</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"8\">职位管理</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"9\">统计数据</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"rt-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveRight()\" style=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#rt-ff').form('resetValidation').form('reset');$('#rt-dlg').dialog('close');\" style=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin: 50px auto;width: 605px;\">\r\n");
      out.write("\t<div id=\"rt-query\"  class=\"easyui-panel\" closed=\"true\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"rt-toolbar\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\" onclick=\"javascript:$('#rt-dg').edatagrid('saveRow')\">保存修改</a>\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\" onclick=\"javascript:$('#rt-dg').edatagrid('cancelRow')\">退出编辑</a>\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"javascript:$('#rt-dg').edatagrid('destroyRow')\">删除</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<table id=\"rt-dg\" style=\"width:600px;height:600px;\" \r\n");
      out.write("\t\t\ttitle=\"查询结果\"\r\n");
      out.write("\t\t\tsingleSelect=\"true\"\r\n");
      out.write("\t\t\ttoolbar=\"#rt-toolbar\"\r\n");
      out.write("\t\t\tautoSave=\"false\"\r\n");
      out.write("\t\t\tidField=\"rid\"\r\n");
      out.write("\t\t\tfitColumns=\"true\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th field=\"rid\" width=\"100\" align=\"center\">权限编号</th>\r\n");
      out.write("\t\t\t\t<th field=\"rightName\" width=\"150\"  align=\"center\" editor=\"type:'validatebox',options:{required:true}\">权限名称</th>\r\n");
      out.write("\t\t\t\t<th field=\"rightType\" width=\"100\" align=\"center\" \r\n");
      out.write("\t\t\t\tformatter=\"format\"   editor=\"{type:'combobox',options:{data:[{'rightType':'1','text':'一级权限'},{'rightType':'2','text':'二级权限'}],valueField:'rightType',textField:'text'}}\">权限等级</th>\r\n");
      out.write("\t\t\t\t<th field=\"url\" width=\"100\"  align=\"center\" editor=\"type:'validatebox',options:{required:true}\" >url</th>\r\n");
      out.write("\t\t\t\t<th field=\"pId\" width=\"100\" align=\"center\" editor=\"{type:'numberbox',options:{precision:0}}\">所属权限</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
