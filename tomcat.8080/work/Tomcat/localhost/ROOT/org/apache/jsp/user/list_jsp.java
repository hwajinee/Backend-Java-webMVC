/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-10-10 04:29:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import jwp.model.User;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/include/navigation.jspf", Long.valueOf(1696911860512L));
    _jspx_dependants.put("/include/head.jspf", Long.valueOf(1696912010459L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("jwp.model.User");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>KUIT</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("  </head>");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\" aria-label=\"Fourth navbar example\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"/\"> KUIT </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\n");
      out.write("          <ul class=\"navbar-nav me-auto mb-2 mb-md-0\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Home</a>\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <form>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar-default\">\n");
      out.write("    <header class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\n");
      out.write("        <a href=\"/\" class=\"d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none\">\n");
      out.write("            <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\"><use xlink:href=\"#bootstrap\"/></svg>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <ul class=\"nav col-12 col-md-auto mb-2 justify-content-center mb-md-0\">\n");
      out.write("            <li><a href=\"/index.html\" class=\"nav-link px-2 link-secondary\">Q&A</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">FAQs</a></li>\n");
      out.write("            <li><a href=\"/user/userList\" class=\"nav-link px-2 link-dark\">User List</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">About</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 text-end\">\n");
      out.write("            <a href=\"/user/login.html\" type=\"button\" class=\"btn btn-outline-primary me-2\">Login</a>\n");
      out.write("            <a href=\"/user/form.html\" type=\"button\" class=\"btn btn-primary\">Sign-up</a>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"container\" id=\"main\">\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead class=\"col-md-12\">\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"col-md-3\">아이디</th>\n");
      out.write("                <th class=\"col-md-3\">이름</th>\n");
      out.write("                <th class=\"col-md-3\">이메일</th>\n");
      out.write("                <th class=\"col-md-3\">#</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");

                Collection<User> users = (Collection<User>) request.getAttribute("users");
                for (User user : users) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"col-md-3\">");
      out.print( user.getUserId() );
      out.write("\n");
      out.write("                </th>\n");
      out.write("                <th class=\"col-md-3\">");
      out.print( user.getName() );
      out.write("\n");
      out.write("                </th>\n");
      out.write("                <th class=\"col-md-3\">");
      out.print( user.getEmail() );
      out.write("\n");
      out.write("                </th>\n");
      out.write("                <th class=\"col-md-3\"><a href=\"#\" class=\"btn btn-success\" role=\"button\">수정</a></th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"../js/scripts.js\"></script>\n");
      out.write("</body>\n");
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
