/* 
 **********************************************************************
 * Copyright (c) 2014, xianneng.lin@gmail.com All Rights Reserved. 
 **********************************************************************
 */
package org.xiaoxiancai.imhere.server.business;

import io.netty.channel.ChannelHandlerContext;

import org.xiaoxiancai.imhere.common.protos.business.AddFriendRequestProtos.AddFriendRequest;

/**
 * 添加朋友处理器
 *
 * @author xiannenglin
 */
public class AddFriendHandler extends AbstractBusinessHandler {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		if (!(msg instanceof AddFriendRequest)) {
			return;
		}
		AddFriendRequest request = (AddFriendRequest) msg;
		int fromUserId = request.getFromUserId();
	}
}
