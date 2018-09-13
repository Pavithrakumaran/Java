package pavi;
class Marathon {
static int winner(int[] a)
{
int min=a[0];
int index=0;
for(int i=0;i<a.length;i++)
{
if(min>a[i])
{
min=a[i];
index=i;
}
}
return index;
}
static int runner(int[] a)
{
int sec_min=a[0];
int index=0;
for(int i=0;i<a.length;i++)
{if(i==Marathon.winner(a))
	continue;
if(sec_min>a[i])
{
sec_min=a[i];
index=i;
}
}
return index;
}
public static void main (String[] arguments) {
String[] names = {"Kumar", "Murali", "Rajesh", "Julie", "Palani", "Mari", "Alex",
"Siva", "Pradheep", "Guhan", "David", "Ahamed", "Daniel", "Mani","Balu", "Ismail"};
int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
343, 317, 265};
for (int i = 0; i < names.length; i++) {
System.out.println(names[i] + ": " + times[i]);
}
int index=Marathon.winner(times);
System.out.print("The Winner Is ");
System.out.println(names[index]+": "+times[index]);
int index1=Marathon.runner(times);
System.out.print("The Runner Is ");
System.out.println(names[index1]+": "+times[index1]);
}
}

