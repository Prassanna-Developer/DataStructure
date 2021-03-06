import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
00-44  48 5555 8361 should convert to 004-448-555-583-61

0 - 22 1985--324 should convert to 022-198-53-24

555372654 should convert to 555-372-654
*/
public class RegexSolution {

	public static void main(String[] args) {
		String s = "";
		formatString(s);
	}

	private static void formatString(String s) {

		StringBuilder sb = new StringBuilder();

		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("0 - 22 1985--324");
		while (m.find()) {
			sb.append(m.group());
		}
		
		System.out.println(sb.toString());
		
		String digits = sb.toString();
		StringBuilder newSb = new StringBuilder();
		for(int i=0;i<digits.length();i++){
			if((i==0 || i%3!=0 )  && !(digits.length()%3!=0 && digits.substring(i).length() == 2 )){
				newSb.append(digits.charAt(i));
			}
			else{
				if(!(digits.substring(i).length() == 1 )){
					newSb.append("-");
				}
				newSb.append(digits.charAt(i));
			}
			 
		}
		System.out.println(newSb.toString());
	}
}
