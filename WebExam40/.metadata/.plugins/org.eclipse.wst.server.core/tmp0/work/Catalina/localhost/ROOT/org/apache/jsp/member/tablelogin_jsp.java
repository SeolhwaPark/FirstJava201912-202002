/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-04-17 07:36:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tablelogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1583283822757L));
    _jspx_dependants.put("/member/../header.jsp", Long.valueOf(1585713800566L));
    _jspx_dependants.put("jar:file:/C:/Users/lunas/JavaSeolhwa/WebExam40/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/blogProject/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/member/../footer.jsp", Long.valueOf(1585029835620L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Seolhwa's Blog</title>\r\n");
      out.write("\t<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css\">\r\n");
      out.write("\t<link href=\"css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/mystyle.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("    \t\r\n");
      out.write("      $('.slider').bxSlider({\r\n");
      out.write("    \t  mode: 'fade',\r\n");
      out.write("    \t  captions: true\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      $(\".sitemap\").click(function() {\r\n");
      out.write("\t\t\t$(\".sitewrap\").slideDown();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t  $(\"#close\").click(function() {\r\n");
      out.write("\t\t\t$(\".sitewrap\").slideUp();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t  $(\".nav > nav > .navi > li\").hover(function() {\r\n");
      out.write("\t\t  $(this).children(\".navi2\").stop().slideDown();\r\n");
      out.write("\t  }, function() {\r\n");
      out.write("\t\t  $(this).children(\".navi2\").stop().slideUp();\r\n");
      out.write("\t  });\r\n");
      out.write("\t\t\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"topnav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0)\" class=\"sitemap\">Sitemaps</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"navigation\">\r\n");
      out.write("\t\t\t\t<h1 class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"index\">Seolhwa Park</a></h1>\r\n");
      out.write("\t\t\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"self_main\">Self</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"navi2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"resume_list\">Resume</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"self_list\">Self introduction</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"gallery_main\">Gallery</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"navi2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"every_list\">Everyday Life</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"illust_list\">Illustration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"study_main\">Study</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"navi2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"web_list\">Web programming</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"ui_list\">UI design</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"diary_list?idx=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Diary</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact_write\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"line\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"sitewrap\">\r\n");
      out.write("\t\t<span class=\"fa fa-close\" id=\"close\" style=\"cursor:pointer\"></span>\r\n");
      out.write("\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t<span class=\"map\">Self</span>\r\n");
      out.write("\t\t\t<span class=\"map\">Gallery</span>\r\n");
      out.write("\t\t\t<span class=\"map\">Study</span>\r\n");
      out.write("\t\t\t<span class=\"map\">Diary</span>\r\n");
      out.write("\t\t\t<span class=\"map\">Contact</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"contain\">\r\n");
      out.write("\t<div class=\"sub-topcontent\">\r\n");
      out.write("\t\t<h2 class=\"sub-title\">Login</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"write-form\" style=\"width:50%; margin:0 auto;\">\r\n");
      out.write("\t\t<table summery=\"아이디, 패스워드 입력\">\r\n");
      out.write("\t\t\t<caption class=\"readonly\">로그인 입력폼</caption>\t\t\t\r\n");
      out.write("\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t<col width=\"70%\">\r\n");
      out.write("\t\t\t\t<col width=\"30%\">\r\n");
      out.write("\t\t\t</colgroup>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t<form name=\"my\" method=\"post\" action=\"login\" onsubmit=\"return formcheck();\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>아이디</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"id\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\" class=\"btn-write\" style=\"height:110px;\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>패스워드</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"pass1\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" style=\"text-align:center;\">아이디찾기 | 패스워드 찾기</td>\r\n");
      out.write("\t\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction formcheck() {\r\n");
      out.write("\t\tif(my.id.value==\"\") {\r\n");
      out.write("\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\tmy.id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(my.pass1.value==\"\") {\r\n");
      out.write("\t\t\talert(\"패스워드를 입력하세요\");\r\n");
      out.write("\t\t\tmy.pass1.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>&copy; Seolhwa. All &nbsp;&nbsp;&nbsp;Rights Reserved.</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<!-- &copy; &nbsp; &gt; > &lt;< -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /member/../header.jsp(46,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty id}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<li><a href=\"login\">Login</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"member\">Join</a></li>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /member/../header.jsp(50,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty id}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<li><a href=\"logout\">Logout</a></li>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
