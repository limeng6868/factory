package factory;

import simpleFactory.Product;

/**
 * @ProjectName: factory
 * @Package: factory
 * @ClassName: Factory
 * @Description: java����������
 * @Author: �¶���main()����
 * @CreateDate: 2019/3/7 16:27
 * @UpdateUser: ������
 * @UpdateDate: 2019/3/7 16:27
 * @UpdateRemark: ����˵��
 * @Version: 1.0
 */
public interface Factory {
    //����������Ʒ��ķ���
    public Product createProduct();
}
