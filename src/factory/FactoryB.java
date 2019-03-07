package factory;

import simpleFactory.Product;
import simpleFactory.ProductB;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: FactoryB
 * @Description: java����������
 * @Author: �¶���main()����
 * @CreateDate: 2019/3/7 16:30
 * @UpdateUser: ������
 * @UpdateDate: 2019/3/7 16:30
 * @UpdateRemark: ����˵��
 * @Version: 1.0
 */


public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
