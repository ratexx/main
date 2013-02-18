package com.haak.haaksq.dbutil;

import com.mysql.jdbc.StringUtils;

public class SqlUtil {
	public static String changeArrayInConditon(int[] roleList){
		
		if(roleList!=null){
			String rtnRole = "(";
			for(int roleId:roleList){
				rtnRole +="'"+roleId+"',";
				
			}
			rtnRole = rtnRole.substring(0,rtnRole.length()-1);
			return  rtnRole+")";
		}else{
			return null;	
		}
	}
}
