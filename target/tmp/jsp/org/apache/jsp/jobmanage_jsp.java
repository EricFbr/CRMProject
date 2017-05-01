package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class jobmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>职位管理</h1>\r\n");
      out.write("\t<div id=\"jobToolbar\" style=\"margin: 0 auto\">\r\n");
      out.write("\t\t<span style=\"font-size: 18;font-weight: bold;margin-left: 20px\">功能导航：</span><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"false\" onclick=\"javascript:$('#job-dlg').dialog('open').dialog('center').dialog('setTitle','新增职位');\" style=\"height: 32px\">&nbsp;新增职位&nbsp;</a> \r\n");
      out.write("\t\t<span style=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\" onclick=\"queryJobs()\" style=\"height: 32px\">&nbsp;查询职位&nbsp;</a></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"job-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\" buttons=\"#job-dlg-buttons\" closable=\"false\" closable=\"true\" modal=\"false\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"job-ff\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label for=\"job\" class=\"label-top\">职位名称:</label> <input class=\"easyui-validatebox tb\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入权限名称.长度为3-30',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[3,30]'\" id=\"job\" name=\"job\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"departmentId\" class=\"label-top\">所属权限：</label><select id=\"departmentId\" class=\"easyui-combobox\" name=\"departmentId\" style=\"width:100px;\" data-options=\"editable:false\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">技术部</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">销售部</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">线上咨询部</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">线下咨询部</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">销售支持部</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"job-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveJob()\" style=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"closeDlg()\" style=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 50px auto;width: 310px\">\r\n");
      out.write("\t<div id=\"job-query\" class=\"easyui-panel\" closed=\"true\" closable=\"true\" noheader=\"true\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"job-toolbar\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\" onclick=\"javascript:$('#job-dg').edatagrid('saveRow')\">保存修改</a>\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\" onclick=\"javascript:$('#job-dg').edatagrid('cancelRow')\">退出编辑</a>\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"javascript:$('#job-dg').edatagrid('destroyRow')\">删除</a>\r\n");
      out.write("         <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-back\" plain=\"true\" onclick=\"javascript:$('#job-query').panel('close')\">退出</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table id=\"job-dg\" \" \r\n");
      out.write("\t\t\ttitle=\"查询结果\"\r\n");
      out.write("\t\t\tsingleSelect=\"true\"\r\n");
      out.write("\t\t\ttoolbar=\"#job-toolbar\"\r\n");
      out.write("\t\t\tautoSave=\"false\"\r\n");
      out.write("\t\t\tidField=\"id\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th field=\"id\" width=\"100\" align=\"center\">职位编号</th>\r\n");
      out.write("\t\t\t\t<th field=\"job\" width=\"100\"  align=\"center\" editor=\"type:'validatebox',options:{required:true}\">职位名称</th>\r\n");
      out.write("\t\t\t\t<th field=\"departmentId\" width=\"100\" align=\"center\" \r\n");
      out.write("\t\t\t\tformatter=\"format\"   editor=\"{type:'combobox',options:{data:[{'departmentId':'1','text':'技术部'},\r\n");
      out.write("\t\t\t\t{'departmentId':'2','text':'销售部'},\r\n");
      out.write("\t\t\t\t{'departmentId':'3','text':'线上咨询部'},\r\n");
      out.write("\t\t\t\t{'departmentId':'4','text':'线下咨询部'},{'departmentId':'5','text':'销售支持部'}],valueField:'departmentId',textField:'text'}}\">所属部门</th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('#job-dg').edatagrid({\r\n");
      out.write("\t\tsaveUrl: 'insertJob.do',\r\n");
      out.write("\t    updateUrl: 'updateJob.do',\r\n");
      out.write("\t    destroyUrl: 'deleteJob.do'\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function saveJob(){\r\n");
      out.write("\t$('#job-ff').form(\r\n");
      out.write("\t\t\t'submit',\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\turl : 'insertJob.do',\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('OK', \"权限添加成功!\", 'info');\r\n");
      out.write("\t\t\t\t\t\t$('#job-ff').form(\"clear\");\r\n");
      out.write("\t\t\t\t\t\t$('#job-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t$('#job-dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('Sorry',\r\n");
      out.write("\t\t\t\t\t\t\t\t'Failed to save data!', 'error');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function closeDlg() {\r\n");
      out.write("\t//清空表单\r\n");
      out.write("\t$('#job-ff').form(\"clear\");\r\n");
      out.write("\t//重置验证\r\n");
      out.write("\t$('#job').validatebox('resetValidation');\r\n");
      out.write("\t//关闭对话框\r\n");
      out.write("\t$('#job-dlg').dialog('close');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function format(value,row){\r\n");
      out.write("\tif (row.departmentId==1){\r\n");
      out.write("\t\treturn '技术部';\r\n");
      out.write("\t}else if(row.departmentId==2){\r\n");
      out.write("\t\treturn '销售部';\r\n");
      out.write("\t}else if(row.departmentId==3){\r\n");
      out.write("\t\treturn '线上咨询部';\r\n");
      out.write("\t}else if(row.departmentId==4){\r\n");
      out.write("\t\treturn '线下咨询部';\r\n");
      out.write("\t}else if(row.departmentId==5){\r\n");
      out.write("\t\treturn '销售支持部';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function queryJobs() {\r\n");
      out.write("\t\r\n");
      out.write("\t$.post(\"queryAllJobs.do\",function(data) {\r\n");
      out.write("\t\t$(\"#job-dg\").edatagrid({data:data})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#job-dg\").edatagrid({onLoadSuccess:function(){\r\n");
      out.write("\t\t\t$('#job-query').panel('open');\r\n");
      out.write("\t\t}});\r\n");
      out.write("\t\t\r\n");
      out.write("\t})}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
