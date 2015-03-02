/**
 * Disclaimer: this code is only for demo no production use
 */
package gr.javapapo;

import javax.ejb.Stateless;

/**
 * Created by papo on 2/15/15.
 */
@Stateless
public class UserServices {

	public String sayHello(){
		return "hello";
	}

}
