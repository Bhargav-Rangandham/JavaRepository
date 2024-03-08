package Arrays;

public class MirrorImage {

	public static void main(String[] args) {

		int a[] = {2,4,15,15,4,2};
		int size = a.length;
		//System.out.println(size);

		boolean image=false;
		for(int i=0; i<size/2; i++) {

			if(a[i]==a[size-i-1]) {
				image=true;
			}
			size--;
		}

		if(image) {
			System.out.println("Mirror image");
		}
		else {
			System.out.println("Not a Mirror Image");
		}
	}
}
