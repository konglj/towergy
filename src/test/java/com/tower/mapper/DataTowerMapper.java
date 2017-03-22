package com.tower.mapper;

import java.util.List;
import java.util.Map;

import com.tower.common.bean.DataTower;
import com.tower.common.bean.DataTowerPage;
import com.tower.common.bean.DataTowerParameter;
import com.tower.common.bean.TowerStateCount;

public interface DataTowerMapper {
	
	public List<DataTower> getDataTowers(DataTowerPage datatowerPage);
	
	public int getDataTowersCount(DataTowerPage datatowerPage);
	
	public List<Map> getDcDataTowers(DataTowerPage datatowerPage);
	
	//站址统计总汇
	public List<TowerStateCount> getTowerStateCount(DataTowerPage datatowerPage);

	
	
	
	public List<DataTower> getDataTowerQds(DataTowerPage datatowerPage);
	
	public int getDataTowerQdsCount(DataTowerPage datatowerPage);
	
	public List<Map> getDcDataTowerQds(DataTowerPage datatowerPage);
}


