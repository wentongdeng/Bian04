package com.it.serverImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.it.entity.ExtendMassage;
import com.it.entity.Massage;
import com.it.entity.MassageDAO;
import com.it.entity.MsphotoDAO;
import com.it.entity.User;
import com.it.entity.UserDAO;
import com.it.server.MassageServer;
import com.opensymphony.xwork2.ActionContext;

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
	
	public  String getRequestBody(ActionContext ctx){
		try{		
			HttpServletRequest request=(HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);
//			HttpServletRequest request = ServletActionContext.getRequest();
			Map<String, String[]> map = request.getParameterMap();  
	        Set<Entry<String, String[]>> set = map.entrySet();  
	        Iterator<Entry<String, String[]>> it = set.iterator();
	        Massage massage=new Massage();
	        //按顺序来来
	        int count=1;
	        while (it.hasNext()) {  
	            Entry<String, String[]> entry = it.next();  
	            String content="";
	            System.out.println("KEY:"+entry.getKey()); 
	            for (String i : entry.getValue()) {
            		content+=i;
            		}
	            if(count==1){
	            	massage.setText(content);
	            }else if(count==2){
	            	massage.setTitle(content);
	            }else if(count==3){
	            	@SuppressWarnings("unchecked")
					List<User>users=userDao.findByName(content);
	            	massage.setId(users.get(0).getId());
	            }
	            count++;
	        }
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	        massage.setTime(df.format(new Date()));
	        massage.setLike(2);
	        massage.setComment(2);
	        massageDao.save(massage);
			return "success";
		}catch(Exception e){
			System.out.println("出错");
			return "failure";
		}
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
