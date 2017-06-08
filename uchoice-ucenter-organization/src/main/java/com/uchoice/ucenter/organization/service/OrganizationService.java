package com.uchoice.ucenter.organization.service;

import com.uchoice.ucenter.organization.dao.mysql.entity.Organization;

import java.util.List;

/**
 * Created by ${admin} on 2017/5/29.
 */
public interface OrganizationService {
    void addOrganization(Organization organization);

    void modifyOrganization(Organization organization);

    void deleteOrganization(long orgId);

    Organization queryOrgByOrgId(long orgId);

    List<Organization> queryOrgsByOrgIds(long ... orgIds);

    List<Organization> queryOrgsByRootOrgId(long orgId);

    List<Organization> queryOrgsByOrgIds(List<Long> orgIds);
}
