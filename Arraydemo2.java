package mrng;

public class Arraydemo2 {
	classroom myclassroom[] =new classroom[5];
 public  arraydemo2()
	{
		for(int i=0;i<myclassroom.length;i++)
		{
			myclassroom[i]=new classroom("this is new class");
		}
	}

	 class classroom
		{
			String subject; 
			 public classroom(String subject)
			{
				this.subject=subject;
			}
			 public String toString()
			 {
				 return subject;
			 }
		}
	}


