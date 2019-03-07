package simpleFactory;

/**
 * @ProjectName: factory
 * @Package: simpleFactory
 * @ClassName: Factory
 * @Description: java����������
 * @Author: �¶���main()����
 * @CreateDate: 2019/3/7 16:17
 * @UpdateUser: ������
 * @UpdateDate: 2019/3/7 16:17
 * @UpdateRemark: ����˵��
 * @Version: 1.0
 */


public class Factory {
    public static Product create(String str){

        //����ProductA
        if(str.equalsIgnoreCase("ProductA"))
        {
            return new ProductA();
        }
        else
            //����ProductB
            if(str.equalsIgnoreCase("ProductB"))
            {
                return new ProductB();
            }
        return null;
    }
}
