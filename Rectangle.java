public class Rectangle{
    private double length,width;
    public Rectangle (double length,width){
        this.length=length;
        this.width=width;
    }
    public double getlength(){
        return this.length;
    }
    public double getwidth(){
        return this.width;
    }
    public void setlength(double length){
        this.length=length;
    }
     public void setwidth(double width){
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}