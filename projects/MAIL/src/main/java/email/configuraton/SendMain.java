package email.configuraton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;


/**
 * Created by IntelliJ IDEA.<br/>
 * User: eugene<br/>
 * Date: 2018/12/27<br/>
 * Time: 17:50<br/>
 * To change this template use File | Settings | File Templates.
 * it's not working
 */
public class SendMain {
    private static final Logger logger = LoggerFactory.getLogger(SendMain.class);

    public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {
        MailClientConfiguration mailInfo = new NetEaseMailClientConfiguration();
        mailInfo.setSubject("Eugene Subject");
        mailInfo.setContent("这是一个中文测试邮件,下午开会");
        mailInfo.setToAddress("sail456852@hotmail.com");
        boolean b = SimpleMailSender.sendSimpleEmail(mailInfo);
        if (b) {
            logger.info("Mail Send Okay");
        } else {
            logger.info("b={}", "Mail Send Failure");
        }
    }
}
