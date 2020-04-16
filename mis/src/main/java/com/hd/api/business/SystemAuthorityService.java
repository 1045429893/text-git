package com.hd.api.business;

import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityResources;

import java.math.BigInteger;
import java.util.List;


/**
*@author Robot
*/
public  interface SystemAuthorityService {

    public Object[]  addAuthority(SysAuthority sysAuthority,String resourcesIds);
    public Object[]  updateAuthority(SysAuthority sysAuthority, String resourcesIds);
    public Object[] deleteAuthority(BigInteger id);
    public SysAuthority getAuthorityById(BigInteger id);
    public List<SysAuthorityResources> getSysAuthorityResourcesByAuthorityId(String authorityId);
    public Object[] getAuthorityPage(Integer page,Integer pageSize,String name);
    public boolean checkAuthoritName(String name,String operate, String authorityId);

}