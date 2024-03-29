package com.chen.smess.domain.service.erp.goods.impl;

import com.chen.smess.domain.common.utils.PageData;
import com.chen.smess.domain.mapper.DaoSupport;
import com.chen.smess.domain.model.Page;
import com.chen.smess.domain.service.erp.goods.GoodsManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 说明： 商品管理
 */
@Service("goodsService")
public class GoodsService implements GoodsManager {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("GoodsMapper.save", pd);
	}

	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("GoodsMapper.delete", pd);
	}

	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("GoodsMapper.edit", pd);
	}

	/**修改库存
	 * @param pd
	 * @throws Exception
	 */
	public void editCountNum(PageData pd)throws Exception{
		dao.update("GoodsMapper.editCountNum", pd);
	}

	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("GoodsMapper.datalistPage", page);
	}

	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("GoodsMapper.listAll", pd);
	}

	/**通过产品编码
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listByBm(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("GoodsMapper.listByBm", pd);
	}
	/**通过产品计量单位
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> weightList(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("GoodsMapper.weightList", pd);
	}

	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("GoodsMapper.findById", pd);
	}
	/**通过编码获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findDataByBm(PageData pd)throws Exception{
		return (PageData)dao.findForObject("GoodsMapper.findDataByBm", pd);
	}

	/**通过id获取数据(查看详细信息)
	 * @param pd
	 * @throws Exception
	 */
	public PageData findByIdToCha(PageData pd)throws Exception{
		return (PageData)dao.findForObject("GoodsMapper.findByIdToCha", pd);
	}

	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("GoodsMapper.deleteAll", ArrayDATA_IDS);
	}

	/**商品入库，增加库存
	 * @param pd
	 * @throws Exception
	 */
	public void editZCOUNT(PageData pd)throws Exception{
		dao.update("GoodsMapper.editGCOUNT", pd);
	}

	public PageData findbm() throws Exception {
		return (PageData) dao.findForObject("GoodsMapper.findBm",null);
	}

	public PageData findByBm(PageData pd)throws Exception{
		return (PageData)dao.findForObject("GoodsMapper.findByBm", pd);
	}

}

