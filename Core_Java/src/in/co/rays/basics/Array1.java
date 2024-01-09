package in.co.rays.basics;

public class Array1 {
	
public static void main (String[] args){

	int[] a= {2,3,41,5,16,17,8};
    int min=0;
    int max =0;
    for (int i = 0; i < a.length; i++) {
		if (a[i]>max) {
			min=max;
		max=a[i];
		}
		if(a[i]>min && a[i]<max) {
			min=a[i];
		}
    }
		System.out.println(min);

}
}

              