package maopao;

public class test {

	public static void main(String[] args) {
		//求质数
		for(int num=2;num<=100;num++){
					boolean flag=false;
					for(int i=1;i<num;i++){
						if(i == 1 || i == num){
							
						}else{
							if(num%i == 0){
								flag=true;
								break;
							}
						}
						
					}
					if(flag){
						System.out.println(num+"不是质数");
					}else{
						System.out.println(num+"是质数");
					}
					
				}

		
	}



}
