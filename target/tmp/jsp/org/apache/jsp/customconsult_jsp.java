package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class customconsult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"text-align: center\">客户咨询管理</h1>\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"navigation\" style=\"margin: 0 auto\">\r\n");
      out.write("\t\t\t<span style=\"font-size: 18;font-weight: bold;\">查询类型:</span><select id=\"byBype\"\r\n");
      out.write("\t\t\t\tstyle=\"width:150px;height: 32px;margin-left: 10px\" onchange=\"qType()\">\r\n");
      out.write("\t\t\t\t<option value=\"all\" selected=\"selected\">本月所有</option>\r\n");
      out.write("\t\t\t\t<option value=\"customName\">按客户姓名查询</option>\r\n");
      out.write("\t\t\t\t<option value=\"customPhoneNo\">按客户手机号码查询</option>\r\n");
      out.write("\t\t\t\t<option value=\"dateScope\">按时间段查询</option>\r\n");
      out.write("\t\t\t</select> <span style=\"display: none\" id=\"inputBox\"><input class=\"easyui-textbox\"\r\n");
      out.write("\t\t\t\tdata-options=\"iconCls:'icon-edit',prompt:'请输入查询条件'\" style=\"width:300px;height: 32px;\"\r\n");
      out.write("\t\t\t\tid=\"qparam\"> </span> <span style=\"display: none\" id=\"dateBox\">咨询日期从：<input\r\n");
      out.write("\t\t\t\tclass=\"easyui-datebox\" data-options=\"currentText:'今天'\" style=\"width:110px;height: 32px\"\r\n");
      out.write("\t\t\t\tid=\"sdate\">到：<input class=\"easyui-datebox\" data-options=\"currentText:'今天'\"\r\n");
      out.write("\t\t\t\tstyle=\"width:110px;height: 32px\" id=\"edate\">\r\n");
      out.write("\t\t\t</span><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\"\r\n");
      out.write("\t\t\t\tonclick=\"queryRecord()\" style=\"height: 32px;margin-left: 10px\">&nbsp;搜索 &nbsp;</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"cr-query\" class=\"easyui-panel\" closed=\"true\" noheader=\"true\" closable=\"true\">\r\n");
      out.write("\t\t<div id=\"cr-toolbar\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\"\r\n");
      out.write("\t\t\t\tonclick=\"javascript:$('#cr-dg').edatagrid('saveRow')\">保存修改</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\"\r\n");
      out.write("\t\t\t\tonclick=\"javascript:$('#cr-dg').edatagrid('cancelRow')\">退出编辑</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table id=\"cr-dg\" title=\"客户跟踪\" singleSelect=\"true\" toolbar=\"#cr-toolbar\" autoSave=\"false\"\r\n");
      out.write("\t\t\tidField=\"id\" pagination=\"true\" pageSize=\"2\" pageList=\"[2,4,6,8]\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"id\" width=\"100\" align=\"center\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customId\" width=\"100\" align=\"center\" hidden=\"true\">客户编号</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customName\" width=\"100\" align=\"center\">客户姓名</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customPhoneNo\" width=\"100\" align=\"center\">客户手机</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"consultStatus\" width=\"100\" formatter=\"consultStatusFormat\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\teditor=\"{type:'combobox',options:{data:[{'consultStatus':'0','text':'新增'},\r\n");
      out.write("\t\t\t\t{'consultStatus':'1','text':'紧跟'},\r\n");
      out.write("\t\t\t\t{'consultStatus':'2','text':'已报名'},\r\n");
      out.write("\t\t\t\t{'consultStatus':'3','text':'死单'},{'consultStatus':'4','text':'报名后退费'}],valueField:'consultStatus',textField:'text'}}\">跟踪状态</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"consultDate\" width=\"100\" align=\"center\">咨询时间</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"result\" width=\"100\" formatter='resultFormat' align=\"center\">咨询备注</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"cr-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\" closed=\"true\"\r\n");
      out.write("\t\tclosable=\"true\" modal=\"false\" title='备注信息'>\r\n");
      out.write("\t\t<div id=\"showResult\" style=\"margin: 20px\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" id=\"csltId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"jobid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"#cr-dg\").edatagrid({\r\n");
      out.write("\t\t\t\tupdateUrl : 'updateRecord.do',\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t/* 查询类型 */\r\n");
      out.write("\t\tfunction qType() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar type = $('#byBype').val();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 'dateScope') {\r\n");
      out.write("\t\t\t\t$(\"#dateBox\").css('display', 'inline');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#dateBox\").css('display', 'none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type != 'dateScope' && type != 'all') {\r\n");
      out.write("\t\t\t\t$(\"#inputBox\").css('display', 'inline');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#inputBox\").css('display', 'none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn type;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 搜索执行方法 */\r\n");
      out.write("\t\tfunction queryRecord(empId) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar type = qType();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar consultManId=empId;\r\n");
      out.write("\t\t\tif($(\"#jobid\").val()==\"3\"){\r\n");
      out.write("\t\t\t\t consultManId=$('#csltId').val();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tif(consultManId==undefined){\r\n");
      out.write("\t\t\t\t\tconsultManId=$('#emps-consult').combobox('getValue');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (type == 'all') {\r\n");
      out.write("\t\t\t\talert(\"搜索本月全部\")\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#cr-dg\").edatagrid({\r\n");
      out.write("\t\t\t\t\turl : 'queryRecord.do?consultManId='+consultManId,\r\n");
      out.write("\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data.rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('sorry', '未查询到相关记录！', 'info');\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$('#cr-query').panel('open');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t} else if (type == 'dateScope') {\r\n");
      out.write("\t\t\t\tvar sdate = $('#sdate').datebox('getValue');\r\n");
      out.write("\t\t\t\tvar edate = $('#edate').datebox('getValue');\r\n");
      out.write("\t\t\t\tif (sdate != '' && edate != '') {\r\n");
      out.write("\t\t\t\t\tif (sdate < edate) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#cr-dg\").edatagrid({\r\n");
      out.write("\t\t\t\t\t\t\turl : 'queryRecord.do?consultDate=' + sdate + \"&endDate=\" + edate+\"&consultManId=\"+consultManId,\r\n");
      out.write("\t\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (data.rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.messager.alert('sorry', '未查询到相关记录！', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#cr-query').panel('open');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('error', '查询日期有误!', 'error');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('error', '查询日期有误!', 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tvar value = $(\"#qparam\").val();\r\n");
      out.write("\t\t\t\tif (value !== '') {\r\n");
      out.write("\t\t\t\t\t$(\"#cr-dg\").edatagrid({\r\n");
      out.write("\t\t\t\t\t\turl : 'queryRecord.do?' + type + \"=\" + \"%25\" + value + \"%25\"+\"&consultManId=\"+consultManId,\r\n");
      out.write("\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data.rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('sorry', '未查询到相关记录！', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#cr-query').panel('open');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('error', '请输入查询条件！', 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction resultFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.result == '' | row.result == null) {\r\n");
      out.write("\t\t\t\treturn \"<a href='javascript:addResult()'>\" + \"添加\" + \"</a>\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn \"<a href='javascript:showResult()'>\" + \"查看\" + \"</a>&nbsp;&nbsp;<a href='javascript:addResult()'>\" + \"添加\" + \"</a>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 客户状态格式化方法 */\r\n");
      out.write("\t\tfunction consultStatusFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.consultStatus == 0) {\r\n");
      out.write("\t\t\t\treturn '新增';\r\n");
      out.write("\t\t\t} else if (row.consultStatus == 1) {\r\n");
      out.write("\t\t\t\treturn '紧跟';\r\n");
      out.write("\t\t\t} else if (row.consultStatus == 2) {\r\n");
      out.write("\t\t\t\treturn '已报名';\r\n");
      out.write("\t\t\t} else if (row.consultStatus == 3) {\r\n");
      out.write("\t\t\t\treturn '死单';\r\n");
      out.write("\t\t\t} else\r\n");
      out.write("\t\t\t\t(row.consultStatus == 4)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\treturn '报名后退费';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction addResult() {\r\n");
      out.write("\t\t\tvar row = $('#cr-dg').datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.messager.prompt('tips', '请输入备注信息', function(r) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\t$.post('addResult.do', {\r\n");
      out.write("\t\t\t\t\t\tid : row.id,\r\n");
      out.write("\t\t\t\t\t\tresult : r\r\n");
      out.write("\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#rt-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', '备注添加成功!', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t$('#cr-dg').edatagrid('reload')\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('Sorry', '备注添加失败!', 'error');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showResult() {\r\n");
      out.write("\t\t\tvar row = $('#cr-dg').datagrid('getSelected');\r\n");
      out.write("\t\t\tvar text = row.result;\r\n");
      out.write("\t\t\ttexts = text.split(',');\r\n");
      out.write("\t\t\tvar newtext = \"\";\r\n");
      out.write("\t\t\tfor (var i = 0; i < (len = texts.length); i++) {\r\n");
      out.write("\t\t\t\tnewtext += \"<li>\" + texts[i] + \"</li>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\talert(newtext)\r\n");
      out.write("\t\t\t$(\"#showResult\").html(\"\")\r\n");
      out.write("\t\t\t$(\"#showResult\").append(newtext)\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#cr-dlg').dialog('open');\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==4 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div style=\"margin-left: 20px;margin-bottom: 40px\">\r\n");
        out.write("\t\t<div style=\"width: 400px;margin-bottom: 20px\">\r\n");
        out.write("\t\t\t<span style=\"font-size: 18;font-weight: bold;margin-right: 20px\">选择部门员工:</span><input id=\"emps-consult\"\r\n");
        out.write("\t\t\t\tclass=\"easyui-combobox\" panelHeight=\"auto\" editable=\"false\" \r\n");
        out.write("\t\t\t\tdata-options=\"valueField:'id',textField:'realname',url:'empForJobId.do?jobInfoId=3',onLoadSuccess:function(){\r\n");
        out.write("\t\tvar data = $('#emps-consult').combobox('getData');\r\n");
        out.write("\t\t$('#emps-consult').combobox('select',data[0].id);\r\n");
        out.write("\t},\r\n");
        out.write("\tonSelect:function(record){\r\n");
        out.write("\tif($('#jobid').val()!=3){\r\n");
        out.write("\t\tqueryRecord(record.id);\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\" style=\"width: 100px;margin-left: 10px;height: 32px\"/>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t\t");
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
}
