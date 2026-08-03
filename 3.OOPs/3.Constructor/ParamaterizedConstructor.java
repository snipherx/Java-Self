public class ParamaterizedConstructor {
    String book;
    String language;
    int price;
    void details()
    {
        System.out.println("Book Name: "+book);
        System.out.println("Language: "+language);
        System.out.println("Price: "+price);
    }
    ParamaterizedConstructor(String book,String language,int price)
    {
        this.book=book;
        this.language=language;
        this.price=price;
    }
    public static void main(String[] args) {
        ParamaterizedConstructor a1=new ParamaterizedConstructor("Hello World", "English", 251);
        a1.details();
        ParamaterizedConstructor a2=new ParamaterizedConstructor("Kabir Das","Hindi",151);
        a2.details();
    }

    
}
