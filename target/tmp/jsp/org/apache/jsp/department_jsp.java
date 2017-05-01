package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class department_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"text-align: center\">部门员工</h1>\r\n");
      out.write("\t<div style=\"text-align: center;padding-left: 400px\">\r\n");
      out.write("\t\t<div id=\"epms-toolbar\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-sum\" plain=\"true\"\r\n");
      out.write("\t\t\t\tonclick=\"departCunt()\">部门统计</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table id=\"epms\" title=\"员工信息表\" style=\"width:602px;height:450px;\" toolbar=\"#epms-toolbar\"\r\n");
      out.write("\t\t\tdata-options=\"singleSelect:true,collapsible:false,method:'post'\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'id',width:100,align:'center'\">员工工号</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'realname',width:100,align:'center'\" formatter=\"empFormat\">姓名</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'nickname',width:100,align:'center'\">员工昵称</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'phoneNo',width:150,align:'center'\">手机</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'officeTel',width:150,align:'center'\">办公电话</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"TMK-p\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\t\t<table id=\"TMK-dg\" style=\"width:703px;height: 100px\" class=\"easyui-datagrid\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"newAllot\" width=\"100\" align=\"center\">新增客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"visited\" width=\"100\" align=\"center\">已上门客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"disConnect\" width=\"100\" align=\"center\">未接通客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"invalid\" width=\"100\" align=\"center\">电话无效客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"denied\" width=\"100\" align=\"center\">死单客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"following\" width=\"100\" align=\"center\">紧跟客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"total\" width=\"100\" align=\"center\">总分配客户数</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"consult-p\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\t\t<table id=\"consult-dg\" style=\"width:603px;height: 100px\" class=\"easyui-datagrid\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"newAllot\" width=\"100\" align=\"center\">新增客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"following\" width=\"100\" align=\"center\">紧跟客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"signed\" width=\"100\" align=\"center\">已报名客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"denied\" width=\"100\" align=\"center\">死单客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"refundment\" width=\"100\" align=\"center\">报名后退费客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"total\" width=\"100\" align=\"center\">总分配客户数</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.departmentId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"departId\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"managerId\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(\"#epms\").datagrid({\r\n");
      out.write("\t\t\turl : 'empForDepart.do?departmentId=' + $('#departId').val() + '&managerId=' + $('#managerId').val()\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction empFormat(value, row) {\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn \"<a href='javascript:showMyCount()'>\" + row.realname + \"</a>\"\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showMyCount() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar row = $(\"#epms\").datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar departId = $(\"#departId\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (departId == \"2\" | departId == \"3\") {\r\n");
      out.write("\t\t\t\t$(\"#TMK-dg\").datagrid({\r\n");
      out.write("\t\t\t\t\turl : \"countInfo.do?followManId=\" + row.id,\r\n");
      out.write("\t\t\t\t\ttitle : row.realname + \"本月统计\",\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#TMK-p\").dialog('open')\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t} else if (departId == \"4\") {\r\n");
      out.write("\t\t\t\t$(\"#consult-dg\").datagrid({\r\n");
      out.write("\t\t\t\t\turl : \"countConsult.do?consultManId=\" + row.id,\r\n");
      out.write("\t\t\t\t\ttitle : row.realname + \"本月统计\",\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#consult-p\").dialog('open');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction departCunt() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar departId = $(\"#departId\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (departId == \"2\" | departId == \"3\") {\r\n");
      out.write("\t\t\t\t$(\"#TMK-dg\").datagrid({\r\n");
      out.write("\t\t\t\t\turl : \"countInfoForDepart.do?departmentId=\" + departId,\r\n");
      out.write("\t\t\t\t\ttitle : \"部门本月统计\",\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#TMK-p\").dialog('open')\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t} else if (departId == \"4\") {\r\n");
      out.write("\t\t\t\t$(\"#consult-dg\").datagrid({\r\n");
      out.write("\t\t\t\t\turl : \"countConsultForDepart.do?departmentId=\" + departId,\r\n");
      out.write("\t\t\t\t\ttitle : \"部门本月统计\",\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#consult-p\").dialog('open');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
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
}
