package task14;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

//  Для получения ответа сервера:
//  1) Запустить этот класс;
//  2) В браузере ввести localhost:8888 и нажать Enter.

public class MyHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8888), 0);
        HttpContext context = server.createContext("/");
        context.setHandler(MyHttpServer::handleRequest);
        server.start();
    }

    private static void handleRequest(HttpExchange exchange) throws IOException {
        String encoding = "UTF-8";

        String response = "<p style=\"font-size: 24px; color: green; " +
                "font-weight: bold; text-align:center\"> Таблица персонала</p>" +
                "\t<table align=center width=40% height=40% border=\"2\">\n" +
                "<col span=\"1\" style=\"background:LightBlue\">" +
                "<col span=\"1\" style=\"background:LightCyan\">" +
                "\t\t<tr>\n" +
                "\t\t\t<th>Фамилия и имя</th>\n" +
                "\t\t\t<th>Телефон</th>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>Ложкин Герасим</td>\n" +
                "\t\t\t<td>+38(066)123-12-11</td>\n" +
                "\t\t</tr>\t\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>Тарелкоф Емельян</td>\n" +
                "\t\t\t<td>+38(067)101-11-21</td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>Сахар Викентий</td>\n" +
                "\t\t\t<td>+38(063)404-15-11</td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>Чашкина Прасковья</td>\n" +
                "\t\t\t<td>+38(050)208-14-15</td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>Конфеткина Лукерья</td>\n" +
                "\t\t\t<td>+38(098)601-80-81</td>\n" +
                "\t\t</tr>\n" +
                "\t</table>";

        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=" + encoding);
        exchange.sendResponseHeaders(200, response.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
