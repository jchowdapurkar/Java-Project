/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-07-16 19:16:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("* {box-sizing: border-box}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password],input[type=email] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    margin: 5px 0 22px 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("input[type=text]:focus, input[type=password]:focus, input[type=email]:focus {\r\n");
      out.write("    background-color: orange;\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("    border: 1px solid #f1f1f1;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for all buttons */\r\n");
      out.write("button {\r\n");
      out.write("    background-color: green;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 10%;\r\n");
      out.write("    opacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("    opacity:0.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Extra styles for the cancel button */\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    background-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\r\n");
      out.write(".cancelbtn, .signupbtn {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Add padding to container elements //\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clear floats */\r\n");
      out.write(".clearfix::after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    clear: both;\r\n");
      out.write("    display: table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for cancel button and signup button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 50px) {\r\n");
      out.write("    .cancelbtn, .signupbtn {\r\n");
      out.write("       width: 10%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Sign Up</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<form action = \"Registration\" method =\"post\">\r\n");
      out.write("<h1>Sign Up</h1>\r\n");
      out.write("<h4>All feilds are mandatory</h4>\r\n");
      out.write("Username : <input type =\"text\" placeholder = \"Enter Username\" name = \"username\" required=\"required\">\r\n");
      out.write("Password : <input type =\"password\" placeholder = \" Password must be of 8 characters\" name = \"password\"  required=\"required\">\r\n");
      out.write("Re-enter Password :<input type = \"password\" placeholder = \"Re enter the password\" name = \"re enter password\" required = \"required\">\r\n");
      out.write("Email : <input type =\"Email\" placeholder = \"Enter a valid EmailId\" name = \"email\" required=\"required\">\r\n");
      out.write("Adhaar Number : <input type =\"text\" placeholder = \"Enter 12 digit Adhaar Number\" name=\"adhaar\"  required =\"required\">\r\n");
      out.write("<input type = \"submit\" value = \"REGISTER\">\r\n");
      out.write("<input type = \"submit\" value = \"CANCEL\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
