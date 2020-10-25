package com.wings.mywiki.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClassificationVO {
	private int classification_id;
	private int user_id;	// �ܷ�Ű
	private int wiki_id;	// �ܷ�Ű
	private String title,text,group_id;
}
