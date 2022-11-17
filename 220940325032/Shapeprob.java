class Shape{
    void draw(){
        System.out.println("Drawing a general shape");
    }

    void erase(){
        System.out.println("Erasing a general shape");
    }

}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    void erase(){
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a triangle");
    }

    @Override
    void erase(){
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }

    @Override
    void erase(){
        System.out.println("Erasing a square");
    }
}

public class Shapeprob {
    public static void main(String[] args) {
        Shape a=new Circle();
        a.draw();
        a.erase();

        Shape b=new Triangle();
        b.draw();
        b.erase();

        Shape c=new Square();
        c.draw();
        c.erase();
    }
}
