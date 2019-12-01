package com.example.config;

import com.example.config.SelenideConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix = "cms")
@PropertySource("classpath:application-opensourcecms.properties")
public class OpensourcecmsConfig {
    
    private String url;
    private String username;
    private String userpass;
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
    
	
	/*
	 * //@Value(
	 * "${cms.url:https://s1.demo.opensourcecms.com/wordpress/wp-login.php}")
	 * 
	 * @Value("${cms.url}") private String url;
	 * 
	 * @Value("${cms.user.name}") private String userName;
	 * 
	 * @Value("${cms.pass.user}") private String password;
	 * 
	 * 
	 * public String getUrl() { return url; }
	 * 
	 * public String getUsername() { return userName; }
	 * 
	 * public String getPassword() { return password; }
	 */
}
