/* 
 **********************************************************************
 * Copyright (c) 2014, xianneng.lin@gmail.com All Rights Reserved. 
 **********************************************************************
 */
package org.xiaoxiancai.imhere.server.test;

import org.xiaoxiancai.imhere.client.DefaultClient;
import org.xiaoxiancai.imhere.common.protos.business.AddFriendRequestProtos.AddFriendRequest;
import org.xiaoxiancai.imhere.common.protos.business.AddFriendResponseProtos.AddFriendResponse;
import org.xiaoxiancai.imhere.common.protos.business.LocateRequestProtos.LocateRequest;
import org.xiaoxiancai.imhere.common.protos.business.LocateResponseProtos.LocateResponse;
import org.xiaoxiancai.imhere.common.protos.business.LocationProtos.Location;
import org.xiaoxiancai.imhere.common.protos.business.LoginRequestProtos.LoginRequest;
import org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse;
import org.xiaoxiancai.imhere.common.protos.business.RegisterRequestProtos.RegisterRequest;

/**
 * 客户端测试类
 * 
 * @author xiannenglin
 */
public class ClientTest {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++) {
            //			Thread registerThread = new Thread(new RegisterTask());
            Thread loginThread = new Thread(new LoginTask());
            //			Thread locateThread = new Thread(new LocateTask());
            //			Thread addFriendThread = new Thread(new AddFriendTask());
            //			registerThread.start();
            loginThread.start();
            //			locateThread.start();
            //			addFriendThread.start();
        }
    }

}

class AddFriendTask implements Runnable {

    @Override
    public void run() {
        DefaultClient client = new DefaultClient();
        client.setServer("localhost", 18080);
        AddFriendRequest request = createAddFriendRequest();
        try {
            AddFriendResponse response = client.addFriend(request);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    private AddFriendRequest createAddFriendRequest() {
        AddFriendRequest.Builder builder = AddFriendRequest.newBuilder();
        builder.setFromUserId(12);
        builder.setFromUserMobile("13758781759");
        builder.setFromUserNickname("nickName-9");
        builder.setToUserMobile("13758781760");
        return builder.build();
    }

}

class LoginTask implements Runnable {

    @Override
    public void run() {
        DefaultClient client = new DefaultClient();
        client.setServer("localhost", 18080);
        LoginRequest request = createLoginRequest();
        try {
            LoginResponse response = client.login(request);
            System.out.println(response.getIsSuccess());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    private LoginRequest createLoginRequest() {
        LoginRequest.Builder builder = LoginRequest.newBuilder();
        builder.setMobile("13758781758");
        builder.setPassword("pswd-8");
        return builder.build();
    }
}

class LocateTask implements Runnable {

    @Override
    public void run() {
        DefaultClient client = new DefaultClient();
        client.setServer("localhost", 18080);
        LocateRequest request1 = createLocateRequest1();
        LocateRequest request2 = createLocateRequest2();
        LocateRequest request3 = createLocateRequest3();
        try {
            LocateResponse response1 = client.locate(request1);
            LocateResponse response2 = client.locate(request2);
            LocateResponse response3 = client.locate(request3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    private LocateRequest createLocateRequest1() {
        Location.Builder locBuilder = Location.newBuilder();
        locBuilder.setUserId(3);
        locBuilder.setLocType(62);
        locBuilder.setLatitude(31.3333d);
        locBuilder.setLongitude(141.3333d);
        LocateRequest.Builder builder = LocateRequest.newBuilder();
        builder.setCurrentLocation(locBuilder.build());
        return builder.build();
    }

    private LocateRequest createLocateRequest2() {
        Location.Builder locBuilder = Location.newBuilder();
        locBuilder.setUserId(4);
        locBuilder.setLocType(62);
        locBuilder.setLatitude(32.4444d);
        locBuilder.setLongitude(142.4444d);
        LocateRequest.Builder builder = LocateRequest.newBuilder();
        builder.setCurrentLocation(locBuilder.build());
        return builder.build();
    }

    private LocateRequest createLocateRequest3() {
        Location.Builder locBuilder = Location.newBuilder();
        locBuilder.setUserId(5);
        locBuilder.setLocType(62);
        locBuilder.setLatitude(33.5555d);
        locBuilder.setLongitude(143.5555d);
        LocateRequest.Builder builder = LocateRequest.newBuilder();
        builder.setCurrentLocation(locBuilder.build());
        return builder.build();
    }
}

class RegisterTask implements Runnable {

    @Override
    public void run() {
        DefaultClient client = new DefaultClient();
        client.setServer("localhost", 18080);
        int index = 60;
        RegisterRequest register = createRegister(index);
        try {
            client.register(register);
            System.out.println("register index = " + index + " success.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    private RegisterRequest createRegister(int index) {
        RegisterRequest.Builder request = RegisterRequest.newBuilder();
        request.setMobile("137587817" + index);
        request.setNickName("nickName-" + index);
        request.setPassword("pswd-" + index);
        request.setEmail("email-" + index + "@gmail.com");
        request.setSignature("signature-" + index);
        return request.build();
    }

}
