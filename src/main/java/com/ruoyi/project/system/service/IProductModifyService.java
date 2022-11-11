package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.ProductModify;

/**
 * 产品改型数据Service接口
 * 
 * @author ruoyi
 * @date 2022-11-11
 */
public interface IProductModifyService 
{
    /**
     * 查询产品改型数据
     * 
     * @param id 产品改型数据主键
     * @return 产品改型数据
     */
    public ProductModify selectProductModifyById(Long id);

    /**
     * 查询产品改型数据列表
     * 
     * @param productModify 产品改型数据
     * @return 产品改型数据集合
     */
    public List<ProductModify> selectProductModifyList(ProductModify productModify);

    /**
     * 新增产品改型数据
     * 
     * @param productModify 产品改型数据
     * @return 结果
     */
    public int insertProductModify(ProductModify productModify);

    /**
     * 修改产品改型数据
     * 
     * @param productModify 产品改型数据
     * @return 结果
     */
    public int updateProductModify(ProductModify productModify);

    /**
     * 批量删除产品改型数据
     * 
     * @param ids 需要删除的产品改型数据主键集合
     * @return 结果
     */
    public int deleteProductModifyByIds(Long[] ids);

    /**
     * 删除产品改型数据信息
     * 
     * @param id 产品改型数据主键
     * @return 结果
     */
    public int deleteProductModifyById(Long id);
}
