package com.chen.smess.domain.service.erp.kucun;

import com.chen.smess.domain.common.utils.PageData;
import com.chen.smess.domain.model.Page;

import java.util.List;


public interface KucunManager {
    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception;

    /**修改库存
     * @param pd
     * @throws Exception
     */
    public void editKuCun(PageData pd)throws Exception;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception;

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception;

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**通过id获取数据(查看详细信息)
     * @param pd
     * @throws Exception
     */
    public PageData findByIdToCha(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

    /**商品入库，增加库存
     * @param pd
     * @throws Exception
     */
    public void editZCOUNT(PageData pd)throws Exception;

    /**
     * 根据条件查询
     *
     */
    public List<PageData> findByObject(PageData pageData) throws Exception;

    /**
     * 根据商品id查询商品
     * @param pd
     * @return
     */
    PageData findByGoodsId(PageData pd) throws Exception;

    /**总金额
     * @param pd
     * @throws Exception
     */
    public PageData priceSum(PageData pd) throws Exception;
}
