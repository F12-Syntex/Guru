package com.guru.commands.shop.items;

import com.guru.userdata.UserModel;

import net.dv8tion.jda.api.entities.User;

@ShopMeta(cost = 1500, name = {"cRole"}, emoji = ":label:", description = "Create a custom role with it's own dedicated view ( does not include custom colours )", id = 1, usage = {";useitem 1 <name>"})
public class CustomRole extends ShopItem{

	@Override
	public void onBuyEvent(User user, UserModel profile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUseEvent(User user, UserModel profile) {
		// TODO Auto-generated method stub
		
	}

}
