/* 
 **********************************************************************
 * Copyright (c) 2014, xianneng.lin@gmail.com All Rights Reserved. 
 **********************************************************************
 */
package org.xiaoxiancai.imhere.client;

import static org.xiaoxiancai.imhere.client.utils.ClientConstant.DECODER_ACCEPT_FRIEND;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.DECODER_ADD_FRIEND;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.DECODER_LOCATE;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.DECODER_LOGIN;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.DECODER_REGISTER;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.HANDLER_ACCEPT_FRIEND;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.HANDLER_ADD_FRIEND;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.HANDLER_LOCATE;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.HANDLER_LOGIN;
import static org.xiaoxiancai.imhere.client.utils.ClientConstant.HANDLER_REGISTER;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.protobuf.ProtobufDecoder;

import org.xiaoxiancai.imhere.client.handler.AcceptFriendHandler;
import org.xiaoxiancai.imhere.client.handler.AddFriendHandler;
import org.xiaoxiancai.imhere.client.handler.LocateHandler;
import org.xiaoxiancai.imhere.client.handler.LoginHandler;
import org.xiaoxiancai.imhere.client.handler.RegisterHandler;
import org.xiaoxiancai.imhere.common.protos.business.AcceptFriendRequestProtos.AcceptFriendRequest;
import org.xiaoxiancai.imhere.common.protos.business.AcceptFriendResponseProtos.AcceptFriendResponse;
import org.xiaoxiancai.imhere.common.protos.business.AddFriendRequestProtos.AddFriendRequest;
import org.xiaoxiancai.imhere.common.protos.business.AddFriendResponseProtos.AddFriendResponse;
import org.xiaoxiancai.imhere.common.protos.business.LocateRequestProtos.LocateRequest;
import org.xiaoxiancai.imhere.common.protos.business.LocateResponseProtos.LocateResponse;
import org.xiaoxiancai.imhere.common.protos.business.LoginRequestProtos.LoginRequest;
import org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse;
import org.xiaoxiancai.imhere.common.protos.business.RegisterRequestProtos.RegisterRequest;
import org.xiaoxiancai.imhere.common.protos.business.RegisterResponseProtos.RegisterResponse;
import org.xiaoxiancai.imhere.common.protos.common.BusinessTypeProtos.BusinessType;

/**
 * 默认客户端实现
 * 
 * @author linxianneng
 */
public class DefaultClient extends AbstractClient {

    /**
     * @param serverHost
     * @param serverPort
     */
    public DefaultClient(String serverHost, int serverPort) {
        super(serverHost, serverPort);
    }

    /**
     * 注册用户
     * 
     * @param request
     * @throws InterruptedException
     */
    @Override
    public RegisterResponse register(RegisterRequest request)
        throws InterruptedException {
        Channel channel = connect(BusinessType.REGISTER);
        if (channel != null && channel.isActive()) {
            ChannelPipeline pipeline = channel.pipeline();
            if (pipeline.get(DECODER_REGISTER) == null) {
                pipeline.addLast(DECODER_REGISTER, new ProtobufDecoder(
                    RegisterResponse.getDefaultInstance()));
            }

            if (pipeline.get(HANDLER_REGISTER) == null) {
                pipeline.addLast(HANDLER_REGISTER, new RegisterHandler());
            }
            RegisterHandler registerHandler = (RegisterHandler) pipeline
                .get(HANDLER_REGISTER);
            synchronized (registerHandler) {
                channel.writeAndFlush(request).sync();
                registerHandler.wait(TIMEOUT_IN_MILLIS);
            }
            RegisterResponse response = registerHandler.getResponse();
            if (response == null) {
                return null;
            }
            return response;
        } else {
            return null;
        }
    }

    /**
     * 登录
     * 
     * @param request
     * @return
     * @throws InterruptedException
     */
    @Override
    public LoginResponse login(LoginRequest request)
        throws InterruptedException {
        Channel channel = connect(BusinessType.LOGIN);
        if (channel != null && channel.isActive()) {
            ChannelPipeline pipeline = channel.pipeline();
            if (pipeline.get(DECODER_LOGIN) == null) {
                pipeline.addLast(DECODER_LOGIN, new ProtobufDecoder(
                    LoginResponse.getDefaultInstance()));
            }

            if (pipeline.get(HANDLER_LOGIN) == null) {
                pipeline.addLast(HANDLER_LOGIN, new LoginHandler());
            }
            LoginHandler loginHandler = (LoginHandler) pipeline
                .get(HANDLER_LOGIN);
            synchronized (loginHandler) {
                channel.writeAndFlush(request).sync();
                loginHandler.wait(TIMEOUT_IN_MILLIS);
            }
            LoginResponse response = loginHandler.getResponse();
            if (response == null) {
                return null;
            }
            return response;
        } else {
            return null;
        }
    }

