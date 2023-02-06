/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-02-06 07:43:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.ibatis.reflection.SystemMetaObject;
import com.mvc.domain.Board;
import java.util.List;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.ibatis.reflection.SystemMetaObject");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.mvc.domain.Board");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

List<Board> boardList = (List) request.getAttribute("boardList");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<p class=\"display-2 text-center\">게시물 목록</p>\n");
      out.write("		<table class=\"table\">\n");
      out.write("			<thead>\n");
      out.write("				<tr>\n");
      out.write("					<th>고유번호</th>\n");
      out.write("					<th>제목</th>\n");
      out.write("					<th>작성자</th>\n");
      out.write("					<th>작성일</th>\n");
      out.write("					<th>조회수</th>\n");
      out.write("				</tr>\n");
      out.write("			</thead>\n");
      out.write("			<tbody>\n");
      out.write("				");

				for (int i = 0; i < boardList.size(); i++) {
					Board board = boardList.get(i);
				
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td>");
      out.print(board.getBoard_idx());
      out.write("</td>\n");
      out.write("					<td>\n");
      out.write("						<a href=\"/board/detail.do?board_idx=");
      out.print(board.getBoard_idx() );
      out.write('"');
      out.write('>');
      out.print(board.getTitle());
      out.write("</a>\n");
      out.write("					</td>\n");
      out.write("					<td>");
      out.print(board.getWriter());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(board.getContent());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(board.getHit());
      out.write("</td>\n");
      out.write("				</tr>\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("			</tbody>\n");
      out.write("		</table>\n");
      out.write("		<button class=\"btn btn-dark\" data-bs-toggle=\"modal\" data-bs-target=\"#registModal\">글쓰기</button>\n");
      out.write("\n");
      out.write("		<!-- The Modal -->\n");
      out.write("		<div class=\"modal\" id=\"registModal\">\n");
      out.write("			<div class=\"modal-dialog modal-lg\">\n");
      out.write("				<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("					<!-- Modal Header -->\n");
      out.write("					<div class=\"modal-header\">\n");
      out.write("						<h4 class=\"modal-title\">게시물 등록</h4>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<!-- Modal body -->\n");
      out.write("					<div class=\"modal-body\">\n");
      out.write("						<form id=\"registForm\">\n");
      out.write("							<div class=\"mb-3 mt-3\">\n");
      out.write("								<label for=\"title\" class=\"form-label\">Title:</label> <input type=\"text\" class=\"form-control\" name=\"title\">\n");
      out.write("							</div>\n");
      out.write("							<div class=\"mb-3 mt-3\">\n");
      out.write("								<label for=\"writer\" class=\"form-label\">Writer:</label> <input type=\"text\" class=\"form-control\" name=\"writer\">\n");
      out.write("							</div>\n");
      out.write("							<div class=\"mb-3 mt-3\">\n");
      out.write("								<label for=\"content\" class=\"form-label\">Content:</label>\n");
      out.write("								<textarea class=\"form-control\" rows=\"5\" name=\"content\"></textarea>\n");
      out.write("							</div>\n");
      out.write("						</form>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<!-- Modal footer -->\n");
      out.write("					<div class=\"modal-footer\">\n");
      out.write("						<button type=\"button\" class=\"btn btn-dark\" id=\"regist\">등록</button>\n");
      out.write("						<button type=\"button\" class=\"btn btn-dark\" data-bs-dismiss=\"modal\">목록</button>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("	function regist() {\n");
      out.write("		$(\"#registForm\").attr({\n");
      out.write("				action: \"/board/regist.do\",\n");
      out.write("				method: \"post\"\n");
      out.write("		});\n");
      out.write("		$(\"#registForm\").submit();\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	$(function() {\n");
      out.write("		$(\"#regist\").on(\"click\", function() {\n");
      out.write("			regist();\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
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
