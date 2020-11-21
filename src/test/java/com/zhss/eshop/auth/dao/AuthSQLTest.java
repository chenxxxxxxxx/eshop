package com.zhss.eshop.auth.dao;

import com.github.bpazy.BeanToSQL;
import com.zhss.eshop.auth.domain.AccountDO;
import com.zhss.eshop.auth.domain.AccountPriorityRelationshipDO;
import com.zhss.eshop.auth.domain.AccountRoleRelationshipDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AuthSQLTest {

    /**
     * 账号
     * auth_account
     */
    @Test
    public void testAccount() {
        System.out.println(new BeanToSQL().prettyPrinting().go(AccountDO.class));
    }

    /**
     * 账号和权限关系
     * auth_account_priority_relationship
     */
    @Test
    public void testAccountPriorityRelationship() {
        System.out.println(new BeanToSQL().prettyPrinting().go(AccountPriorityRelationshipDO.class));
    }

    /**
     * 账号角色关系
     * auth_account_role_relationship
     */
    @Test
    public void testAccountRoleRelationship() {
        System.out.println(new BeanToSQL().prettyPrinting().go(AccountRoleRelationshipDO.class));
    }
}
