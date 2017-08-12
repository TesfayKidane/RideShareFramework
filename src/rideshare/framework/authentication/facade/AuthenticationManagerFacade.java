package rideshare.framework.authentication.facade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import rideshare.framework.authentication.domain.Authentication;
/**
 * Created by chanpiseth
 */

public class AuthenticationManagerFacade {
	private static final AuthenticationManagerFacade INSTANCE = new AuthenticationManagerFacade();

	private Map<String, Authentication> auths = new HashMap<String, Authentication>();
	private ThreadLocal<Authentication> context = new ThreadLocal<Authentication>();
	
	private AuthenticationManagerFacade() {
		Authentication admin = new Authentication();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setRoles(Arrays.asList(Authentication.ROLE_ADMIN));
		
		auths.put("admin", admin);
	}
	
	public static AuthenticationManagerFacade getInstance() {
		return INSTANCE;
	}
	
	public Authentication getAuth(String username) {
		return auths.get(username);
	}
	
	public Authentication login(String username, String password) throws AuthenticationException {
		Authentication auth = getAuth(username);
		if (auth == null || !auth.getPassword().equals(password)) {
			throw new AuthenticationException("Username or password does not correct.");
		}
		context.set(auth);
		return auth;
	}
	
	public Authentication getCurrentAuthentication() {
		return context.get();
	}
	
	public void logout() {
		context.remove();
	}
}
