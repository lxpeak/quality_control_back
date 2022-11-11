package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.RuleConstruction;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-11-11
 */
public interface IRuleConstructionService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public RuleConstruction selectRuleConstructionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ruleConstruction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RuleConstruction> selectRuleConstructionList(RuleConstruction ruleConstruction);

    /**
     * 新增【请填写功能名称】
     * 
     * @param ruleConstruction 【请填写功能名称】
     * @return 结果
     */
    public int insertRuleConstruction(RuleConstruction ruleConstruction);

    /**
     * 修改【请填写功能名称】
     * 
     * @param ruleConstruction 【请填写功能名称】
     * @return 结果
     */
    public int updateRuleConstruction(RuleConstruction ruleConstruction);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteRuleConstructionByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRuleConstructionById(Long id);
}
