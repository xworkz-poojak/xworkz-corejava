class LeapYear
{
public static void main(String ss[])
{
int number=leapYear(1998);
System.out.println(number + " notleapyear");
int number1=leapYear(2002);
System.out.println(number1 + "leapYear");
}
static int leapYear(int year)
{
if(year % 4==0)
{
return year;

}
else
{
return year;
}
}
}