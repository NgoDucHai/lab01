package tamgiac;

public class tamgiac {
	private int a;
	private int b;
	private int c;
	public tamgiac(int a, int b,int c)throws Exception{
		if(a<=0||b<=0||c<=0)
			throw new Exception("Cac canh tam giac phai lon hon 0");
		this.a= a;
		this.b= b;
		this.c= c;
	}
	public int Test(){
		boolean test = false;
		if(a<b+c && b<a+c && c<b+a){
			test = true;
		}
		if(test){
			if(a==b && b==c)
				return 2;
			else
				if(a!=b && a!=c && c!=b)
					return 0;
				else
					return 1;
		}
		return -1;
	}

}
