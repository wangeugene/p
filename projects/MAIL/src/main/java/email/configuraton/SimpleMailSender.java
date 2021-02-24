package email.configuraton;

import com.sun.mail.smtp.SMTPTransport;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: eugene<br/>
 * Date: 2018/12/27<br/>
 * Time: 17:35<br/>
 * To change this template use File | Settings | File Templates.
 */
public class SimpleMailSender {
    private static final Logger logger = LoggerFactory.getLogger(SimpleMailSender.class);

    private SimpleMailSender() {
    }

    public static boolean sendSimpleEmail(MailClientConfiguration conf) {
        Session session =
                Session.getInstance(conf.getProperties(),
                        new MailAuthenticator(conf.getUsername(), conf.getPassword()));
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(conf.getFromAddress()));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(conf.getToAddress(), false));
            if (!StringUtils.isEmpty(conf.getCcAddress())) {
                msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(conf.getCcAddress(), false));
            }
            msg.setSubject(conf.getSubject());
            msg.setText(conf.getContent());
            msg.setSentDate(new Date());
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
            t.connect(conf.getMAIL_SERVER_HOST(), conf.getUsername(), conf.getPassword());
            t.sendMessage(msg, msg.getAllRecipients());
            logger.info("msg.getAllRecipients()={}", msg.getAllRecipients());
            t.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String[] splitStr(String str, String delimiter) {
        String[] value = null;
        if (str != null && !"".equals(str) && delimiter != null
                && !"".equals(delimiter)) {
            value = str.split(delimiter);
        }
        return value;
    }
}
