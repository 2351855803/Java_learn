public class ThisTest3
{
	public static void main(String[] args)
	{
		User u = new User();
       
	    u.nameSet("����");
		u.numSet(11111);

		System.out.println(u.nameGet());
		System.out.println(u.numGet());
	}
}



class User
{   //����
	private String name;
	//����
	private int num = 22;


    //ʵ��������set��get
	//����set get
	public void nameSet(String name)
	{
		this.name = name;
		//this.name = name;                  //!!!!!!!!!!!!!!!!
	}
	public String nameGet()
	{
		return this.name;
	}

	//����set get
	public void numSet(int num)
	{
		this.num = num;
		//this.num = num;                  //!!!!!!!!!!!!!!!!
	}
	public int numGet()
	{
		return this.num;
	}


}

//--------------------->      ��û�м�this�������ھͽ�ԭ��ʵ�������޷��õ���ֵ