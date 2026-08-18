class temp
{
   static int id=0;
   int count;
    {
        id=id+1;
        count=id;
    }
    public static void main(String[] args) {
        temp t1=new temp();
        temp t2=new temp();
        temp t3=new temp();
        System.out.println(id);
    }
}