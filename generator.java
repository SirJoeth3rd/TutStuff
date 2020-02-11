import java.io.*; 
  
public class generator {
 
    public static void main(String arr[]) throws FileNotFoundException { 
        PrintStream ints = new PrintStream(new File("ints.txt"));
	PrintStream strings = new PrintStream(new File("strings.txt"));
        PrintStream doubles = new PrintStream(new File("doubles.txt"));
	
        PrintStream console = System.out; 
  
        System.setOut(ints); 
 //       System.out.println("This will be written to the text file"); 
  	
	int num = 0;
	for(int i = 0;i < 200000;i++){
		String SI = "";
		String SD = "";
		String SS = "";
		int count = 0;
		int maxcount = (int)(Math.random()*8) + 5;
		while(count < maxcount){		
			SI += (char)((int)(Math.random()*10) + 48);
			SD += (char)((int)(Math.random()*10) + 48);
			SS += (char)((int)(Math.random()*26) + 97);
			if(Math.random() < 0.0004)break;	
			count++;
			
		}
		if(SI.charAt(0) == '0'){
			String s = SI.substring(1);
			SI = (char)((int)(Math.random() * 9) + 49) + s;
		}
		if(SD.charAt(0) == '0'){
			String s = SD.substring(1);
			SD = (char)((int)(Math.random() * 9) + 49) + s;
		}
		SD = SD + Double.toString(Math.random()).substring(1,(int)(Math.random()*3) + 5);
		System.setOut(ints);
		System.out.println(SI);
		System.setOut(doubles);
		System.out.println(SD);
		System.setOut(strings);
		System.out.println(SS);
	} 
    } 
}
