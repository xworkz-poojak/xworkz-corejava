class FindFactorial
{
public static void main(String ss[])
{
myFact(89);

}

static void myFact(double nm)
{
double fact =1;
for (int i=1; i<=nm;i++)
{
fact =fact*i;
//System.out.println(fact);
//return fact;
}
System.out.println(fact);
}
}