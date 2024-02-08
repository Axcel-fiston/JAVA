public class Wall {
    private double Width;
    private double Height;


    public Wall(){

    }

    public Wall(double Width, double Height) {
        if (Width < 0){
           this.Width=0;
        } else if (Height<0) {
            this.Width=0;
        }
        this.Width = Width;
        this.Height = Height;
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }


    public void setWidth(double Width) {
        if (Width<0 ){
            Width=0;
        }
        this.Width = Width;
    }

    public void setHeight(double Height) {
        if (Height<0 ){
           Height=0;
        }
        this.Height = Height;
    }

    public double getArea(){
        return Width*Height;
    }
}
