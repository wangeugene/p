package email.configuraton;

import lombok.Data;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.<br/>
 *
 * @author: eugene<br />
 * Date: 18/11/2020<br/>
 * Time: 5:00 pm<br/>
 * To change this template use File | Settings | File Templates.
 */


@Data
public class NetEaseMailClientConfiguration extends MailClientConfiguration {
    private String MAIL_SERVER_HOST = "smtp.163.com";
    private String MAIL_SERVER_PORT = "25"; // 465 requires SSL enable
    private String username;
    private String password;
    private String fromAddress;
    private String toAddress;
    private String ccAddress;
    private String subject = "NetEase Report";
    private String content = "NetEase Content";

    @Override
    public Properties getProperties() {
        Properties p = new Properties();
        p.put("mail.smtp.host", MAIL_SERVER_HOST);
        p.put("mail.smtp.port", MAIL_SERVER_PORT);
        p.put("mail.smtp.auth", "true");
        return p;
    }
}
