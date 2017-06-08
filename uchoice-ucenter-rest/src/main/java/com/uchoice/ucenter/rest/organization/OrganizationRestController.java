package com.uchoice.ucenter.rest.organization;

import com.uchoice.ucenter.biz.organization.OrganizationBiz;
import com.uchoice.ucenter.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${admin} on 2017/5/29.
 */
@RestController
@RequestMapping("org")
public class OrganizationRestController {
    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private OrganizationBiz organizationBiz;

}
