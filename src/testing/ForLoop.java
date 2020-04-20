package testing;

public class ForLoop {
	public static void main(String[] args) {
		
		
		// int r = right;
        // for(int i = left; i <= right; i++){
        //     if(arr[i] > root.val){
        //         r = i;
        //         break;
        //     }
        // }
        
//        int r;
//        for(r=left;r<=right;r++) {
//        if(arr[r] > root.val)
//            break;
//        }
		
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int left = 2;
		int right = 3;
		
		int res;
		for(res = left; res<= right; res++) {
			System.out.println("in");
			if(arr[res] > 7) {
				break;
			}
		}
		
		System.out.println("res:::::" + res);
		
		int r = left;
		for(int i = left; i <= right; i++) {
			r = i;
			if(arr[i] > 7) {
				break;
			}
		}
		System.out.println("r::::" + r);

	}

}
