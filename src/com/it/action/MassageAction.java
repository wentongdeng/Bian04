package com.it.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.it.entity.ExtendMassage;
import com.it.entity.Massage;
import com.it.entity.MassageDAO;
import com.it.serverImpl.MassageServerImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MassageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5503324608858406452L;
	public MassageDAO massageDao;
	Map<String,Object> map;
	public List<ExtendMassage> listMassage;
	public MassageServerImpl massageServer;
	
	public MassageServerImpl getMassageServer() {
		return massageServer;
	}
	public void setMassageServer(MassageServerImpl massageServer) {
		this.massageServer = massageServer;
	}
	public List<ExtendMassage> getListMassage() {
		return listMassage;
	}
	public void setListMassage(List<ExtendMassage> listMassage) {
		this.listMassage = listMassage;
	}
	public MassageDAO getMassageDao() {
		return massageDao;
	}
	public void setMassageDao(MassageDAO massageDao) {
		this.massageDao = massageDao;
	}
	
	public String listMassage(){
		map=new HashMap<String,Object>();
		@SuppressWarnings("unchecked")
		List<Massage> list=massageDao.findAll();
		map.put("massage", list);
		return "list";
	}
	
	public String listExtendMassage(){
		listMassage=massageServer.getMassage();
		return "listExtendMassage";
	}
	
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	
	
}
