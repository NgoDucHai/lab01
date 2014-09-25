package ptb2;

public class	ptb2 {

	private float a;
	private float b;
	private float c;
	public ptb2(){}
	public ptb2(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float Delta(){
	      return this.b*this.b - 4*this.a*this.c;
	      
	  }
	public String BienLuan(double d,double e,double f){
		String s="";
	    if(Delta()<0) s="Phuong trinh vo nghiem";
	    else{
	        if(Delta()==0)
	        	{
	        		double x = -e/2*d;
	        		s="Phương trinh co nghiem duy nhat "+x;
	        	}
	        else{
	          double x1 = (-e-Math.sqrt(Delta()))/2*d;
	          double x2 = (-e+Math.sqrt(Delta()))/2*d;
	          s="Phuong trinh co 2 nghiem: "+x1+" va "+x2;
	          }
	      }
	    return s;
	  }
}

