package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class count_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1 style=\"text-align: center\">统计数据</h1>\r\n");
      out.write("    \r\n");
      out.write("    <div style=\"margin: 10px\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-sum\" plain=\"false\"\r\n");
      out.write("\t\t\t\tonclick=\"showMyCount()\">我的统计数据</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    <div id=\"count-ci-dlg\"  class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\r\n");
      out.write("\t\t<table id=\"count-ci-dg\" title=\"客户邀请本月统计\"  style=\"width:703px;height: 100px\" closable='true'>\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t <div id=\"count-cr-dlg\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\r\n");
      out.write("\t\t<table id=\"count-cr-dg\" title=\"客户咨询本月统计\"  style=\"width:603px;height: 100px\"  closable='true'>\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" id=\"myid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"myjob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction showMyCount(){\r\n");
      out.write("\t\t\tvar jid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(jid==\"8\"|jid==\"5\" | jid==\"9\"){\r\n");
      out.write("\t\t\t\t$('#count-ci-dg').datagrid({\r\n");
      out.write("\t\t\t\t\turl:'countInfo.do?followManId='+id,\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$('#count-ci-dlg').panel('open');\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('#count-cr-dg').datagrid({\r\n");
      out.write("\t\t\t\t\turl:'countConsult.do?consultManId='+id,\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$('#count-cr-dlg').panel('open');\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
