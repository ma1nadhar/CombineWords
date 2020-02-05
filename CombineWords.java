import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombineWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String list1 = "";
		while (console.hasNext() == true ) {
			 String gettingText = console.nextLine();
			  if(gettingText.endsWith("stop")) {
				 //do nothing
				  list1 = list1+gettingText+" ";
				  break;
			  }else {
				  list1 = list1+gettingText+" ";
				 // System.out.println(list1);
			  }
		}
		
		//System.out.println(list1);
		List<String> listRemoveStop = new ArrayList<String>();
		String[] list1Parse = list1.split(" ");
		for(int m = 0; m<list1Parse.length-1; m++) {
			String word = list1Parse[m].trim();
			if(word.length() > 0) listRemoveStop.add(word);
		}
		
		//List<String> listRemoveStop = new ArrayList<String>(Arrays.asList(list1Parse));
		//listRemoveStop.remove(list1Parse.length-1);
		//System.out.println(listRemoveStop);
		
		List<String> outAList = new ArrayList<String>();
		int index = 0;
		String word = "";
		for(int i = 0; i<listRemoveStop.size(); i++) {
			
			if((index > 0)&&(index%2 != 0)) {
				word = "("+word +" "+ listRemoveStop.get(i)+")";
				outAList.add(word);
				word = "";
			}else {
				word = listRemoveStop.get(i);
			}
			index++;
		}
		if(word.trim().length()>0) outAList.add(word);
		
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value \"stop\", followed by a return.");
		System.out.println();
		System.out.println("Your original list: "+listRemoveStop);
		System.out.println();
		System.out.println("Your clumped list: "+outAList);
		
		
	}

}
