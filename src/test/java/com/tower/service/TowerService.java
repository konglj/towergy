package com.tower.service;

import java.util.List;
import java.util.Map;

import com.tower.common.bean.AddTowerInfo;
import com.tower.common.bean.Area;
import com.tower.common.bean.City;
import com.tower.common.bean.DataTower;
import com.tower.common.bean.DataTowerPage;
import com.tower.common.bean.Order;
import com.tower.common.bean.QueryTerms;
import com.tower.common.bean.Tower;
import com.tower.common.bean.TowerStateCount;
import com.tower.common.bean.TowerStore;
import com.tower.common.bean.TowerType;
import com.tower.common.bean.TowersPage;

public interface TowerService {
	
	//上架站址管理
	public TowersPage getTowersPage(QueryTerms queryTerms);
	
	public List<Tower> getTowers(QueryTerms queryTerms);
	
	public int  getTowersCount(QueryTerms queryTerms);
	
	//未上架站址管理
	public TowersPage getNoTowersPage(QueryTerms queryTerms);
	
	public List<Tower> getNoTowers(QueryTerms queryTerms);
	
	public int  getNoTowersCount(QueryTerms queryTerms);
	
	//添加站址
	public int addTower(AddTowerInfo tower);
	
	public Area getAreaById(Map map);
	
	//站址分析
	public List<DataTower> getDataTowers(DataTowerPage datatowerPage);
	
	//站址分析
		public List<DataTower> getDataTowerQds(DataTowerPage datatowerPage);
	
	//站址分析
	public List<Map> getDcDataTowers(DataTowerPage datatowerPage);
	
	//站址分析
		public List<Map> getDcDataTowerQds(DataTowerPage datatowerPage);
	
	public List<Order> getTowerOrderHistory(int towerid);
	
	public List<Map> getDcTowerOrderHistory(int towerid);
	
	
	
	/**
	 * 上、下架处理
	 */
	public int updateTowerVisible(Map map);
	

	public int delTower(Map map);
	
	public Tower getTowerInfo(int towerid);

	public String getAreaOrder(int cityid, int area);
	
	
	public int updateTower(AddTowerInfo tower);
	
	public List<TowerType> getTowertype();
	
	public Map<String,Integer>  getTowertypeMap();
	
	public int insertTowers(List<AddTowerInfo> towers);
	
	public List<Map> dcTowers(QueryTerms queryTerms);
	
	
	public List<TowerStore> getTowerStores();
	
	public Map<String,Integer> getTowerStoreMap();
	
	
	/**
	 * 获取未抢单的订单
	 * @return
	 */
    public List<Map> getUnOrderTower();
    
    
    public int updateTowerLevel(Map map);
    
    

	//站址统计总汇
	public List<TowerStateCount> getTowerStateCount(DataTowerPage datatowerPage);

    
	
}
