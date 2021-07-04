/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public interface IDispanseChain {
	void setNextChain(IDispanseChain chain);

	void dispanse(Currency currency);
}
