package com.chen.smess.domain.service.erp.intoku.impl;

import com.chen.smess.domain.common.utils.PageData;
import com.chen.smess.domain.mapper.DaoSupport;
import com.chen.smess.domain.model.Page;
import com.chen.smess.domain.service.erp.intoku.IntoKuManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/** 
 * 说明： 商品入库
 * @version
 */
@Service("intokuService")
public class IntoKuService implements IntoKuManager {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("IntoKuMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("IntoKuMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("IntoKuMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("IntoKuMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("IntoKuMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("IntoKuMapper.findById", pd);
	}

	public PageData findByGoodsId(PageData pd) throws Exception {
		return (PageData)dao.findForObject("IntoKuMapper.findByGoodsId", pd);
	}

	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("IntoKuMapper.deleteAll", ArrayDATA_IDS);
	}
	
	/**总金额
	 * @param pd
	 * @throws Exception
	 */
	public PageData priceSum(PageData pd) throws Exception {
		return (PageData)dao.findForObject("IntoKuMapper.priceSum", pd);
	}
}

