package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>CRM系统</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "uiImport.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction newTab(title, url) {\r\n");
      out.write("\t\tif ($('#tt').tabs('exists', title)) {\r\n");
      out.write("\t\t\t$('#tt').tabs('select', title)\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#tt').tabs('add', {\r\n");
      out.write("\t\t\t\ttitle : title,\r\n");
      out.write("\t\t\t\tclosable : true,\r\n");
      out.write("\t\t\t\twidth : '1000px',\r\n");
      out.write("\t\t\t\thref : url,\r\n");
      out.write("\t\t\t\ttools : [ {\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-mini-refresh',\r\n");
      out.write("\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\talert('refresh');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction updateUser() {\r\n");
      out.write("\t\t$('#user-ff').form('submit', {\r\n");
      out.write("\t\t\turl : 'updateUser.do',\r\n");
      out.write("\t\t\tonSubmit : function(param) {\r\n");
      out.write("\t\t\t\tparam.id = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif (data == \"1\") {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$('#user-dlg').dialog('close')\r\n");
      out.write("\t\t\t\t\t$.messager.alert('', '个人信息修改成功!', 'info');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction changePass() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar oldPwd=$(\"#oldPass\").val();\r\n");
      out.write("\t\tvar newPwd=$(\"#newPass\").val();\r\n");
      out.write("\t\toldPwd=hex_sha1(oldPwd);\r\n");
      out.write("\t\tvar newPwd=hex_sha1($(\"#newPass\").val());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.post(\"changePass.do\",{employeeId:$(user.id),pass:oldPwd,newPass:newPwd},function(data){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.messager.confirm('', '密码修改成功,请重新登陆!', function(r){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\twindow.location.href=\"login.jsp\";\t   \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else if(data==\"0\"){\r\n");
      out.write("\t\t\t\t$.messager.alert('', '原密码输入不正确,请重新操作!', 'warnning');\r\n");
      out.write("\t\t\t\t$('#pwd-ff').form('resetValidation').form('reset');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logout(){\r\n");
      out.write("\t\t$.messager.confirm('', '您想要退出该系统吗？', function(r){\r\n");
      out.write("\t\t\tif (r){\r\n");
      out.write("\t\t\t  window.location.href=\"logout.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<div data-options=\"region:'north',border:false\" style=\"height:60px;background:#FFFFFF;\">\r\n");
      out.write("\t\t<div style=\"margin-top: 6px;float: left;margin-left: 600px\">\r\n");
      out.write("\t\t\t<img src=\"images/oracle.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div align=\"right\" style=\"float: left;margin-left: 400px;margin-top: 40px\">\r\n");
      out.write("\t\t\t<span>当前用户:<a href=\"javascript:$('#user-dlg').dialog('open')\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.nickname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></span>&nbsp;&nbsp;<a\r\n");
      out.write("\t\t\t\thref=\"javascript:logout()\">注销</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"user-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\" title=\"个人基本信息\"\r\n");
      out.write("\t\tbuttons=\"#user-dlg-buttons\" closable=\"true\">\r\n");
      out.write("\t\t<form id=\"user-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"nickname\" class=\"label-top\">昵称:&nbsp;&nbsp;&nbsp;</label> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入新昵称',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:['email','length[4,20]']\"\r\n");
      out.write("\t\t\t\t\t\tinvalidMessage=\"新昵称无效!请重新输入!\" validType=\"length[2,10]\" id=\"nickname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.nickname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tname=\"nickname\" style=\"width: 270px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"phoneNo\" class=\"label-top\">我的手机:&nbsp;</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入您的手机号',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'mobile'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"phoneNo\" name=\"phoneNo\" style=\"width: 270px\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phoneNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"officeTel\" class=\"label-top\">办公电话:&nbsp;</label> <input class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入您的办公电话',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'tel'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"officeTel\" name=\"officeTel\" style=\"width: 270px\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.officeTel }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"user-dlg-buttons\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" onclick=\"updateUser()\"\r\n");
      out.write("\t\t\t\tstyle=\"width:90px\">保存</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\ticonCls=\"icon-reload\" onclick=\"javascript:$('#pwd-dlg').dialog('open');$('#user-dlg').dialog('close')\" style=\"width:90px\">修改密码</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"pwd-dlg\" class=\"easyui-dialog\" style=\"width:400px\" closed=\"true\" title=\"修改密码\"\r\n");
      out.write("\t\tbuttons=\"#pwd-dlg-buttons\" closable=\"true\">\r\n");
      out.write("\t\t<div style=\"padding-left: 50px\">\r\n");
      out.write("\t\t<form id=\"pwd-ff\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"oldPass\" class=\"label-top\">原密码:&nbsp;</label> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-textbox\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入原密码',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[6,16]'\"\r\n");
      out.write("\t\t\t\t\t\t validType=\"length[6,18]\" id=\"oldPass\" \r\n");
      out.write("\t\t\t\t\t\tname=\"oldPass\" style=\"width: 200px\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label for=\"newPass\" class=\"label-top\">新密码:&nbsp;</label> <input class=\"easyui-textbox\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"missingMessage:'请输入您的新密码!',tipPosition:'bottom',required:true,validateOnCreate:false,validateOnBlur:true,validType:'length[6,16]'\"\r\n");
      out.write("\t\t\t\t\t\tid=\"newPass\" name=\"newPass\" style=\"width: 200px\"  />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"pwd-dlg-buttons\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-save\" onclick=\"changePass()\"\r\n");
      out.write("\t\t\t\tstyle=\"width:90px\">确认修改</a> <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\ticonCls=\"icon-cancel\" onclick=\"javascript:$('#pwd-ff').form('resetValidation').form('reset');$('#pwd-dlg').dialog('close');\" style=\"width:90px\">取消</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'west',split:false,border:true,title:'功能区'\"\r\n");
      out.write("\t\tstyle=\"width:210px;padding:10px;\">\r\n");
      out.write("\t\t<div id=\"aa\" class=\"easyui-accordion\" style=\"width:190px;\">\r\n");
      out.write("\t\t\t<div title=\"我的CRM\" style=\"padding:10px;\" selected=\"false\" border=\"false\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"cc\" class=\"easyui-calendar\" style=\"width:190px;height:180px;margin-top: 30px\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'south',border:false\" style=\"height:50px;background:#F0F8FF;\">\r\n");
      out.write("\t\t<div align=\"center\" style=\"margin-top: 20px\">\r\n");
      out.write("\t\t\t&copy;<a href=\"http://www.oracleoaec.net/\">2016 上海海文信息技术有限公司</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center',border:true\">\r\n");
      out.write("\t\t<div id=\"tt\" class=\"easyui-tabs\" style=\"width:500px;height:250px;\" fit=\"true\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rights}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("r");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.rightName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t<div style=\"margin:10px;text-align: center\">\r\n");
          out.write("\t\t\t\t\t\t<a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.rid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"javascript:void(0)\" class=\"easyui-linkbutton\" plain=\"false\"\r\n");
          out.write("\t\t\t\t\t\t\tonclick=\"newTab('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.rightName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" style=\"width: 100px;height: 20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.rightName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
