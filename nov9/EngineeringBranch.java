enum EngineeringBranch{
COMPUTERSCIENCE,MECHANICAL,ELECTRICAL,ELECTRONICS,CIVIL
}

public class SportTester{

public static void main(String[] names)
{
	EngineeringBranch[] allBranches=EngineeringBranch.values();
	System.out.println(allBranches.length);
	//length will be +1 of index
	for(int initial=0;initial<allBranches.length;initial++){
		System.out.println("index " + initial);
		Sport branchValue=allBranches[initial];
		System.out.println("branch enum Value " + branchValue);
		
	}
}

}