package com.meta;

public class Instagram extends Meta{
 public int follower;
Instagram(String login, int follower){
	super( login);
	this.follower=follower;
}
public void Insta() {
	System.out.println("..........INSTAGRAM........");
	System.out.println(follower +". my follower");
}
}