    /**
     * 定位
     * <p>
     * 将自己位置信息发给服务器, 并接受服务器其他人的位置信息
     * 
     * @param request
     * @throws InterruptedException
     */
    @Override
    public LocateResponse locate(LocateRequest request)
        throws InterruptedException {
        Channel channel = connect(BusinessType.LOCATE);
        if (channel != null && channel.isActive()) {
            ChannelPipeline pipeline = channel.pipeline();
            if (pipeline.get(DECODER_LOCATE) == null) {
                pipeline.addLast(DECODER_LOCATE, new ProtobufDecoder(
                    LocateResponse.getDefaultInstance()));
            }

            if (pipeline.get(HANDLER_LOCATE) == null) {
                pipeline.addLast(HANDLER_LOCATE, new LocateHandler());
            }
            LocateHandler locateHandler = (LocateHandler) pipeline
                .get(HANDLER_LOCATE);
            synchronized (locateHandler) {
                channel.writeAndFlush(request).sync();
                locateHandler.wait(TIMEOUT_IN_MILLIS);
            }
            LocateResponse response = locateHandler.getResponse();
            if (response == null) {
                return null;
            }
            return response;
        } else {
            return null;
        }
    }

    /**
     * 添加好友
     * 
     * @param request
     * @throws InterruptedException
     */
    @Override
    public AddFriendResponse addFriend(AddFriendRequest request)
        throws InterruptedException {
        Channel channel = connect(BusinessType.ADD_FRIEND);
        if (channel != null && channel.isActive()) {
            ChannelPipeline pipeline = channel.pipeline();
            if (pipeline.get(DECODER_ADD_FRIEND) == null) {
                pipeline.addLast(DECODER_ADD_FRIEND, new ProtobufDecoder(
                    AddFriendResponse.getDefaultInstance()));
            }

            if (pipeline.get(HANDLER_ADD_FRIEND) == null) {
                pipeline.addLast(HANDLER_ADD_FRIEND, new AddFriendHandler());
            }
            AddFriendHandler addFriendHandler = (AddFriendHandler) pipeline
                .get(HANDLER_ADD_FRIEND);
            synchronized (addFriendHandler) {
                channel.writeAndFlush(request).sync();
                addFriendHandler.wait(TIMEOUT_IN_MILLIS);
            }
            AddFriendResponse response = addFriendHandler.getResponse();
            if (response == null) {
                return null;
            }
            return response;
        } else {
            return null;
        }
    }

    /**
     * 处理添加好友请求
     * 
     * @param request
     * @return
     * @throws InterruptedException
     */
    @Override
    public AcceptFriendResponse acceptFriend(AcceptFriendRequest request)
        throws InterruptedException {
        Channel channel = connect(BusinessType.ACCEPT_FRIEND);
        if (channel != null && channel.isActive()) {
            ChannelPipeline pipeline = channel.pipeline();
            if (pipeline.get(DECODER_ACCEPT_FRIEND) == null) {
                pipeline.addLast(DECODER_ACCEPT_FRIEND, new ProtobufDecoder(
                    AcceptFriendResponse.getDefaultInstance()));
            }

            if (pipeline.get(HANDLER_ACCEPT_FRIEND) == null) {
                pipeline.addLast(HANDLER_ACCEPT_FRIEND,
                    new AcceptFriendHandler());
            }
            AcceptFriendHandler acceptFriendHandler = (AcceptFriendHandler) pipeline
                .get(HANDLER_ACCEPT_FRIEND);
            synchronized (acceptFriendHandler) {
                channel.writeAndFlush(request).sync();
                acceptFriendHandler.wait(TIMEOUT_IN_MILLIS);
            }
            AcceptFriendResponse response = acceptFriendHandler.getResponse();
            if (response == null) {
                return null;
            }
            return response;
        } else {
            return null;
        }
    }
}
