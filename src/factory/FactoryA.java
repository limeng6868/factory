package factory;

import simpleFactory.Product;
import simpleFactory.ProductA;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: FactoryA
 * @Description: java����������
 * @Author: �¶���main()����
 * @CreateDate: 2019/3/7 16:29
 * @UpdateUser: ������
 * @UpdateDate: 2019/3/7 16:29
 * @UpdateRemark: ����˵��
 * @Version: 1.0
 */


public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
