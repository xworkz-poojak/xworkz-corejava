class Add
{
public static void main(String a[])
{
	int output=add();
	System.out.println(output);
	double ans=add(22,22); 
	System.out.println(ans);
	//method overloading is independent of return type
}
static int add()
{
int a=12;
int b=12;
int c=a+b;
int out=c;
return out;
}

static double add(double subjectOne,double subjectTwo)
{

double finalans=((subjectOne+subjectTwo));
return finalans;
}
}
