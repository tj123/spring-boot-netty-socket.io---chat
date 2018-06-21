package com.neo.dao;

import com.neo.entity.GroupEntity;
import com.neo.entity.UserEntity;
import com.neo.serivce.UserSerivice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by summer on 2017/5/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserSerivice serivice;

    @Autowired
    protected HttpSession session;

    @Test
    public void testSaveUser() throws Exception {
//        UserEntity user = new UserEntity();
//        user.setAuth_token(UUID.randomUUID().toString());
//        user.setUsername("90905555");
//        user.setPassword("456");
//        serivice.saveEntity(user);

        UserEntity user = serivice.register("123", "111","http://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg");
        System.out.println("已生成ID：" + user.getId());
         user = serivice.register("谢楠", "111","http://tva4.sinaimg.cn/crop.0.1.1125.1125.180/475bb144jw8f9nwebnuhkj20v90vbwh9.jpg");
        System.out.println("已生成ID：" + user.getId());
         user = serivice.register("马小云", "111","http://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg");
        System.out.println("已生成ID：" + user.getId());

        user = serivice.register("刘涛tamia", "111","http://tva1.sinaimg.cn/crop.0.0.512.512.180/6a4acad5jw8eqi6yaholjj20e80e8t9f.jpg");
        System.out.println("已生成ID：" + user.getId());

    }

    @Test
    public void testGroupUser() throws Exception {
//        UserEntity user = new UserEntity();
//        user.setAuth_token(UUID.randomUUID().toString());
//        user.setUsername("90905555");
//        user.setPassword("456");
//        serivice.saveEntity(user);

        UserEntity user = serivice.findUserByUserName("123");
        session.setAttribute("username", user);

        GroupEntity entity = serivice.creatGroup("前端群", "http://tva1.sinaimg.cn/crop.0.0.200.200.50/006q8Q6bjw8f20zsdem2mj305k05kdfw.jpg",user);
        System.out.println("已生成ID：" + entity.getId());

         entity = serivice.creatGroup("后端群", "http://tva2.sinaimg.cn/crop.0.0.199.199.180/005Zseqhjw1eplix1brxxj305k05kjrf.jpg",user);
        System.out.println("已生成ID：" + entity.getId());

         entity = serivice.creatGroup("UI设计", "http://tva2.sinaimg.cn/crop.0.8.751.751.180/961a9be5jw8fczq7q98i7j20kv0lcwfn.jpg",user);
        System.out.println("已生成ID：" + entity.getId());

    }

    @Test
    public void findUserByUserName() {
//        UserEntity user = serivice.findUserByUserName("123");
//        System.out.println("user is " + user.toString());
    }

    @Test
    public void updateUser() {
        UserEntity user = new UserEntity();
        user.setUsername("天空232");
        user.setPassword("fffxxxx");
        user.setAuth_token(UUID.randomUUID().toString());
//        UserEntity userEntity = (UserEntity) serivice.updateEntityById("5b1f34e04fc8b10a1d6ac35e", user);
//        System.out.println(userEntity.toString());
    }

    @Test
    public void deleteUserById() {
//        serivice.deleteEntityById("");
    }

}