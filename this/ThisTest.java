public class ThisTest
{
	public static void main(String[] args)
	{


		User u = new User("张三");
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
		System.out.println(name + "正在做什么----");//相当于this.name
   
	}

}


