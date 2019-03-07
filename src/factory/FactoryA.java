package factory;

import simpleFactory.Product;
import simpleFactory.ProductA;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: FactoryA
 * @Description: java类作用描述
 * @Author: 孤独的main()函数
 * @CreateDate: 2019/3/7 16:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/7 16:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
