package net.test.www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dispatch")
public class Dispatch extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置向页面输出内容格式
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        // 尝试在请求转发前向response缓冲区写入内容，最后在页面查看是否展示
        writer.write("<h1>这是转发前在响应信息内的内容！</h1>");
        // 向reuqest域对象中添加属性，传递给下一个web资源
        request.setAttribute("webName", "中国农业大学");
        request.setAttribute("url", "CAU");
        request.setAttribute("welcome", "信息与电气工程学院，欢迎你");
        // 转发
        request.getRequestDispatcher("/DoServlet").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
