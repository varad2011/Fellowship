package com.bridgelabz.programs.tempCreateClass;



public class SortestDistanceFindInArrayGride {

	public static void checkLocation(int source1,int source2 ,int destinationPoint1 ,int destinationPoint2 ,int flag,  int count ) {
		
		int axisX;
		int axisY;
		if(( source1 > destinationPoint1) && ( source2 > destinationPoint2 )) {
			 axisX = -1;
			 axisY = -1;
			 SortestDistanceFindInArrayGride.lineByLineCheck(source1, source2, destinationPoint1, destinationPoint2, flag, count,axisX , axisY);
		//	 SortestDistanceFindInArrayGride.recursion(source1 , source2 , destinationPoint1 , destinationPoint2 , flag , count , axisX , axisY );
		}
		if(( source1 > destinationPoint1 ) && ( source2 < destinationPoint2 )) {
			 axisX = -1;
			 axisY = 1;
			SortestDistanceFindInArrayGride.lineByLineCheck(source1, source2, destinationPoint1, destinationPoint2, flag, count,axisX , axisY);
		//	SortestDistanceFindInArrayGride.recursion(source1 , source2 , destinationPoint1 , destinationPoint2 , flag , count , axisX , axisY );
			
		}
		if(( source1 < destinationPoint1 ) && ( source2 > destinationPoint2 )) {
			axisX = 1;
			axisY = -1;
			SortestDistanceFindInArrayGride.lineByLineCheck(source1, source2, destinationPoint1, destinationPoint2, flag, count,axisX , axisY);
		//	SortestDistanceFindInArrayGride.recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count, axisX, axisY );
			
		}
		if(( source1 < destinationPoint1 ) && ( source2 < destinationPoint2 )) { 
			axisX = 1;
			axisY = 1;
		
			SortestDistanceFindInArrayGride.lineByLineCheck(source1, source2, destinationPoint1, destinationPoint2, flag, count, axisX, axisY);
		//	SortestDistanceFindInArrayGride.recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count, axisX, axisY );
		}
	}
	
	
	public static void recursion(int source1, int source2, int destinationPoint1, int destinationPoint2, int flag, int count, int axis1, int axis2) 
	{
		System.out.println((source1)+" "+source2);
		if (( source1 == destinationPoint1 ) && ( source2 == destinationPoint2 )) {
			System.out.println("count = " +count );
		} else { 
			if (( source1 != destinationPoint1 ) && ( source2 != destinationPoint2 ) ) {
			if ( flag == 0 ) {
					flag = 1;
					source2 = source2 + axis2;
					count++;
					recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count ,axis1,axis2);
				} else {
				flag = 0;
				source1 = source1 + axis1;
				count++;	
				recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count ,axis1,axis2);
				}
			} else if((source1 == destinationPoint1) && (source2 != destinationPoint2)) {
				source2 = source2 + axis2;
				count++;
				recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count ,axis1,axis2);
			} else if((source1 != destinationPoint1) && (source2 == destinationPoint1)) {
				source1 = source1 + axis1;
				count++;
				recursion(source1, source2, destinationPoint1, destinationPoint2, flag, count ,axis1,axis2);
			}
		}
	}

		
	public static void recursioncallMethod (int source1, int source2, int destination1, int destination2, int flag, int count) 
	{
		System.out.println( source1  + " " +source2 );
		if(( source1 == destination1 ) && ( source2 == destination2 )) {
			System.out.println("count = "+count);
		} else { 
			if(( source1 != destination1 ) && ( source2 != destination2 )) { 
				if(flag == 0) {
					flag = 1;
					source1++;
					count++;
					recursioncallMethod(source1, source2, destination1, destination2, flag, count);
				} else {
				flag = 0;
				source2++;
				count++;	
				recursioncallMethod(source1, source2, destination1, destination2, flag, count);
				}
			} else if((source1 == destination1) && (source2 != destination2)) {
				source2++ ;
				count++;
				recursioncallMethod(source1, source2, destination1, destination2, flag, count);
			} else if((source1 != destination1) && (source2 == destination2 )) {
					source1++;
					count++;
				recursioncallMethod(source1, source2, destination1, destination2, flag, count);
				}
		}
	
	}
	public static void lineByLineCheck(int source1 , int source2 , int destination1 , int destination2 , int flag ,int count , int axisX ,int axisY) 
	{
		System.out.println( source1 + " " + source2 );
		if(( source1 != destination1 ) && ( source2 == destination2)) {
			source1 = source1 + axisX ;
			count++;
			lineByLineCheck(source1, source2, destination1, destination2, flag, count,axisX ,axisY);
		} else {
			if(( source1 == destination1 ) && ( source2 != destination2) ) {
				count++;
				source2 = source2 + axisY;
				lineByLineCheck( source1, source2, destination1, destination2, flag, count,axisX ,axisY );
			} else {
				if(( source1 != destination1 ) && ( source2 != destination2)) {
					if(flag == 0) {
						flag = 1;
						source1 = source1 + axisX;
						count++;
						lineByLineCheck( source1, source2, destination1, destination2, flag, count, axisX, axisY);
					} else {
					flag = 0;
					source2 = source2 + axisY;
					count++;	
					lineByLineCheck(source1, source2, destination1, destination2, flag, count, axisX, axisY);
					}
				}else {
				System.out.println( "count" + count );	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		SortestDistanceFindInArrayGride.checkLocation(4, 8, 1, 2, 0, 0);
		//SortestDistanceFindInArrayGride.recursioncallMethod(4,1,1,8,1,0); 
	//	SortestDistanceFindInArrayGride.lineByLineCheck(1, 2, 4, 8, 1 ,0);
	}

}
