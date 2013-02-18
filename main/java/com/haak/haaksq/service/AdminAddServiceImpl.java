package com.haak.haaksq.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.hibernate.id.enhanced.OptimizerFactory.LegacyHiLoAlgorithmOptimizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.dao.AdminAddDAO;
import com.haak.haaksq.dao.MainLoadDAO;
import com.haak.haaksq.form.Address;
import com.haak.haaksq.form.AttachFile;
import com.haak.haaksq.form.AttachFileId;
import com.haak.haaksq.form.CacheM;
import com.haak.haaksq.form.CommunityAddress;
import com.haak.haaksq.form.CommunityNew;
import com.haak.haaksq.form.PageInPutUser;
import com.haak.haaksq.form.Sms;
import com.haak.haaksq.form.SmsCredit;
import com.haak.haaksq.form.SmsHistory;
import com.haak.haaksq.form.SmsTo;
import com.haak.haaksq.form.StmImg;
import com.haak.haaksq.form.UserProfile;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.form.UserRole;
import com.haak.haaksq.form.UserRoleId;
import com.haak.haaksq.form.VCommunity;
import com.haak.haaksq.form.VCommunity;
import com.haak.haaksq.form.VResultSendSms;
import com.haak.haaksq.form.VUserProfile;



@Service
public class AdminAddServiceImpl implements AdminAddService{

	@Autowired
	private MainLoadDAO mainLoadDAO; 
	@Autowired
	private AdminAddDAO adminDAO; 	
	
	
	@Transactional
	public List<CacheM> getCacheM(String name,int commuid) {
		
		
		if(name.equals(HaakConst.LISTBOX_COMMUNITY_BY_GROUP)&&commuid==0){
			return adminDAO.getCacheM(" m2.community_id "
					, " m2.community_name "
					, " community m1 , community m2  "
					, " where m1.community_id = m2.community_id and m2.community_id <> 0 "+
						//"and m1.community_group_id = (select m3.community_group_id from community m3 where m3.community_id = "+commuid+ ") " + 
						"order by m2.community_group_id , m1.community_id   " 
					
					);
		}
		else if(name.equals(HaakConst.LISTBOX_COMMUNITY_BY_GROUP)){
			return adminDAO.getCacheM(" m2.community_id "
					, " m2.community_name "
					, " community m1 , community m2  "
					, " where m1.community_id = m2.community_id and m2.community_id <> 0 "+
							"and m1.community_group_id = (select m3.community_group_id from community m3 where m3.community_id = "+commuid+ ") " + 
							"order by m2.community_group_id , m1.community_id   " 

					);
		}else if(name.equals(HaakConst.LIST_SMS_COMMUNITY_CREDIT)){
			
			return adminDAO.getCacheM(" sc.credit_total "
					, " cu.community_name "
					, " sms_credit sc, community cu "
					, " where sc.community_id =cu.community_id and sc.community_id = "+commuid+"   ");		
			
		}else if(name.equals(HaakConst.LIST_LIFE_STYLE_TYPE)){
			
			return adminDAO.getCacheM(" mst_liftstyle_type.lifestyle_type_name "
					, " mst_liftstyle_type.lifestyle_type_id "
					, " mst_liftstyle_type "
					, ""  );		
		}else {
			return null;
			
		}
		

		
		
	}
	
	
	@Transactional
	public List<CacheM> getCacheM(String name) {
		
		if(name.equals(HaakConst.LISTBOX_COMMUNITY_NAME)){

			return adminDAO.getCacheM("community.community_id", " community.community_name ", " community ", "");
		}else {
			return null;
			
		}
		

		
		
	}
	
	@Transactional
    public void deleteUser(int userId){
		adminDAO.deleteUser(adminDAO.loadUserProfile(userId));
	}
		
