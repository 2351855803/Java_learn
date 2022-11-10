public class Test
{
	public static void main(String[] args)
	{
		Data a = new Data();
		/*
		System.out.println(a);
        System.out.println(a.toString());
		
		Data@54bedef2                     -----------------未对toString()进行方法覆盖
        Data@54bedef2
		*/

        Data a1 = new Data("1990","1","1");
		System.out.println(a1);
        System.out.println(a1.toString());


		/*
		1990年1月1日
        1990年1月1日
		*/

	}
}


class Data
{
	private String year;
	private String month;
	private String day;

	//构造方法

	public Data()
	{

	}
	public Data(String year, String month, String day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}


    //set get
	public void yearSet(String year)
	{
		this.year = year;
	}
	public String yearGet()
	{
		return this.year;
	}
//-----------------------------------------
	public void monthSet(String month)
	{
		this.month = month;
	}
	public String monthGet()
	{
		return this.month;
	}
//-----------------------------------------
	public void daySet(String day)
	{
		this.day = day;
	}
	public String dayGet()
	{
		return this.day;
	}


    public String toString()
	{
		return this.year + "年" + this.month + "月" + this.day + "日";
	}




}