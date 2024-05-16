package substring;

public class substring {
    public static void main(String[] args) {
        String[] strings = {"superman", "Spiderman", "man", "red", "super"};

       for(int i=0; i<strings.length;i++) {
    	   int count = 0;
    	   for(int j=0; j<strings.length;j++) {
    		   if (j != i && strings[j].contains(strings[i])) {
    			   count++;
    		   }
    	   }
    		   System.out.println(strings[i]+":"+count);
    }
}
}
