package com.nit.sundayTopics;

//Writing constructor with message

 enum MySeason   
	{
	   SPRING("Pleasant"), SUMMER("UnPleasent"), RAINY("Rain"), WINTER;

      String msg;
	    
      private MySeason(String msg)
      {         	
      	this.msg = msg;
      }
	    

		private MySeason()
		{
			this.msg = "Cold";
		}

		public String getMessage()
		{
			return msg;
		}
	}
class EnumDemo7
{	
	public static void main(String[] args) 
	{
		MySeason seasons[] = MySeason.values();

		for(MySeason season : seasons)
		{
			System.out.println(season+"  is :"+season.getMessage());
			System.out.println(season+"  order is :"+season.ordinal());
			System.out.println("Season name is :"+season.name());
		}
	}
}