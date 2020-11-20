package email.configuraton;

import java.util.Properties;
import java.util.Vector;


/**
 * Created by IntelliJ IDEA.<br/>
 * User: eugene<br/>
 * Date: 2018/12/27<br/>
 * Time: 17:39<br/>
 * To change this template use File | Settings | File Templates.
 */
public class MailClientConfiguration {
    private String MAIL_SERVER_HOST = "";
    private String MAIL_SERVER_HOST_IP = "";
    private String MAIL_SERVER_PORT = "";
    private String username;
    private String password;
    private String fromAddress;
    private String toAddress;
    private String ccAddress;
    private String subject;
    private String content;
    private boolean validate = true;
    private boolean validateSSL = false;
    private Vector<String> attachFileNames;
    private Properties properties;

    public MailClientConfiguration() {
    }

    public String getMAIL_SERVER_HOST() {
        return this.MAIL_SERVER_HOST;
    }

    public String getMAIL_SERVER_HOST_IP() {
        return this.MAIL_SERVER_HOST_IP;
    }

    public String getMAIL_SERVER_PORT() {
        return this.MAIL_SERVER_PORT;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFromAddress() {
        return this.fromAddress;
    }

    public String getToAddress() {
        return this.toAddress;
    }

    public String getCcAddress() {
        return this.ccAddress;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getContent() {
        return this.content;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public boolean isValidateSSL() {
        return this.validateSSL;
    }

    public Vector<String> getAttachFileNames() {
        return this.attachFileNames;
    }

    public Properties getProperties() {
        return this.properties;
    }

    public void setMAIL_SERVER_HOST(String MAIL_SERVER_HOST) {
        this.MAIL_SERVER_HOST = MAIL_SERVER_HOST;
    }

    public void setMAIL_SERVER_HOST_IP(String MAIL_SERVER_HOST_IP) {
        this.MAIL_SERVER_HOST_IP = MAIL_SERVER_HOST_IP;
    }

    public void setMAIL_SERVER_PORT(String MAIL_SERVER_PORT) {
        this.MAIL_SERVER_PORT = MAIL_SERVER_PORT;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public void setValidateSSL(boolean validateSSL) {
        this.validateSSL = validateSSL;
    }

    public void setAttachFileNames(Vector<String> attachFileNames) {
        this.attachFileNames = attachFileNames;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MailClientConfiguration)) return false;
        final MailClientConfiguration other = (MailClientConfiguration) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$MAIL_SERVER_HOST = this.getMAIL_SERVER_HOST();
        final Object other$MAIL_SERVER_HOST = other.getMAIL_SERVER_HOST();
        if (this$MAIL_SERVER_HOST == null ? other$MAIL_SERVER_HOST != null : !this$MAIL_SERVER_HOST.equals(other$MAIL_SERVER_HOST))
            return false;
        final Object this$MAIL_SERVER_HOST_IP = this.getMAIL_SERVER_HOST_IP();
        final Object other$MAIL_SERVER_HOST_IP = other.getMAIL_SERVER_HOST_IP();
        if (this$MAIL_SERVER_HOST_IP == null ? other$MAIL_SERVER_HOST_IP != null : !this$MAIL_SERVER_HOST_IP.equals(other$MAIL_SERVER_HOST_IP))
            return false;
        final Object this$MAIL_SERVER_PORT = this.getMAIL_SERVER_PORT();
        final Object other$MAIL_SERVER_PORT = other.getMAIL_SERVER_PORT();
        if (this$MAIL_SERVER_PORT == null ? other$MAIL_SERVER_PORT != null : !this$MAIL_SERVER_PORT.equals(other$MAIL_SERVER_PORT))
            return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$fromAddress = this.getFromAddress();
        final Object other$fromAddress = other.getFromAddress();
        if (this$fromAddress == null ? other$fromAddress != null : !this$fromAddress.equals(other$fromAddress))
            return false;
        final Object this$toAddress = this.getToAddress();
        final Object other$toAddress = other.getToAddress();
        if (this$toAddress == null ? other$toAddress != null : !this$toAddress.equals(other$toAddress)) return false;
        final Object this$ccAddress = this.getCcAddress();
        final Object other$ccAddress = other.getCcAddress();
        if (this$ccAddress == null ? other$ccAddress != null : !this$ccAddress.equals(other$ccAddress)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        if (this.isValidate() != other.isValidate()) return false;
        if (this.isValidateSSL() != other.isValidateSSL()) return false;
        final Object this$attachFileNames = this.getAttachFileNames();
        final Object other$attachFileNames = other.getAttachFileNames();
        if (this$attachFileNames == null ? other$attachFileNames != null : !this$attachFileNames.equals(other$attachFileNames))
            return false;
        final Object this$properties = this.getProperties();
        final Object other$properties = other.getProperties();
        if (this$properties == null ? other$properties != null : !this$properties.equals(other$properties))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MailClientConfiguration;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $MAIL_SERVER_HOST = this.getMAIL_SERVER_HOST();
        result = result * PRIME + ($MAIL_SERVER_HOST == null ? 43 : $MAIL_SERVER_HOST.hashCode());
        final Object $MAIL_SERVER_HOST_IP = this.getMAIL_SERVER_HOST_IP();
        result = result * PRIME + ($MAIL_SERVER_HOST_IP == null ? 43 : $MAIL_SERVER_HOST_IP.hashCode());
        final Object $MAIL_SERVER_PORT = this.getMAIL_SERVER_PORT();
        result = result * PRIME + ($MAIL_SERVER_PORT == null ? 43 : $MAIL_SERVER_PORT.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $fromAddress = this.getFromAddress();
        result = result * PRIME + ($fromAddress == null ? 43 : $fromAddress.hashCode());
        final Object $toAddress = this.getToAddress();
        result = result * PRIME + ($toAddress == null ? 43 : $toAddress.hashCode());
        final Object $ccAddress = this.getCcAddress();
        result = result * PRIME + ($ccAddress == null ? 43 : $ccAddress.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        result = result * PRIME + (this.isValidate() ? 79 : 97);
        result = result * PRIME + (this.isValidateSSL() ? 79 : 97);
        final Object $attachFileNames = this.getAttachFileNames();
        result = result * PRIME + ($attachFileNames == null ? 43 : $attachFileNames.hashCode());
        final Object $properties = this.getProperties();
        result = result * PRIME + ($properties == null ? 43 : $properties.hashCode());
        return result;
    }

    public String toString() {
        return "MailClientConfiguration(MAIL_SERVER_HOST=" + this.getMAIL_SERVER_HOST() + ", MAIL_SERVER_HOST_IP=" + this.getMAIL_SERVER_HOST_IP() + ", MAIL_SERVER_PORT=" + this.getMAIL_SERVER_PORT() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", fromAddress=" + this.getFromAddress() + ", toAddress=" + this.getToAddress() + ", ccAddress=" + this.getCcAddress() + ", subject=" + this.getSubject() + ", content=" + this.getContent() + ", validate=" + this.isValidate() + ", validateSSL=" + this.isValidateSSL() + ", attachFileNames=" + this.getAttachFileNames() + ", properties=" + this.getProperties() + ")";
    }
}
