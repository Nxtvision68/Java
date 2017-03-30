package ranga;

public class Normal {
	int a=40,b=20,c,d,e,f;
	public Normal(){
			c=a+b;
			System.out.println("sum is:"+c);
			d=a-b;
			System.out.println("diff is:"+d);
			e=a*b;
			System.out.println("product is:"+e);
			f=a/b;
			System.out.println("div is:"+f);
			float g=40.3f,h=20.3f,i,j,k,l;
			i=g+h;
			System.out.println("sum is:"+i);
			j=g-h;
			System.out.println("diff is:"+j);
			k=g*h;
			System.out.println("product is:"+k);
			l=g/h;
			System.out.println("div is:"+l);
	}
	public static void main(String[] args){
		Normal obj = new Normal();
	}

}
