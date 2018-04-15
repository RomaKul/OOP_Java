public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double q, x1, x2;
        q=(b*b)-4*a*c;
        if(a==0 && c==0 && b!=0){
            System.out.println("x1=" + 0.0 + "\nx2="+0.0);
        }
        else if(q>0 && a!=0 && b!=0){
            x1=(-(b) + Math.sqrt(q))/(2*a);
            x2=(-(b) - Math.sqrt(q))/(2*a);
            System.out.println("x1="+x1+"\nx2=" +x2);
        }
        else if(q==0 && a!=0 && b!=0){
            x1=(-b)/(2*a);
            System.out.println("x1="+x1+"\nx2="+x1);
        }
        else if(a==0 && b!=0 && c!=0){
            System.out.println("x1=" + (-c)/b + "\nx2=" + (-c)/b);
        }
        else {
            System.out.println("x1=\nx2=");
        }
        
    }
} 