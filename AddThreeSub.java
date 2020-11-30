class AddSub
{
public static void main(String ss[])
{
 add();
 add(1.1,1.1,1.1);
 add(22.22,22.22,22.22);
}
static void add()
{
int a=2;
int b=2;
int c=2;
int d=a+b+c;
System.out.println(d);
}

static void add( float subone,float subtwo,float subthree)
{
System.out.println(subone+subtwo+subthree);
}

static void add (double subjectone,double subjecttwo,double subjectthree,double subjectfour)
{
System.out.println(subjectone+subjecttwo+subjectthree+subjectfour);

}


}