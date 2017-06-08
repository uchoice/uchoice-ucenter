package com.uchoice.ucenter.ui.support;

import java.util.List;


public interface MenuRepository {
	
	public List<Menu> loadAllMenus();
	
	public List<Menu> loadUserMenus(long userId);
	
	public void initMenus();

}
