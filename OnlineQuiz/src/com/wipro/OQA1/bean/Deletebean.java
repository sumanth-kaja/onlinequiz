package com.wipro.OQA1.bean;

public class Deletebean 
{
public Deletebean() {
		super();
		
	}

public Deletebean(String question) {
		super();
		this.question = question;
	}

private String question;

public String getQuestion() 
{
	return question;
}

public void setQuestion(String question)
{
	this.question = question;
}

}
