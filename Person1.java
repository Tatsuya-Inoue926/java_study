public class Person1 {
    public static void main(String[] args){
        Person p = new Person("I");
        /*Person()の処理からIが呼び出される */
        p.setName("John");
        p.getName();
        System.out.println(p.getName());
        /*getName()からJohnが呼び出される */
    }
}
