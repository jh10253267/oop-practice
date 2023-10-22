package org.example;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItemList;

    public Menu(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;

    }

    public MenuItem choose(String name) {
        return this.menuItemList.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 메뉴 이름입니다."));
    }

}
