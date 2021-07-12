/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
public class TopicList implements CustomList<Topic> {
	private Topic[] topics;

	@Override
	public CustomIterator<Topic> iterator() {
		return new TopicIterator(topics);
	}

}
