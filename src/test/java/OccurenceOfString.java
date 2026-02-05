import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {

		int array[] = {11, 22, 34, 66};

		int higestnumber=array[0];
		int secondhigest=array[0];

		for(int i=0;i<array.length;i++){

			if(array[i]>higestnumber){
				secondhigest=higestnumber;
				higestnumber=array[i];
			}

			else if(array[i]>secondhigest){

				secondhigest=higestnumber;
			}

			System.out.println(higestnumber);
			System.out.println(secondhigest);;
		}


	}

}
