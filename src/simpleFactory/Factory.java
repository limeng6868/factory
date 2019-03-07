package simpleFactory;

/**
 * @ProjectName: factory
 * @Package: simpleFactory
 * @ClassName: Factory
 * @Description: java类作用描述
 * @Author: 孤独的main()函数
 * @CreateDate: 2019/3/7 16:17
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/7 16:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class Factory {
    public static Product create(String str){

        //生成ProductA
        if(str.equalsIgnoreCase("ProductA"))
        {
            return new ProductA();
        }
        else
            //生成ProductB
            if(str.equalsIgnoreCase("ProductB"))
            {
                return new ProductB();
            }
        return null;
    }
}