	@Transactional
	public PageInPutUser loadUserdetails(UserProfileForm user){
		PageInPutUser pageinputUser = new PageInPutUser();
		VCommunity vCommu = mainLoadDAO.loadCommunityDeatils(user.getCommuID(),1);
		
		pageinputUser.setUserId(user.getUserID());
		pageinputUser.setUserName(user.getUserName());
		pageinputUser.setPass(user.getPassword());
		pageinputUser.setFirstName(user.getFirstName());
		pageinputUser.setLastName(user.getLastName());
		pageinputUser.setEmail(user.getEmail());
		pageinputUser.setAddressId(user.getAddressID());
		pageinputUser.setNickName(user.getNickName());
		pageinputUser.setCommunityId(user.getCommuID());		
		
/*		
		pageinputUser.setAddressId(user.getAddressID());
		pageinputUser.setAddressNo(user.getAddressID()ressID()ID()s_no());
		pageinputUser.setMobile(user.getMobile());
		pageinputUser.setRoad(pageinputUser.getRoad());
		pageinputUser.setSoi(pageinputUser.getSoi());
		pageinputUser.setMoo(pageinputUser.getMoo());
		 
		pageinputUser.setAmphoe(vCommu.getAmphoeName());
		pageinputUser.setTumbol(vCommu.getTumbolName());*/
		
		return pageinputUser;
		
	}
	
	
	@Transactional	
	public void saveNews(CommunityNew commuNews){
		
		commuNews.setCreateDate(new Date(System.currentTimeMillis()));
		commuNews.setModifyDate(new Date(System.currentTimeMillis()));
		commuNews.setCreateBy(0);
		commuNews.setModifyBy(0);
		adminDAO.saveNews(commuNews);
	}
	
	 @Transactional	
	 	 public void saveUser(PageInPutUser pageinputUser){
		 //Address address = new Address();
		 CommunityAddress address = new CommunityAddress();
		 UserProfile user = new UserProfile(); 
		 AttachFile attach = new AttachFile();
		 AttachFileId attachID = new AttachFileId();
		 UserRole userRole = new UserRole();
		 UserRoleId userRoleID = new UserRoleId();
		 
		 
		 //pageinputUser.setCommunityId(1);
		
		 int userID = 	  mainLoadDAO.getMAX("user_profile.user_id","user_profile",1);
		 //int attId =  mainLoadDAO.getMAX("attach_file.attach_id","attach_file",1);
		 int maxAddressID = mainLoadDAO.getMAX("community_address.address_id","community_address",1);
		 VCommunity vCommu = mainLoadDAO.loadCommunityDeatils(pageinputUser.getCommunityId(),1);
		 //userID = userID+1;
		 maxAddressID = maxAddressID+1;
		 address.setAddressId(maxAddressID);
		 address.setAddressNo(pageinputUser.getAddress_no());
		 address.setMobile(pageinputUser.getMobile());
		 address.setRoad(pageinputUser.getRoad());
		 address.setSoi(pageinputUser.getSoi());
		 address.setMoo(pageinputUser.getMoo());
		 
		 address.setAmphoe(vCommu.getAmphoeName());
		 address.setTumbol(vCommu.getTumbolName());
		 address.setCreateBy(0);
		 address.setModifyBy(0);
		 address.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 address.setModifyDate(new java.util.Date( System.currentTimeMillis()));

		 
		 
		 //address.setCity(vCommu);
		 //address.setCountry(vCommu.getC	
		 //user.setUserId(userID);
		 user.setUserName(pageinputUser.getUserName());
		 user.setPass(pageinputUser.getPass());
		 user.setFirstName(pageinputUser.getFirstName());
		 user.setLastName(pageinputUser.getLastName());
		 user.setEmail(pageinputUser.getEmail());
		 user.setAddressId(maxAddressID);
		 user.setNickName(pageinputUser.getNickName());
		 user.setCommunityId(pageinputUser.getCommunityId());
		 user.setCreateBy(0);
		 user.setModifyBy(0);
		 user.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 user.setModifyDate(new java.util.Date( System.currentTimeMillis()));

		 attachID.setLinkId(userID);
		 attachID.setCommunityId(pageinputUser.getCommunityId());
		 attachID.setAttachSeq(0);
		 
		 attach.setId(attachID);
		 attach.setFileTypeId(10);
		 attach.setFileName("TEMP");
		 attach.setFileDetail("TEMP");
		 attach.setPathName("TEMP");
		 attach.setAttachUrl("TEMP");
		 attach.setCreateBy(0);
		 attach.setModifyBy(0);
		 attach.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 attach.setModifyDate(new java.util.Date( System.currentTimeMillis()));
		 
		 
		 
		 userRoleID.setRoleId(4);//normal user
		 userRoleID.setUserId(userID);
		 userRole.setId(userRoleID);
		 
		 userRole.setCreateBy(0);
		 userRole.setModifyBy(0);
		 userRole.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 userRole.setModifyDate(new java.util.Date( System.currentTimeMillis()));
		 
		 
		 
		 
		 adminDAO.saveCommuAd(address);
		 adminDAO.saveUser(user);
		 adminDAO.saveAttach(userRole);
		 adminDAO.saveAttach(attach);

		 user =null;
		 address =null;
		 userRole =null;
		 attach=null;
		 
	 }
	 
