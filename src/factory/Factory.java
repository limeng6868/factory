package factory;

import simpleFactory.Product;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: Factory
 * @Description: java类作用描述
 * @Author: 孤独的main()函数
 * @CreateDate: 2019/3/7 16:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/7 16:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Factory {
    //声明产生产品类的方法
    public Product createProduct();
}
