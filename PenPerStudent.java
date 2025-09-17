public class PenPerStudent{
	public static void main(String[] args)
	{
		int StudentNo=3,PenNo=14;
		int Left=PenNo%StudentNo;
		int StudPen=(PenNo-Left)/StudentNo;
       System.out.println("The Pen Per Student is "+StudPen+" and the remaining pen not distributed is "+Left);
	}
}