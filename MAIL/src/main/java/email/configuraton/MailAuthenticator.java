package email.configuraton;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: eugene<br/>
 * Date: 2018/12/27<br/>
 * Time: 17:42<br/>
 * To change this template use File | Settings | File Templates.
 */

public class MailAuthenticator extends Authenticator {

    private String userName;
    private String password;

    public MailAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }
}
