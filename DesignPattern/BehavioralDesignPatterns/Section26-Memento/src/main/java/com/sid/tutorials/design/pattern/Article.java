/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Lenovo
 *
 */
@Data
@AllArgsConstructor
public class Article {
	private long id;
	private String title;
	private String content;

	public Article(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public ArticleMemento createMemento() {
		ArticleMemento m = new ArticleMemento(id, title, content);
		return m;
	}

	public void restore(ArticleMemento m) {
		this.id = m.getId();
		this.title = m.getTitle();
		this.content = m.getContent();
	}
}
