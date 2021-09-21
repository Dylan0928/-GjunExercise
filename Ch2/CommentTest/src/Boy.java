public class Boy {

    public String name = "大雄";
    public int age = 10;

    public Boy(){	}

    public void greet(String guest){
        System.out.println(guest+"你好!!!我是"+ name);
        System.out.println("我今年" + age + "歲!");
    }
}