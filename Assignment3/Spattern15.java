class Spattern15{
    public static void main(String[] args){
		
	    for(int i=1;i<=5;i++){
		    for(int j=i;j>=1;j--){
				
				if(i<5){
				if(j==i || j==1){
					System.out.print("*");
				}else System.out.print(" ");	
				}else System.out.print("*");
				
			}
		System.out.println();	
		}
	}
}
