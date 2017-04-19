package com.it.serverImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.it.entity.ExtendMassage;
import com.it.entity.MassageDAO;
import com.it.entity.MsphotoDAO;
import com.it.entity.UserDAO;
import com.it.server.MassageServer;

public class MassageServerImpl implements MassageServer {
	
	public MassageDAO massageDao;
	public UserDAO userDao;
	public MsphotoDAO msphotoDao;
	
	public List<ExtendMassage> listMassage;
	
	
	
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

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public MsphotoDAO getMsphotoDao() {
		return msphotoDao;
	}

	public void setMsphotoDao(MsphotoDAO msphotoDao) {
		this.msphotoDao = msphotoDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ExtendMassage> getMassage() {
		// TODO Auto-generated method stub
		
		listMassage=massageDao.findExtendMassage();
		
		return listMassage;
	}

	@Override
	public void receiveMassage() {
		// TODO Auto-generated method stub

	}

}
