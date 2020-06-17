package com.niit.di_config;

public class VideoStreamP 
{
	String platform;

	String watchcategory;
	

	public void msg() 
	{
		System.out.println("Lets watch documentary form  "  +  platform  + " on " +  watchcategory);	
				
	}

	public String getPlatform() 
	{
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getWatchcategory() {
		return watchcategory;
	}

	public void setWatchcategory(String watchcategory) {
		this.watchcategory = watchcategory;
	}
	
	

}
