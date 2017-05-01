package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class usermanage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h3>账号管理</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin: 20px 20px;width: 1000px\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"admin-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\"\r\n");
      out.write("\t\tbuttons=\"#admin-dlg-buttons\" closable=\"false\">\r\n");
      out.write("\t\t<form id=\"admin-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"username\" class=\"label-top\">管理员账号:</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入管理员账号',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:['email','length[4,20]']\"\r\n");
      out.write("\t\t\t\t\t\tinvalidMessage=\"用户名无效!请重新输入!\" validType=\"remote['checkUsername.do','username']\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\tname=\"username\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"realname\" class=\"label-top\">员工姓名:&nbsp;</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工姓名',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:['CHS','length[2,10]']\"\r\n");
      out.write("\t\t\t\t\t\tid=\"realname\" name=\"realname\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"phoneNo\" class=\"label-top\">员工手机:&nbsp;</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工手机',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'mobile'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"phoneNo\" name=\"phoneNo\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"officeTel\" class=\"label-top\">办公电话:&nbsp;</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工办公电话',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'tel'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"officeTel\" name=\"officeTel\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"admin-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveUser(1)\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#admin-ff').form('resetValidation').form('reset');$('#admin-dlg').dialog('close');\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"normal-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\"\r\n");
      out.write("\t\tbuttons=\"#normal-dlg-buttons\" closable=\"false\">\r\n");
      out.write("\t\t<form id=\"normal-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"rightName\" class=\"label-top\">员工账号:</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入用户账号',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'email'\"\r\n");
      out.write("\t\t\t\t\t\tinvalidMessage=\"用户名无效!请重新输入!\" validType=\"remote['checkUsername.do','username']\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\tname=\"username\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"pid\" class=\"label-top\" style=\"margin-right: 5px\">所属部门:</label><input id=\"cc1\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-combobox\" style=\"width: 150px\" name=\"departmentId\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\" valueField: 'id', textField: 'dname',url: 'getDepartment.do',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\teditable:false,\r\n");
      out.write("           \t\t\t\t\t\t\t\t panelHeight:'auto',    \r\n");
      out.write("        \t\t\t\t\t\t\t\tonSelect: function(rec){    \r\n");
      out.write("           \t\t\t\t\t\t\t\t var url = 'getJobByDid.do?departmentId='+rec.id;   \r\n");
      out.write("           \t\t\t\t\t\t\t\t  $('#cc2').combobox('clear'); \r\n");
      out.write("           \t\t\t\t\t\t\t\t $('#cc2').combobox('reload', url);}\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"job\" class=\"label-top\">所任职位:</label> <input id=\"cc2\" class=\"easyui-combobox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"valueField:'id',textField:'job'\" style=\"width: 150px\" panelHeight='auto'\r\n");
      out.write("\t\t\t\t\t\teditable='false' name=\"jobInfoId\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"realname\" class=\"label-top\">员工姓名:</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工姓名',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:['length[2,10]','CHS']\"\r\n");
      out.write("\t\t\t\t\t\tid=\"realname\" name=\"realname\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"phoneNo\" class=\"label-top\">员工手机:</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工手机',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'mobile'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"phoneNo\" name=\"phoneNo\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"officeTel\" class=\"label-top\">办公电话:</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入员工办公电话',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'tel'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"officeTel\" name=\"officeTel\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"normal-dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveUser(2)\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">提交</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-cancel\"\r\n");
      out.write("\t\t\tonclick=\"javascript:$('#normal-ff').form('resetValidation').form('reset');$('#normal-dlg').dialog('close');\"\r\n");
      out.write("\t\t\tstyle=\"width:90px\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"reset-dlg\" class=\"easyui-dialog\" style=\"width:565px;\"\r\n");
      out.write("\t\tdata-options=\"resizable:false,modal:false\" closed='true' noheader='true' border='false'\r\n");
      out.write("\t\tshadow='false'>\r\n");
      out.write("\t\t<table id=\"reset-dg\" title=\"重置密码请求表\" style=\"width:545px;margin: 10px\"\r\n");
      out.write("\t\t\tdata-options=\"singleSelect:true,collapsible:false,method:'post'\" closable='true'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'id',width:80,align:'center'\">请求编号</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'username',width:200,align:'center'\">员工账号</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'phoneNo',width:200,align:'center'\">员工手机</th>\r\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'action',width:50,align:'center'\" formatter=\"actionFormat\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction saveUser(type) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (type == 1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('#admin-ff').form('submit', {\r\n");
      out.write("\t\t\t\t\turl : \"addUser.do\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t//重置验证\r\n");
      out.write("\t\t\t\t\t\t\t$('#admin-ff').form('resetValidation');\r\n");
      out.write("\t\t\t\t\t\t\t//表单重置\r\n");
      out.write("\t\t\t\t\t\t\t$('#admin-ff').form('reset');\r\n");
      out.write("\t\t\t\t\t\t\t//关闭对话框\r\n");
      out.write("\t\t\t\t\t\t\t$('#admin-dlg').dialog('close')\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', '管理员账号添加成功！', 'info');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tif ($(\"#cc1\").combobox('getValue') != '' && $(\"#cc2\").combobox('getValue')!= '')\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$('#normal-ff').form('submit', {\r\n");
      out.write("\t\t\t\t\t\turl : \"addUser.do\",\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#normal-ff').form('resetValidation').form('reset');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#normal-dlg').dialog('close')\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('OK', '员工账号添加成功！', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction cancleUser() {\r\n");
      out.write("\t\t\t$.messager.prompt('注销员工账号', '请输入将要注销的员工账号', function(r) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\tvar res = /^[\\w\\.-]+?@([\\w\\-]+\\.){1,2}[a-zA-Z]{2,3}$/\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (res.test(r)) {\r\n");
      out.write("\t\t\t\t\t\t$.post('cancleUser.do', {\r\n");
      out.write("\t\t\t\t\t\t\tusername : r\r\n");
      out.write("\t\t\t\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('OK', '账号注销成功!', 'info');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif (data == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('警告', '用户名不存在!请检查后重新输入!', 'warnning');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif (data == 2)\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('警告', '该账号已注销,请确认!', 'warnning');\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('警告', '用户名无效!请重新输入!', 'warnning');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showResetPass() {\r\n");
      out.write("\t\t\t$('#reset-dg').datagrid({\r\n");
      out.write("\t\t\t\turl : 'querRestRequest.do',\r\n");
      out.write("\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (data.rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('OK', '暂时无重置密码请求！', 'info');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$('#reset-dlg').dialog('open').dialog('center');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction restPass() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.messager.confirm('确认', '确认重置该账号密码', function(r) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\tvar row = $('#reset-dg').datagrid('getSelected');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$.post('resetPass.do', {\r\n");
      out.write("\t\t\t\t\t\tid : row.id,\r\n");
      out.write("\t\t\t\t\t\tusername : row.username,\r\n");
      out.write("\t\t\t\t\t\tphoneNo : row.phoneNo\r\n");
      out.write("\t\t\t\t\t}, function(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif (data == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('OK', '密码重置成功!', 'info');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#reset-dg\").datagrid('reload');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction actionFormat(value, row) {\r\n");
      out.write("\t\t\tif (row.id != '')\r\n");
      out.write("\t\t\t\treturn \"<a href='javascript:restPass()'>重置</a>\"\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<span style=\"font-size: 18;font-weight: bold;\">功能导航：</span><a href=\"javascript:void(0)\"\r\n");
        out.write("\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
        out.write("\t\t\tonclick=\"javascript:$('#admin-dlg').dialog('open').dialog('center').dialog('setTitle','新增管理员');\"\r\n");
        out.write("\t\t\tstyle=\"height: 32px\">&nbsp;新增管理员&nbsp;</a> <span style=\"margin-left: 30px\"><a\r\n");
        out.write("\t\t\thref=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\"\r\n");
        out.write("\t\t\tonclick=\"cancleUser()\" style=\"height: 32px\">&nbsp;注销员工账号&nbsp;</a>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</span>\r\n");
        out.write("\t\t\t");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.jobInfoId==2 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t <span\r\n");
        out.write("\t\t\tstyle=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
        out.write("\t\t\tdata-options=\"iconCls:'icon-add'\" style=\"height: 32px\"\r\n");
        out.write("\t\t\tonclick=\"javascript:$('#normal-dlg').dialog('open').dialog('center').dialog('setTitle','新增用户');\">&nbsp;新增普通用户&nbsp;</a></span>\r\n");
        out.write("\t\t<span style=\"margin-left: 30px\"><a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
        out.write("\t\t\tdata-options=\"iconCls:'icon-reload'\" style=\"height: 32px\" onclick=\"showResetPass()\">&nbsp;重置账号密码&nbsp;</a></span>\r\n");
        out.write("\t\t\t");
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
