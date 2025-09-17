public class TriangleArea{
	public static void main(String[] args){
	
	double areaoftrianglecm,areaoftrianglein;
	double base=10,height=15;
	double basein=base/2.54,heightin=height/2.54;

	areaoftrianglein=0.5*basein*heightin;
	areaoftrianglecm=0.5*base*height;
	
	System.out.println(" Your Area in cm "+areaoftrianglecm+" is while in inches is "+areaoftrianglein);
	}
}