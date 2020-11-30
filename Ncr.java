class Ncr
{
public static void main(String ss[])
{
int f=myFact(3);
int g=myFact(2);
int r=myFact(1);
 int finalOutput = f/(g*r);
 System.out.println(finalOutput);

double total=FindAvg.avg(11.11,22.22,33.33);
System.out.println(total);


}




static int myFact(int nm)
{
int fact =1;
for (int i=1; i<=nm;i++)
{
fact =fact*i;

//return fact;
}
//System.out.println(fact);
return fact;
}

}