import java.util.Scanner;
// import.java.util.*;

// Java Assignment to toggle all characters

class Assignment26_3  //(incomplete Scanner)
{
static void toggleChars(char str[]) 
{
	for (int i=0; i<str.length; i++)
	{
		if (str[i]>='A' && str[i]<='Z')
			str[i] = (char) (str[i] + 'a' - 'A');
		else if (str[i]>='a' && str[i]<='z')
			str[i] = (char) (str[i] + 'A' - 'a');
	}
}

// Driver code
public static void main(String[] args)
{
	char str[] = "GeKf@rGeek$".toCharArray();
	toggleChars(str);
	System.out.println("String after toggle ");
	System.out.println(String.valueOf(str));
}
}

// This code is contributed by 29AjayKumar