	 @Transactional
	 public void updateUser(VUserProfile userForm,int lanuageID){
		 
		 UserProfile userForUpdate =  adminDAO.loadUserProfile(userForm.getUserId());
		 System.out.println("commu updateUser >>" + userForUpdate.getAddressId());
		 CommunityAddress commuAddressForUpdate = adminDAO.loadCommuAddress(userForUpdate.getAddressId());
		 
		 
		 userForUpdate.setUserName(userForm.getUserName());
		 userForUpdate.setPass(userForm.getPass());
		 userForUpdate.setFirstName(userForm.getFirstName());
		 userForUpdate.setLastName(userForm.getLastName());
		 userForUpdate.setNickName(userForm.getNickName());
		 userForUpdate.setHobbies(userForm.getHobbies());
		 userForUpdate.setSports(userForm.getSports());
		 userForUpdate.setEmail(userForm.getEmail());
		 userForUpdate.setMobileNo(userForm.getMobileNo());
		 userForUpdate.setProfession(userForm.getProfession());
		 userForUpdate.setTelephoneNo(userForm.getTelephoneNo());
		 userForUpdate.setFaxNo(userForm.getFaxNo());
		 
		 userForUpdate.setModifyBy(userForm.getUserId());
		 userForUpdate.setModifyDate(new java.util.Date(System.currentTimeMillis()));		 
		 
		 commuAddressForUpdate.setNoOfCars(userForm.getNoOfCars());
		 commuAddressForUpdate.setNoOfCats(userForm.getNoOfCats());
		 commuAddressForUpdate.setNoOfDogs(userForm.getNoOfDogs()); 
		 commuAddressForUpdate.setOtherPets(userForm.getOtherPets());
		 commuAddressForUpdate.setModifyBy(userForm.getUserId());
		 commuAddressForUpdate.setModifyDate(new java.util.Date(System.currentTimeMillis()));
		 
		 adminDAO.updateCommuAddress(commuAddressForUpdate);
		 adminDAO.updateUser(userForUpdate);
	 }
	 @Transactional
	 public VUserProfile loadUserDetails(UserProfileForm user,int lanuage_id){
		return adminDAO.loadUserDetails(user.getUserID(), lanuage_id);
	 }
	 
	 @Transactional
	   public List<UserProfile> getListUser(int community,int roleId[]){   	
		
			 if(roleId[0]==1){
				 return adminDAO.getListUser(community,roleId[0]);
				 
			 }else if(roleId[0]==2){
				 List<CacheM> lc =  adminDAO.getCacheM(" m2.community_id "
							, " m2.community_name "
							, " community m1 , community m2  "
							, " where m1.community_id = m2.community_id and m2.community_id <> 0 "+
								"and m1.community_group_id = (select m3.community_group_id from community m3 where m3.community_id = "+community+ ") " + 
								"order by m2.community_group_id , m1.community_id   " );
				 List<UserProfile> rtnL = new ArrayList<UserProfile>();
				 
				 for(CacheM c:lc){
					 ArrayList<UserProfile> tmpL = new ArrayList<UserProfile>(adminDAO.getListUser(Integer.parseInt(c.getValue()),2 ));
					 rtnL.addAll(tmpL);
					 System.out.print(rtnL.size()+"      " +Integer.parseInt(c.getValue()) + "    " + tmpL.size() + "          " );
				 }
				 return rtnL;
				 
			 }else{
				 return adminDAO.getListUser(community,30);
				 
			 }
		 
		 
		  // return adminDAO.getListUser(community);
	   }
	 
