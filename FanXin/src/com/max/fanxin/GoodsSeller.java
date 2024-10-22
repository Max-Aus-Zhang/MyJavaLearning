package com.max.fanxin;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goodsO ){
        for(Goods goods : goodsO){
            goods.sell();
        }
    }
}
