class MainTest{
    Test t;
    public Test test_object(){
        t = new Test();
        return t;
    }
}
class Test{
    int x;
    public Test(){
        x = 10;
    } 
    public int getX(){
        return x;
    }
    public int sum(int a, int b){
        return (a+b);
    }
    public void printHello(){
        System.out.println("Hello!!");
    }   
}
class multiple_call{
    public static void main(String[] args){
        MainTest t = new MainTest();
        int sum = t.test_object().sum(1, 3);
        System.out.println(sum);
    }
}