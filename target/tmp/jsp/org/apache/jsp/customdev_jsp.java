package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class customdev_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"text-align: center\">客户开发</h1>\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div id=\"cf-toolbar\">\r\n");
      out.write("\t\t选择表格: <select onchange=\"changeDg()\" style=\"width:100px\" id=\"source\">\r\n");
      out.write("\t\t\t<option value=\"0\">今日数据</option>\r\n");
      out.write("\t\t\t<option value=\"1\">历史遗留</option>\r\n");
      out.write("\t\t\t<option value=\"2\">诺在今日</option>\r\n");
      out.write("\t\t\t<option value=\"3\">本月数据</option>\r\n");
      out.write("\t\t</select> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#cf-dg').edatagrid('saveRow')\">保存修改</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#cf-dg').edatagrid('cancelRow')\">退出编辑</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin-left: 20px\">\r\n");
      out.write("\t\t<table id=\"cf-dg\" title=\"客户跟踪\" style=\"width:903px;height:250px\" toolbar='#cf-toolbar'\r\n");
      out.write("\t\t\tsingleSelect=\"true\" autoSave=\"false\" idField=\"id\" pagination=\"true\" pageSize=\"5\"\r\n");
      out.write("\t\t\tpageList=\"[5,10,15,20]\" >\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th field=\"id\" width=\"100\" align=\"center\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customId\" width=\"100\" align=\"center\" hidden=\"true\">客户编号</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customName\" width=\"100\" align=\"center\">客户姓名</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"customPhoneNo\" width=\"100\" align=\"center\">客户手机</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"status\" width=\"100\" formatter=\"statuFormat\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\teditor=\"{type:'combobox',options:{data:[{'status':'0','text':'未联系'},\r\n");
      out.write("\t\t\t\t{'status':'1','text':'未接通'},\r\n");
      out.write("\t\t\t\t{'status':'2','text':'紧跟'},\r\n");
      out.write("\t\t\t\t{'status':'3','text':'已上门'},{'status':'4','text':'死单'},{'status':'5','text':'电话无效'}],valueField:'status',textField:'text',panelHeight:'auto'}}\">跟踪状态</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"startDate\" width=\"100\" align=\"center\">分配时间</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"planDate\" width=\"100\" align=\"center\" editor=\"{type:'datebox'}\">计划联系时间</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"lastFollowDate\" width=\"100\" align=\"center\">上一次联系时间</th>\r\n");
      out.write("\t\t\t\t\t<th field=\"mark\" width=\"200\" formatter='markFormat' align=\"center\">备注</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"mark-dlg\" class=\"easyui-dialog\" style=\"width:400px;padding-left: 10px\" closed=\"true\"\r\n");
      out.write("\t\tclosable=\"true\" modal=\"false\" title='备注信息'>\r\n");
      out.write("\t\t<div id=\"showMark\" style=\"margin: 20px\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<input type=\"hidden\" id=\"flmId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"jbid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t<input type=\"hidden\" id=\"dptid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.departmentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#cf-dg').edatagrid({\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tonSave : function(index, row) {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (row.planDate == '' | row.planDate == null) {\r\n");
      out.write("\t\t\t\t\t\t$.post('updateCustomInfo.do', {\r\n");
      out.write("\t\t\t\t\t\t\tid  : row.id,\r\n");
      out.write("\t\t\t\t\t\t\tstatus : row.status,\r\n");
      out.write("\t\t\t\t\t\t\tcustomId : row.customId\r\n");
      out.write("\t\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#cf-dg').edatagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tvar date = row.planDate;\r\n");
      out.write("\t\t\t\t\t\tvar myDate = new Date();\r\n");
      out.write("\t\t\t\t\t\tvar month = myDate.getMonth() + 1;\r\n");
      out.write("\t\t\t\t\t\tif (month < 10) {\r\n");
      out.write("\t\t\t\t\t\t\tmonth = \"0\" + month;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar day = myDate.getDate();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif (day < 10) {\r\n");
      out.write("\t\t\t\t\t\t\tday = \"0\" + day\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar today = myDate.getFullYear() + \"-\" + month + \"-\" + day;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif (date > today) {\r\n");
      out.write("\t\t\t\t\t\t\t$.post('updateCustomInfo.do', {\r\n");
      out.write("\t\t\t\t\t\t\t\tid : row.id,\r\n");
      out.write("\t\t\t\t\t\t\t\tstatus : row.status,\r\n");
      out.write("\t\t\t\t\t\t\t\tplanDate : date,\r\n");
      out.write("\t\t\t\t\t\t\t\tcustomId : row.customId\r\n");
      out.write("\t\t\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#cf-dg').edatagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$('#cf-dg').edatagrid('rejectChanges');//回滚\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($(\"#dptid\").val()==2&&$(\"#jbid\").val()==9){\r\n");
      out.write("\t\t\t\t$(\"#emps-TMK\").combobox({\r\n");
      out.write("\t\t\t\t\turl:'empForJobId.do?jobInfoId=8'\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}else if($(\"#dptid\").val()==3&&$(\"#jbid\").val()==6){\r\n");
      out.write("\t\t\t\t$(\"#emps-TMK\").combobox({\r\n");
      out.write("\t\t\t\t\turl:'empForJobId.do?jobInfoId=5'\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif ($(\"#jbid\").val() == 8) {\r\n");
      out.write("\t\t\t\t$('#cf-dg').datagrid({\r\n");
      out.write("\t\t\t\turl : 'customInfo.do?src=0&followManId=' +$(\"#flmId\").val(),\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#cf-dg').datagrid({\r\n");
      out.write("\t\t\t\tclickToEdit : false,\r\n");
      out.write("\t\t\t\tdblclickToEdit : true\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$('#cf-dg').datagrid('enableCellEditing');\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction changeDg(followManId) {\r\n");
      out.write("\t\t\tvar src = $(\"#source\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif ($(\"#jbid\").val() == 8||$(\"#jbid\").val()==5) {\r\n");
      out.write("\t\t\t\tfollowManId = $(\"#flmId\").val();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tif(followManId==undefined){\r\n");
      out.write("\t\t\t\t\tfollowManId=$('#emps-TMK').combobox('getValue');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#cf-dg').edatagrid({\r\n");
      out.write("\t\t\t\turl : 'customInfo.do?src=' + src + \"&followManId=\" + followManId\r\n");
      out.write("\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 客户状态格式化方法 */\r\n");
      out.write("\t\tfunction statuFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.status == 0) {\r\n");
      out.write("\t\t\t\treturn '未联系';\r\n");
      out.write("\t\t\t} else if (row.status == 1) {\r\n");
      out.write("\t\t\t\treturn '未接通';\r\n");
      out.write("\t\t\t} else if (row.status == 2) {\r\n");
      out.write("\t\t\t\treturn '紧跟';\r\n");
      out.write("\t\t\t} else if (row.status == 3) {\r\n");
      out.write("\t\t\t\treturn '已上门';\r\n");
      out.write("\t\t\t} else if (row.status == 4) {\r\n");
      out.write("\t\t\t\treturn '已死单';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\treturn '电话无效';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction markFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.mark == '' | row.mark == null) {\r\n");
      out.write("\t\t\t\treturn \"<a href='javascript:addMark()'>\" + \"添加\" + \"</a>\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn \"<a href='javascript:showMark()'>\" + \"查看\" + \"</a>&nbsp;&nbsp;<a href='javascript:addMark()'>\" + \"添加\" + \"</a>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction addMark() {\r\n");
      out.write("\t\t\tvar row = $('#cf-dg').datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.messager.prompt('tips', '请输入备注信息', function(r) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\t$.post('addMark.do', {\r\n");
      out.write("\t\t\t\t\t\tid : row.id,\r\n");
      out.write("\t\t\t\t\t\tmark : r\r\n");
      out.write("\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#mark-dlg').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', '备注添加成功!', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t$('#cf-dg').edatagrid('reload')\r\n");
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
      out.write("\t\tfunction showMark() {\r\n");
      out.write("\t\t\tvar row = $('#cf-dg').datagrid('getSelected');\r\n");
      out.write("\t\t\tvar text = row.mark;\r\n");
      out.write("\t\t\ttexts = text.split(',');\r\n");
      out.write("\t\t\tvar newtext = \"\";\r\n");
      out.write("\t\t\tfor (var i = 0; i < (len = texts.length); i++) {\r\n");
      out.write("\t\t\t\tnewtext += \"<li>\" + texts[i] + \"</li>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#showMark\").html(\"\")\r\n");
      out.write("\t\t\t$(\"#showMark\").append(newtext)\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#mark-dlg').dialog('open');\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction closeMarkDlg() {\r\n");
      out.write("\t\t\t//清空表单\r\n");
      out.write("\t\t\t$('#mark-ff').form(\"clear\");\r\n");
      out.write("\t\t\t//关闭对话框\r\n");
      out.write("\t\t\t$('#mark-dlg').dialog('close');\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==9}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div style=\"margin: 20px 20px;width: 400px\">\r\n");
        out.write("\t\t\t<span style=\"font-size: 18;font-weight: bold;\">选择部门员工：</span><input id=\"emps-TMK\"\r\n");
        out.write("\t\t\t\t panelHeight=\"auto\" editable=\"false\"\r\n");
        out.write("\t\t\t\tdata-options=\"valueField:'id',textField:'realname',\r\n");
        out.write("\tonLoadSuccess:function(){\r\n");
        out.write("\t\tvar data = $('#emps-TMK').combobox('getData');\r\n");
        out.write("\t\t$('#emps-TMK').combobox('select',data[0].id);\r\n");
        out.write("\t},\r\n");
        out.write("\tonSelect:function(record){\r\n");
        out.write("\tif($('#jbid').val()!=8){\r\n");
        out.write("\t\tchangeDg(record.id)\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\"\r\n");
        out.write("\t\t\t\tstyle=\"width: 100px\" />\r\n");
        out.write("\t\t</div>\r\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div style=\"margin: 20px 20px;width: 400px\">\r\n");
        out.write("\t\t\t<span style=\"font-size: 18;font-weight: bold;\">选择部门员工：</span><input id=\"emps-TMK\"\r\n");
        out.write("\t\t\t\t panelHeight=\"auto\" editable=\"false\"\r\n");
        out.write("\t\t\t\tdata-options=\"valueField:'id',textField:'realname',\r\n");
        out.write("\tonLoadSuccess:function(){\r\n");
        out.write("\t\tvar data = $('#emps-TMK').combobox('getData');\r\n");
        out.write("\t\t$('#emps-TMK').combobox('select',data[0].id);\r\n");
        out.write("\t},\r\n");
        out.write("\tonSelect:function(record){\r\n");
        out.write("\tif($('#jbid').val()!=8){\r\n");
        out.write("\t\tchangeDg(record.id)\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\"\r\n");
        out.write("\t\t\t\tstyle=\"width: 100px\" />\r\n");
        out.write("\t\t</div>\r\n");
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
