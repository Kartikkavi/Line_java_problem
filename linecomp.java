import java.util.Scanner;
class linecomp
{
        public static void main(String arg[])

        {

                 int x1,x2,y1,y2,p1,p2,q1,q2;

                 double line1;
                 double line2;

                 Scanner sc=new Scanner(System.in);

                 System.out.println("enter x1 point");
                 x1=sc.nextInt();
                 System.out.println("enter y1 point");

                 y1=sc.nextInt();
                 System.out.println("enter x2 point");
                 x2=sc.nextInt();

                 System.out.println("enter y2 point");
                 y2=sc.nextInt();

                System.out.println("enter p1 point");
                p1=sc.nextInt();

                 System.out.println("enter q1 point");
                 q1=sc.nextInt();

                  System.out.println("enter p2 point");
                 p2=sc.nextInt();

                  System.out.println("enter q2 point");
                 q2=sc.nextInt();


                 line1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

                 System.out.println("length1"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+line1);

                  line2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));

                 System.out.println("length2"+"("+p1+","+q1+"),"+"("+p2+","+q2+")===>"+line2);


                if(line1 == line2){
                        System.out.println("Both lines are equal");
                }
		 if(line1 > line2)
                {
                        System.out.println("Line1 Is Greater Than Line2");}

                if(line1 < line2)
                {
                        System.out.println("Line1 Is Less Than Line2");}

        }

}
