/**
 * 
 */
package org.julia.bdgolka;

import org.julia.bdgolka.dao.JdbcDaoImpl;
import org.julia.bdgolka.model.Circle;

/**
 * @author Pulova
 *
 */
public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Circle circle = new JdbcDaoImpl().getCircle(1);
		System.out.println(circle.getName());
	}

}
