interface Area
{
final float Pi=3.14f;
public float compute(float p,float q);
}
class Rectangle implements Area
{
public float compute(float p,float q)
{
return(p*q);
}
}
class Circle implements Area
{
public float compute(float p,float q)
{
return(Pi*p*p);
}
}
class Area1
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Circle c=new Circle();
Area a;
a=r;
System.out.println("Rectangle area="+a.compute(10,20));
a=c;
System.out.println("Circle area="+a.compute(10,0));
}
}