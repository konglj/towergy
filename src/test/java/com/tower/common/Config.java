package com.tower.common;

public class Config {
	
	
    public static int yqmincount=3;
	
	public static int yqmaxcount=7;
	
	public static int conrejectcount=1;//站址连续失败次数-1
	
	//public static int jjtowerlevel=4;//降级站址级别
	
	public static int unordertowerday=7;//连续几天未抢单
	
	public static int postundoday=3;//交单几天未处理
	
	private static int qdtime=7;
	
	private static String webip;
	
	private static String systemip;
	
	private static String province;
	
	private static String towerfile;
	
	public static int towerPaiDanRecvery=0;//派单的站址还原成未上架
	

	public static int getQdtime() {
		return qdtime;
	}

	public static void setQdtime(int qdtime) {
		Config.qdtime = qdtime;
	}

	public static String getWebip() {
		return webip;
	}

	public static void setWebip(String webip) {
		Config.webip = webip;
	}

	public static String getSystemip() {
		return systemip;
	}

	public static void setSystemip(String systemip) {
		Config.systemip = systemip;
	}

	public static String getProvince() {
		return province;
	}

	public static void setProvince(String province) {
		Config.province = province;
	}

	public static String getTowerfile() {
		return towerfile;
	}

	public static void setTowerfile(String towerfile) {
		Config.towerfile = towerfile;
	}
	
	
	
	

	
	
	

}
