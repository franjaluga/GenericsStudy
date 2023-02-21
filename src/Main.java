public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Objeto b= new Objeto();

        a.setName("Perro");
        b.setName("Mesa");

        System.out.println(Fotografiar(a));
        System.out.println(Fotografiar(b));

    }

    public static <T> String Fotografiar( T t){
        return String.valueOf(t.hashCode());
    }
}

class Animal{
    String name;
    public Animal(){
    }

    public String getName(){
        return this.name;
    }

    public void setName( String s){
        this.name = s;
    }

}

class Objeto{
    String name;
    public Objeto(){
    }

    public String getName(){
        return this.name;
    }

    public void setName( String s){
        this.name = s;
    }

}