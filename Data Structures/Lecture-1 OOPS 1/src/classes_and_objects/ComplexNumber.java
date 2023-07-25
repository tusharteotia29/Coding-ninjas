package classes_and_objects;

public class ComplexNumber {

    private int realnumber;
    private int imaginarynumber;

    public ComplexNumber(int realnumber, int imaginarynumber){
        this.realnumber=realnumber;
        this.imaginarynumber=imaginarynumber;
    }

    public int getReal(){
        return realnumber;
    }

    public int getimaginary(){
        return imaginarynumber;
    }

    public void setReal(int n){
        this.realnumber=n;

    }

    public void setImaginary(int n){
        this.imaginarynumber=n;
    }

    public void print(){
        if(imaginarynumber>0){
            System.out.println(realnumber+"+"+imaginarynumber+"i");
        }else{
            System.out.print(realnumber);
            System.out.println(imaginarynumber+"i");

        }
    }

    public void add(ComplexNumber c){
        this.realnumber=this.realnumber+c.realnumber;
        this.imaginarynumber=this.imaginarynumber+c.imaginarynumber;
    }
    
     public void multiply(ComplexNumber c){
        int real=(this.realnumber*c.realnumber)-(this.imaginarynumber*c.imaginarynumber);
        int imag=(this.realnumber*c.imaginarynumber)+(this.imaginarynumber*c.realnumber);
        this.realnumber=real;
        this.imaginarynumber=imag;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newreal=c1.realnumber+c2.realnumber;
        int newimaginary=c1.imaginarynumber+c2.imaginarynumber;
        ComplexNumber c=new ComplexNumber(newreal, newimaginary);
        return c;

    }

    public  ComplexNumber conjugate(){
        int img=-this.imaginarynumber;
		return new ComplexNumber(this.realnumber, img);
    }
}