	 @Transactional
	   public void keepSmsLog(Sms sms,List<SmsTo> listSmsto){
		 
		 adminDAO.saveSMS(sms);
		 for( SmsTo smsTo:listSmsto){
			 adminDAO.saveSmsTo(smsTo);
		 }
		 		 
		   
	   }
	 @Transactional
	   public List<VResultSendSms> getSmsDetail(int smsId){   	
		   return adminDAO.getSMSDetail(smsId);
	   }
	 
	 @Transactional
	   public void saveLogSMS(int communityId , String msg,String[] mobileNo,int user ,int useCredit){   	
		
		 int SMS_ID = mainLoadDAO.getMAX("SMS_ID", "SMS", 1);
		 System.out.println("SMS_ID" + SMS_ID);
		 Sms sms = new Sms();
		 
		 sms.setSmsMessage(msg);
		 sms.setCreateBy(user);
		 sms.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 
		 for(String smsToNo:mobileNo){
			 SmsTo smsto = new SmsTo();
			 smsto.setSmsId(SMS_ID);
			 smsto.setCommunityId(communityId);
			 smsto.setCreateBy(user);
			 smsto.setCreateDate(new java.util.Date( System.currentTimeMillis()));
			 smsto.setMobileNo(smsToNo);
			 //smsto.setSmsCradit(smsCradit)
			 smsto.setSmsStatus("COMPLETE");
			 smsto.setUserId(user);
			
			 adminDAO.saveSmsTo(smsto);
		 }
		 
		 adminDAO.saveSMS(sms);
		 
		 SmsHistory smsHistory = new SmsHistory();
		 
		 smsHistory.setCreateBy(user);
		 smsHistory.setCreateDate(new java.util.Date( System.currentTimeMillis()));
		 smsHistory.setCredit(useCredit);
		 smsHistory.setSmsDetail(SMS_ID);
		 smsHistory.setModifyBy(user);
		 smsHistory.setModifyDate(new java.util.Date( System.currentTimeMillis()));
		 smsHistory.setSmsTypeId(0);
		 
		 SmsCredit smsCredit =  mainLoadDAO.loadSmsCredit(communityId);
		 smsCredit.setCreditTotal(smsCredit.getCreditTotal()-useCredit);
		 adminDAO.updateSmsCredit(smsCredit);
		 adminDAO.saveSmsHistory(smsHistory);
		 
	   }
	 
	 
	 @Transactional
	   public StmImg save_img_stream(String img_path,String img_name,int create_by,String ipClient){
		 
		 StmImg stmImg = new StmImg();
		 
		 stmImg.setImgPath(img_path);
		 stmImg.setImgName(img_name);
		 stmImg.setCreateBy(create_by);
		 stmImg.setIpAddress(ipClient);
		 stmImg.setFlagRecord("Y");
		 stmImg.setCreateDate(new java.util.Date(System.currentTimeMillis()));
		 
		 adminDAO.save_img_stream(stmImg);
		 return stmImg;
	   }
	 
	 @Transactional
	   public List<UserProfile> searchUser(String  key,int commuId){
		 	
		 	List<Object> rtn = adminDAO.getSearchUser(key);
		 	if(rtn==null ||rtn.size()==0){
		 		return null;
		 	}else {
		 		return adminDAO.getListUser(rtn.toArray(),commuId);
		 	}
		   
	   }	 
	 
}
