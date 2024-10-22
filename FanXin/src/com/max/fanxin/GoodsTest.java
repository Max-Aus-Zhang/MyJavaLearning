package com.max.fanxin;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book());
        booksList.add(new Book());


        List<Clothes> clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes());
        clothesList.add(new Clothes());

        List<Shoes> goodsShoes= new ArrayList<Shoes>();
        goodsShoes.add(new Shoes());
        goodsShoes.add(new Shoes());
        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(booksList);

    }
}
