import java.util.*;
class StraightMinMax { 
 static int count=0;
  public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter number of elements");
    int array[] = new int[sc.nextInt()];
	for(int i=0;i<array.length;i++)
	{
		array[i]=i+1;
		System.out.print("\t"+array[i]);
	}
	double t1=System.nanoTime();
    int max =  array[array.length-1],min=array[0];
	count=count+1;
	for(int i=1;i < array.length;i++,count=count+1){ 
	count=count+1;
      if(array[i] > max){ 
	  count=count+1;
         max = array[i]; 
      } 
	   if(array[i] < min){ 
	   count=count+1;
        min = array[i]; 
      } 
    } 
    double t2=System.nanoTime();
	System.out.println("TIME TAKEN "+(t2-t1));
    System.out.println("COUNT FOUND "+count );
    System.out.println("Maximum Value is: "+max); 
    System.out.println("Minimum Value is: "+min);
  }
 
 
}
/*
OUTPUT
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac StraightMinMax.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
10
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
TIME TAKEN 4266.0
COUNT FOUND 28
Maximum Value is: 10
Minimum Value is: 1

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
20
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
TIME TAKEN 7253.0
COUNT FOUND 58
Maximum Value is: 20
Minimum Value is: 1

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
40
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
TIME TAKEN 7253.0
COUNT FOUND 118
Maximum Value is: 40
Minimum Value is: 1

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
60
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
TIME TAKEN 11520.0
COUNT FOUND 178
Maximum Value is: 60
Minimum Value is: 1

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
80
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
        61
        62
        63
        64
        65
        66
        67
        68
        69
        70
        71
        72
        73
        74
        75
        76
        77
        78
        79
        80
TIME TAKEN 14934.0
COUNT FOUND 238
Maximum Value is: 80
Minimum Value is: 1

C:\Users\PRIYAM SHAH\Desktop\AOAD>java StraightMinMax
Enter number of elements
100
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
        61
        62
        63
        64
        65
        66
        67
        68
        69
        70
        71
        72
        73
        74
        75
        76
        77
        78
        79
        80
        81
        82
        83
        84
        85
        86
        87
        88
        89
        90
        91
        92
        93
        94
        95
        96
        97
        98
        99
        100
TIME TAKEN 14373.0
COUNT FOUND 298
Maximum Value is: 100
Minimum Value is: 1
*/