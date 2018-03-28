package maopao;

public class test {

	public static void main(String[] args) {
		int num3=0;		
		int[] nums={2,4,5,10,9,17,88,77};
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					num3=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=num3;
				}
			}
			
		}
		for(int num:nums)
		System.out.println(num);


		
	}



}
