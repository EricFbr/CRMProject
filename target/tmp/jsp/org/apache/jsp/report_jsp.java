package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <h1 style=\"text-align: center\">报表管理</h1>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"all-dlg\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("    <table id=\"all-dg\" title=\"员工信息表\" style=\"width:802px;height:600px;\" \r\n");
      out.write("\t\t\tdata-options=\"singleSelect:true,collapsible:false,method:'post'\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'id',width:100,align:'center'\">员工工号</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'realname',width:100,align:'center'\">姓名</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'nickname',width:100,align:'center'\">员工昵称</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'dname',width:100,align:'center'\">所在部门</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'job',width:100,align:'center'\">职位</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'phoneNo',width:150,align:'center'\">手机</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'officeTel',width:150,align:'center'\">办公电话</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"sales-dlg\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\t\t<table id=\"sales-dg\" style=\"width:503px;height: 100px\" class=\"easyui-datagrid\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"visited\" width=\"100\" align=\"center\">已上门客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"disConnect\" width=\"100\" align=\"center\">未接通客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"denied\" width=\"100\" align=\"center\">死单客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"following\" width=\"100\" align=\"center\">紧跟客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"total\" width=\"100\" align=\"center\">总分配客户数</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"consulter-dlg\" class=\"easyui-dialog\" closed=\"true\" modal=\"false\" border=\"false\" shadow=\"false\"\r\n");
      out.write("\t\tnoheader='true'>\r\n");
      out.write("\t\t<table id=\"consulter-dg\" style=\"width:503px;height: 100px\" class=\"easyui-datagrid\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"following\" width=\"100\" align=\"center\">紧跟客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"signed\" width=\"100\" align=\"center\">已报名客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"denied\" width=\"100\" align=\"center\">死单客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"refundment\" width=\"100\" align=\"center\">报名后退费客户数</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"total\" width=\"100\" align=\"center\">总分配客户数</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <input type=\"hidden\"  id=\"jobId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function downloadCustom(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.messager.confirm('confirm', '确认导出客户数据到excel?', function(r){\r\n");
      out.write("\t\t\tif (r){\r\n");
      out.write("\t\t\t\tvar jobId=$(\"#jobId\").val();\r\n");
      out.write("\t\t\t\tvar id=$(\"#uid\").val();\r\n");
      out.write("\t\t\t\tvar type=$('#outType').combobox('getValue');\r\n");
      out.write("\t\t\t\tif(jobId=='7'){\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"exportCustom.do?type=\"+type;\r\n");
      out.write("\t\t\t\t}else if(jobId=='5'||jobId=='8'){\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"exportCustomInfo.do?type=\"+type+\"&followManId=\"+id;\r\n");
      out.write("\t\t\t\t}else if(jobId=='3'){\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"exportConsultRecord.do?type=\"+type+\"&consultManId=\"+id;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function queryAllEmps(){\r\n");
      out.write("    \t\r\n");
      out.write("    \t$(\"#all-dg\").datagrid({\r\n");
      out.write("\t\t\turl : \"allEmployees.do\",\r\n");
      out.write("\t\t\ttitle : \"员工信息\",\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#all-dlg\").dialog('open').dialog('center');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function showCuntForDepart(){\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    var departId=$(\"#deptId\").combobox('getValue');\r\n");
      out.write("    \t\r\n");
      out.write("    if (departId == \"2\" | departId == \"3\") {\r\n");
      out.write("\t\t\r\n");
      out.write("    \tvar dname=\"销售部\";\r\n");
      out.write("    \tif(departId==\"3\"){\r\n");
      out.write("    \t\tdname=\"线上咨询部\";\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t$(\"#sales-dg\").datagrid({\r\n");
      out.write("\t\t\turl : \"countInfoForDepart.do?departmentId=\"+departId,\r\n");
      out.write("\t\t\ttitle : dname+\"部门本月统计\",\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#sales-dlg\").dialog('open')\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t} else if (departId == \"4\") {\r\n");
      out.write("\t\t$(\"#consulter-dg\").datagrid({\r\n");
      out.write("\t\t\turl : \"countConsultForDepart.do?departmentId=\"+departId,\r\n");
      out.write("\t\t\ttitle : \"线下咨询部门本月统计\",\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#consulter-dlg\").dialog('open');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId!=1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div style=\"margin: 20px 20px;width: 400px\">\r\n");
        out.write("\t\t<span style=\"font-size: 18;font-weight: bold;\">请选择报表类型：</span> <select \r\n");
        out.write("\t\t\tclass=\"easyui-combobox\" id=\"outType\" style=\"width:120px;height: 32px\" editable=\"false\" panelHeight=\"auto\">\r\n");
        out.write("\t\t\t<option value=\"1\" selected=\"selected\">本周客户数据</option>\r\n");
        out.write("\t\t\t<option value=\"2\">本月客户数据</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-large-smartart\" plain=\"false\"\r\n");
        out.write("\t\t\t\tonclick=\"downloadCustom()\" style=\"height: 32px;margin-left: 10px\" size=\"large\">导出 </a>\r\n");
        out.write("\t</div>\r\n");
        out.write("    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div style=\"margin: 20px 20px;width: 600px\">\r\n");
        out.write("    <span style=\"font-size: 18;font-weight: bold;\">功能导航:</span>\r\n");
        out.write("    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-man\" plain=\"false\"\r\n");
        out.write("\t\t\t\tonclick=\"queryAllEmps()\" style=\"height: 32px;margin-left: 10px;margin-right: 10px\" size=\"large\">员工信息</a>\r\n");
        out.write("\t\t请选择部门：<select  \r\n");
        out.write("\t\t\tclass=\"easyui-combobox\" id=\"deptId\" style=\"width:120px;height: 32px\" editable=\"false\" panelHeight=\"auto\">\r\n");
        out.write("\t\t\t<option value=\"2\" selected=\"selected\">销售部</option>\r\n");
        out.write("\t\t\t<option value=\"3\">线上咨询部</option>\r\n");
        out.write("\t\t\t<option value=\"4\">线下咨询部</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\"\r\n");
        out.write("\t\t\t\tonclick=\"showCuntForDepart()\" style=\"height: 32px;margin-left: 10px\" size=\"large\">查看部门本月统计</a>\r\n");
        out.write("\t</div>\r\n");
        out.write("    ");
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
