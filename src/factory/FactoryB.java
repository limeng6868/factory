package factory;

import simpleFactory.Product;
import simpleFactory.ProductB;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: FactoryB
 * @Description: java类作用描述
 * @Author: 孤独的main()函数
 * @CreateDate: 2019/3/7 16:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/7 16:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
