package net.test.www;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    private static final long serialVersionUID = -5604481158386227221L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         *     1.获取所有的cookie，判断是否是第一次访问
         *     2.如果是第一次访问
         *        * 输出欢迎，记录当前的时间，回写到浏览器
         *     3.如果不是第一次访问
         *        * 获取时间，输出到浏览器，记录当前的时间，回写到浏览器。
         *     记录当前的时间，回写到浏览器。
         */
        // 设置字符中文乱码问题
        response.setContentType("text/html;charset=UTF-8");
        // 获取所有的cookie
        Cookie[] cookies = request.getCookies();
        // 通过指定cookie名称来查找cookie      Cookie c = new Cookie("last","当前的时间");
        Cookie cookie = getCookieByName(cookies, "lastTime");
        // 判断，如果cookie==null，说明是第一次访问
        if (cookie == null) {
            // 输出欢迎，记录当前的时间，回写到浏览器
            response.getWriter().write("<h1>中国农业大学</h1>"
                    + "<h3>信电学院，欢迎您的到来！</h3>");
        } else {
            // 获取cookie的值，输出浏览器，记录当前的时间，回写到浏览器
            String value = cookie.getValue();
            // 输出浏览器（cookie的值中含有 “ ”,需要进行解码）
            response.getWriter().write("<h1>中国农业大学</h1>"
                    + "<h3>信电学院，欢迎您的归来</h3><h3>您上次的时间是" + URLDecoder.decode(value) + "</h3>");
        }
        // 记录当前的时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sDate = sdf.format(date);
        // 回写到浏览器
        // 使用cookie回写（cookie的值中含有 “ ”,需要进行编码才能使用）
        Cookie c = new Cookie("lastTime", URLEncoder.encode(sDate));
        // 设置有效时间为一天
        c.setMaxAge(60 * 60 * 24);    // 秒
        // 设置有效路径
        c.setPath("/sessionDemo");
        // 回写
        response.addCookie(c);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    private static Cookie getCookieByName(Cookie[] cookies, String name) {
        if (cookies != null) {
            for (Cookie cook : cookies
            ) {
                if (cook.getName().equals(name)) {
                    return cook;
                }
            }
        }
        return null;
    }
}
