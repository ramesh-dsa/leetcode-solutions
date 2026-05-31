//todo       Example tesst from claude 
        import java.util.Scanner;

        class Shape
        {
            void area()
            {
                System.out.println("Calculting area ");
            }
        }
        class Circle extends Shape 
        {
            float r ; 
            Circle(float radius)
            {
                r = radius ;
            }
            void area()
            {
                System.out.println("Circle area is "+3.14*r*r);
            }
        }
        class  Rectangle extends Shape
        {
            int l , w ;
            public Rectangle(int length , int breath) 
            {
            l = length ;
            w = breath ;
            }
            void area()
            {
                System.out.println("Rectangle area is "+l*w);
            }   
        }

        public class demo
        {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter radius : ");
                float r = sc.nextFloat();

                // Circle s1 = new Circle(r);  both does same thana 
                Shape s1 = new Circle(r);
                // here call pannum boothu derived class la erukurathu override aagum 
                s1.area();


                System.out.print("Enter length and width : ");
                int l = sc.nextInt();
                int w = sc.nextInt();

                // Rectangle s2 = new Rectangle(l,b); both does same thana  
                Shape s2 = new Rectangle(l,w);
                // here call pannum boothu derived class la erukurathu override aagum 
                s2.area();

                // its just like hierarchical inheritance 

            }
        }