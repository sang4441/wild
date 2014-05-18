package org.apache.jsp.WEB_002dINF.pages.admin.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<h2 class=\"sub-header\">Users</h2>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("        <input ng-model=\"query\" name=\"size\" class=\"form-control\"  placeholder=\"Search\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div><a href=\"user/new\"><button type=\"button\" class=\"btn btn-default\">New User</button></a></div>\n");
      out.write("<div class=\"table-responsive\">\n");
      out.write("    <div ng-controller=\"User\">\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>#</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Phone</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Province</th>\n");
      out.write("                <th>City</th>\n");
      out.write("                <th>Street 1</th>\n");
      out.write("                <th>Street 2</th>\n");
      out.write("                <th>Role</th>\n");
      out.write("                <th>Created Date</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <tr ng-repeat=\"user in users | filter:query\">\n");
      out.write("                <td>{{user.id}}</td>\n");
      out.write("                <td>{{user.name}}</td>\n");
      out.write("                <td>{{user.gender}}</td>\n");
      out.write("                <td>{{user.email}}</td>\n");
      out.write("                <td>{{user.phone}}</td>\n");
      out.write("                <td>{{user.description}}</td>\n");
      out.write("                <td>{{user.province}}</td>\n");
      out.write("                <td>{{user.city}}</td>\n");
      out.write("                <td>{{user.street1}}</td>\n");
      out.write("                <td>{{user.street2}}</td>\n");
      out.write("                <td>{{user.role}}</td>\n");
      out.write("                <td>{{user.date_created}}</td>\n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
