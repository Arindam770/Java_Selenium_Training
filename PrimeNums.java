package Assignment1;

public class PrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num=2;num<=1000;num++) {
			int temp = num / 2;
			int flag=0;
			for (int i = 2;i<temp;i++) {
				if (num%i==0) {
					//System.out.println(num);
					flag=1;
					break;
				}
			}
			if (flag == 0 && num != 4) {
				System.out.println(num);
			}
		}
	}

}
