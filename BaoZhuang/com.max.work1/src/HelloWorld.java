public class HelloWorld {
    public static void main(String[] args) {
        // 定义int类型变量，值为100
        int score = 100;
        // 创建Integer包装类对象，表示变量score1的值
        Integer score1 = score;

        // 将Integer包装类转换为double类型
       Double score2 = score1.doubleValue();
        // 将Integer包装类转换为long类型
       Long score3 = score2.longValue();
        // 将Integer包装类转换为int类型
        int score4 = score1.intValue();
        //打印输出
        System.out.println("score对应的Interger类型结果为:"+score1);
        System.out.println("score对应的double类型结果为:"+score2);
        System.out.println("score对应的long类型结果为:"+score3);
        System.out.println("重新油Integer转为int类型结果为:"+score4);
    }
}