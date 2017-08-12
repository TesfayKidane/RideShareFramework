package rideshare.framework.authentication.test;

import javax.security.sasl.AuthenticationException;

import rideshare.framework.authentication.domain.Authentication;
import rideshare.framework.authentication.facade.AuthenticationManagerFacade;

/**
 * Created by chanpiseth
 */

public class AuthenticationManagerFacadeTest {

	public static void main(String[] args) {
		try {
			Authentication admin = AuthenticationManagerFacade.getInstance().login("admin", "admin");
			System.out.println(admin.getUsername());
			System.out.println(admin.getPassword());
			System.out.println(admin.getRoles());
			System.out.println("Successfully login!");
		} catch (AuthenticationException e) {
		}
		
		Authentication current = AuthenticationManagerFacade.getInstance().getCurrentAuthentication();
		System.out.println(current.getUsername());
		System.out.println(current.getPassword());
		System.out.println(current.getRoles());
		System.out.println("Successfully get current authentication!");
		
		AuthenticationManagerFacade.getInstance().logout();
		current = AuthenticationManagerFacade.getInstance().getCurrentAuthentication();
		if (current == null) {
			System.out.println("Successfully logout!");
		}
		
		try {
			Authentication admin = AuthenticationManagerFacade.getInstance().login("admin", "123");
			System.out.println(admin.getUsername());
			System.out.println(admin.getPassword());
			System.out.println(admin.getRoles());
			System.out.println("Successfully login!");
		} catch (AuthenticationException e) {
			System.out.println("Failure login!");
		}
	}
}
