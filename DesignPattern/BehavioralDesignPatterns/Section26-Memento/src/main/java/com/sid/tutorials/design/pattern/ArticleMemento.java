/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Lenovo
 *
 */
@Getter
@AllArgsConstructor
public class ArticleMemento {
	private final long id;
	private final String title;
	private final String content;
}
