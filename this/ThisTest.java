public class ThisTest
{
	public static void main(String[] args)
	{


		User u = new User("����");
		System.out.println(u.name);
		u.doWhat();






	}
}




class User
{
    String name;

	public User(String mingZi)
	{
		name = mingZi;
	}


	public User()
	{
	}


	public void doWhat()
	{
		System.out.println(name + "������ʲô----");//�൱��this.name
   
	}

}

