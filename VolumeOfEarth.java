public class VolumeOfEarth{
	public static void main(String[] args)
	{
		double EarthRadiusK=6378,EarthRadiusM=EarthRadiusK/1.6;
		double EarthVolumeK=((4/3)*(EarthRadiusK*EarthRadiusK*EarthRadiusK)*3.14);
		double EarthVolumeM=((4/3)*(EarthRadiusM*EarthRadiusM*EarthRadiusM)*3.14);
       System.out.println("The volume of earth in cubic kilometers is "+EarthVolumeK+"and cubic miles is "+EarthVolumeM);
	}
}