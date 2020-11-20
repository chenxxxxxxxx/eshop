package com.zhss.eshop.auth.dao;

import com.github.bpazy.BeanToSQL;
import com.zhss.eshop.auth.domain.AccountDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AuthSQLTest {

    /**
     * auth_account
     */
    @Test
    public void testAccount() throws Exception {
        System.out.println(new BeanToSQL().prettyPrinting().go(AccountDO.class));
    }
}
