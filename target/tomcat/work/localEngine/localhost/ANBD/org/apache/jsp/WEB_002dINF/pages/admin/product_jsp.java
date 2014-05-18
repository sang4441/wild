package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<h1 class=\"page-header\">Dashboard</h1>\r\n");
      out.write("<h2 class=\"sub-header\">Product Listing</h2>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"col-sm-3\">\r\n");
      out.write("        <input ng-model=\"query\" name=\"size\" class=\"form-control\"  placeholder=\"Search\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div><a href=\"product/new\"><button type=\"button\" class=\"btn btn-default\">New Product</button></a></div>\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div ng-controller=\"Product\">\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>#</th>\r\n");
      out.write("                <th>Image</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <th>Category</th>\r\n");
      out.write("                <th>Brand</th>\r\n");
      out.write("                <th>Size</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr ng-repeat=\"item in items | filter:query\">\r\n");
      out.write("                    <td>{{item.id}}</td>\r\n");
      out.write("                    <td><img src=\"../../{{item.imageAddress[0]}}\" alt=\"Smiley face\" height=\"42\" width=\"42\"></td>\r\n");
      out.write("                    <td>{{item.name}}</td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>{{item.category}}</td>\r\n");
      out.write("                    <td>{{item.brandName}}</td>\r\n");
      out.write("                    <td>{{item.size}}</td>\r\n");
      out.write("                    <td>{{item.price}}</td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>{{item.status}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
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
