package com.uchoice.ucenter.organization.service.mysql;

import com.uchoice.ucenter.organization.dao.mysql.entity.Organization;
import com.uchoice.ucenter.organization.dao.mysql.mapper.OrganizationMapper;
import com.uchoice.ucenter.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 组织机构管理
 * Created by ${admin} on 2017/5/29.
 */
@Service
public class MysqlOrganizationServiceImpl implements OrganizationService{
    @Autowired
    OrganizationMapper organizationMapper;
    @Override
    public void addOrganization(Organization organization) {

    }

    @Override
    public void modifyOrganization(Organization organization) {

    }

    @Override
    public void deleteOrganization(long orgId) {

    }

    @Override
    public Organization queryOrgByOrgId(long orgId) {
        return null;
    }

    @Override
    public List<Organization> queryOrgsByOrgIds(long... orgIds) {
        return null;
    }

    @Override
    public List<Organization> queryOrgsByRootOrgId(long orgId) {
        return null;
    }

    @Override
    public List<Organization> queryOrgsByOrgIds(List<Long> orgIds) {
        return null;
    }
}
