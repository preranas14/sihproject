package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class how_005fit_005fworks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://unpkg.com/scrollreveal\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.js\"></script>\n");
      out.write("        <style>\n");
      out.write("body {\t\n");
      out.write("  margin: 0;\n");
      out.write("  padding-top: 120px;\n");
      out.write("  background: rgb(230,230,230);\n");
      out.write("  \n");
      out.write("  color: rgb(50,50,50);\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 112.5%;\n");
      out.write("  line-height: 1.6em;\n");
      out.write("    \n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ================ The Timeline ================ */\n");
      out.write("\n");
      out.write(".timeline {\n");
      out.write("  position: relative;\n");
      out.write("  width: 660px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  padding: 1em 0;\n");
      out.write("  list-style-type: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".timeline:before {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 50%;\n");
      out.write("  top: 0;\n");
      out.write("  content: ' ';\n");
      out.write("  display: block;\n");
      out.write("  width: 6px;\n");
      out.write("  height: 100%;\n");
      out.write("  margin-left: -3px;\n");
      out.write("  background: rgb(80,80,80);\n");
      out.write("  background: -moz-linear-gradient(top, rgba(80,80,80,0) 0%, rgb(80,80,80) 8%, rgb(80,80,80) 92%, rgba(80,80,80,0) 100%);\n");
      out.write("  background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(30,87,153,1)), color-stop(100%,rgba(125,185,232,1)));\n");
      out.write("  background: -webkit-linear-gradient(top, rgba(80,80,80,0) 0%, rgb(80,80,80) 8%, rgb(80,80,80) 92%, rgba(80,80,80,0) 100%);\n");
      out.write("  background: -o-linear-gradient(top, rgba(80,80,80,0) 0%, rgb(80,80,80) 8%, rgb(80,80,80) 92%, rgba(80,80,80,0) 100%);\n");
      out.write("  background: -ms-linear-gradient(top, rgba(80,80,80,0) 0%, rgb(80,80,80) 8%, rgb(80,80,80) 92%, rgba(80,80,80,0) 100%);\n");
      out.write("  background: linear-gradient(to bottom, rgba(80,80,80,0) 0%, rgb(80,80,80) 8%, rgb(80,80,80) 92%, rgba(80,80,80,0) 100%);\n");
      out.write("  \n");
      out.write("  z-index: 5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".timeline li {\n");
      out.write("  padding: 1em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".timeline li:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: block;\n");
      out.write("  height: 0;\n");
      out.write("  clear: both;\n");
      out.write("  visibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l {\n");
      out.write("  position: relative;\n");
      out.write("  width: 300px;\n");
      out.write("  float: left;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r {\n");
      out.write("  position: relative;\n");
      out.write("  width: 300px;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flag-wrapper {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("  \n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flag {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline;\n");
      out.write("  background: rgb(248,248,248);\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  \n");
      out.write("  font-weight: 600;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .flag {\n");
      out.write("  -webkit-box-shadow: -1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("  -moz-box-shadow: -1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("  box-shadow: -1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .flag {\n");
      out.write("  -webkit-box-shadow: 1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("  -moz-box-shadow: 1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("  box-shadow: 1px 1px 1px rgba(0,0,0,0.15), 0 0 1px rgba(0,0,0,0.15);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .flag:before,\n");
      out.write(".direction-r .flag:before {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  right: -40px;\n");
      out.write("  content: ' ';\n");
      out.write("  display: block;\n");
      out.write("  width: 12px;\n");
      out.write("  height: 12px;\n");
      out.write("  margin-top: -10px;\n");
      out.write("  background: #fff;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  border: 4px solid rgb(255,80,80);\n");
      out.write("  z-index: 10;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .flag:before {\n");
      out.write("  left: -40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .flag:after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  left: 100%;\n");
      out.write("  top: 50%;\n");
      out.write("  height: 0;\n");
      out.write("  width: 0;\n");
      out.write("  margin-top: -8px;\n");
      out.write("  border: solid transparent;\n");
      out.write("  border-left-color: rgb(248,248,248);\n");
      out.write("  border-width: 8px;\n");
      out.write("  pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .flag:after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  right: 100%;\n");
      out.write("  top: 50%;\n");
      out.write("  height: 0;\n");
      out.write("  width: 0;\n");
      out.write("  margin-top: -8px;\n");
      out.write("  border: solid transparent;\n");
      out.write("  border-right-color: rgb(248,248,248);\n");
      out.write("  border-width: 8px;\n");
      out.write("  pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".time-wrapper {\n");
      out.write("  display: inline;\n");
      out.write("  \n");
      out.write("  line-height: 1em;\n");
      out.write("  font-size: 0.66666em;\n");
      out.write("  color: rgb(250,80,80);\n");
      out.write("  vertical-align: middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .time-wrapper {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .time-wrapper {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".time {\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 4px 6px;\n");
      out.write("  background: rgb(248,248,248);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".desc {\n");
      out.write("  margin: 1em 0.75em 0 0;\n");
      out.write("  \n");
      out.write("  font-size: 0.77777em;\n");
      out.write("  font-style: italic;\n");
      out.write("  line-height: 1.5em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .desc {\n");
      out.write("  margin: 1em 0 0 0.75em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ================ Timeline Media Queries ================ */\n");
      out.write("\n");
      out.write("@media screen and (max-width: 660px) {\n");
      out.write("\n");
      out.write(".timeline {\n");
      out.write(" \twidth: 100%;\n");
      out.write("\tpadding: 4em 0 1em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".timeline li {\n");
      out.write("\tpadding: 2em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l,\n");
      out.write(".direction-r {\n");
      out.write("\tfloat: none;\n");
      out.write("\twidth: 100%;\n");
      out.write("\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flag-wrapper {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flag {\n");
      out.write("\tbackground: rgb(255,255,255);\n");
      out.write("\tz-index: 15;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .flag:before,\n");
      out.write(".direction-r .flag:before {\n");
      out.write("  position: absolute;\n");
      out.write("  top: -30px;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tcontent: ' ';\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 12px;\n");
      out.write("\theight: 12px;\n");
      out.write("\tmargin-left: -9px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tborder: 4px solid rgb(255,80,80);\n");
      out.write("\tz-index: 10;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .flag:after,\n");
      out.write(".direction-r .flag:after {\n");
      out.write("\tcontent: \"\";\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttop: -8px;\n");
      out.write("\theight: 0;\n");
      out.write("\twidth: 0;\n");
      out.write("\tmargin-left: -8px;\n");
      out.write("\tborder: solid transparent;\n");
      out.write("\tborder-bottom-color: rgb(255,255,255);\n");
      out.write("\tborder-width: 8px;\n");
      out.write("\tpointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".time-wrapper {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tposition: relative;\n");
      out.write("\tmargin: 4px 0 0 0;\n");
      out.write("\tz-index: 14;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .time-wrapper {\n");
      out.write("\tfloat: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-r .time-wrapper {\n");
      out.write("\tfloat: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".desc {\n");
      out.write("\tposition: relative;\n");
      out.write("\tmargin: 1em 0 0 0;\n");
      out.write("\tpadding: 1em;\n");
      out.write("\tbackground: rgb(245,245,245);\n");
      out.write("\t-webkit-box-shadow: 0 0 1px rgba(0,0,0,0.20);\n");
      out.write("\t-moz-box-shadow: 0 0 1px rgba(0,0,0,0.20);\n");
      out.write("\tbox-shadow: 0 0 1px rgba(0,0,0,0.20);\n");
      out.write("\t\n");
      out.write("  z-index: 15;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".direction-l .desc,\n");
      out.write(".direction-r .desc {\n");
      out.write("\tposition: relative;\n");
      out.write("\tmargin: 1em 1em 0 1em;\n");
      out.write("\tpadding: 1em;\n");
      out.write("\t\n");
      out.write("  z-index: 15;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 400px) and (max-width: 660px) {\n");
      out.write("\n");
      out.write(".direction-l .desc,\n");
      out.write(".direction-r .desc {\n");
      out.write("\tmargin: 1em 4em 0 4em;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    display: block;\n");
      out.write("    list-style-type: disc;\n");
      out.write("    margin-block-start: 1em;\n");
      out.write("    margin-block-end: 1em;\n");
      out.write("    margin-inline-start: 0px;\n");
      out.write("    margin-inline-end: 0px;\n");
      out.write("    padding-inline-start: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body><link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h1>HOW TO APPLY</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"h4 mb-1\" style=\"opacity:0.88;\"><h3>Create an Account</h3></li>\n");
      out.write("\t\t<ul>\n");
      out.write("                    <p style=\"color:#000000;opacity:0.75;\">Both Students and Prospecitve Studens can create account in the portal. <br>Click on relevant button and fill the details to create a new account</p>\n");
      out.write("\t\t</ul>\n");
      out.write("            <li class=\"h4 mt-1\" style=\"opacity:0.88;\"><h3>Verify OTP to activate account</h3> </li>\n");
      out.write("\t\t<ul>\n");
      out.write("                    <p style=\"color:#000000;opacity:0.75;\">An OTP will be sent to your mobile number. Login using the username and <br> password and click on 'OTP Verification' tab and enter the OTP to activate your account</p>\n");
      out.write("\t\t</ul>\n");
      out.write("                <li class=\"h4 mt-1\" style=\"opacity:0.88;\"><h3>Submit your Grievance</h3></li>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t <p style=\"color:#000000;opacity:0.75;\">Once the OTP has been verified, you can submit your grievances</p>\n");
      out.write("\t\t</ul>\n");
      out.write("\t </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h1 style=\"text-align:center\">TIMELINE</h1>\n");
      out.write("<ul class=\"timeline\">\n");
      out.write("\n");
      out.write("\t<!-- Item 1 -->\n");
      out.write("\t<li>\n");
      out.write("\t\t<div class=\"direction-r\">\n");
      out.write("                    <div data-aos=\"fade-left\" >\n");
      out.write("\t\t\t<div class=\"flag-wrapper\">\n");
      out.write("\t\t\t\t<span class=\"flag\" style=\"font-size:1.1em\" >Grievance submission</span>\n");
      out.write("\t\t\t\t<span class=\"time-wrapper\"><span class=\"time\">Stage-1</span></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"desc\" style=\"font-size:1.1em\" >Submit grievances related to academics, examination, results, complaints and suggestions related to institutions, management and universities.</div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("  \n");
      out.write("\t<!-- Item 2 -->\n");
      out.write("\t<li>\n");
      out.write("\t\t<div class=\"direction-l\">\n");
      out.write("                    <div data-aos=\"fade-right\">\n");
      out.write("\t\t\t<div class=\"flag-wrapper\">\n");
      out.write("\t\t\t\t<span class=\"flag\" style=\"font-size:1.1em\" >Officer in Universities</span>\n");
      out.write("\t\t\t\t<span class=\"time-wrapper\"><span class=\"time\">Stage-2</span></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"desc\" style=\"font-size:1em\" >A nodal officer at each University/Institution will attend the grievances received and will forward it to the concerned personnel for redressel actions. Portal will be updated with most recent information.</div>\n");
      out.write("\t\t</div>\n");
      out.write("                </div>\n");
      out.write("\t</li>\n");
      out.write("\n");
      out.write("\t<!-- Item 3 -->\n");
      out.write("\t<li>\n");
      out.write("\t\t<div class=\"direction-r\">\n");
      out.write("                    <div data-aos=\"fade-left\">\n");
      out.write("\t\t\t<div class=\"flag-wrapper\">\n");
      out.write("\t\t\t\t<span class=\"flag\" style=\"font-size:1.1em\" >Status Updates</span>\n");
      out.write("\t\t\t\t<span class=\"time-wrapper\"><span class=\"time\">Stage-3</span></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"desc\" style=\"font-size:1em\" >Comments and actions taken at each level will be updated in the portal</div>\n");
      out.write("\t\t</div>\n");
      out.write("                </div>\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("\t\t<div class=\"direction-l\">\n");
      out.write("                    <div data-aos=\"fade-right\">\n");
      out.write("\t\t\t<div class=\"flag-wrapper\">\n");
      out.write("\t\t\t\t<span class=\"flag\" style=\"font-size:1.1em\" >Continuous monitoring</span>\n");
      out.write("\t\t\t\t<span class=\"time-wrapper\"><span class=\"time\">Stage-4</span></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"desc\" style=\"font-size:1em\" >Portal will be monitored by Minister's Office and necessary actions will be taken for delayed responses towards grievances submitted.\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}