import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ShoppingCart {


    Map <String,GoodsInCart> goodsInCart = new HashMap<String,GoodsInCart>();
    Scanner scanner=new Scanner(System.in);

    public Map<String, GoodsInCart> getGoodsInCart() {
        return goodsInCart;
    }

    public void setGoodsInCart(Map<String, GoodsInCart> goodsInCart) {
        this.goodsInCart = goodsInCart;
    }
//添加商品到购物车
    public void addGoodsInCart(GoodsManage goodsManage) {
       goodsManage.displayAllGoods();
        System.out.println("请输入商品编号");
        String goodsId=scanner.nextLine();

//确认输入的ID和数据库中的匹配
        Set <Goods> goodsSet=goodsManage.getGoodsSet();
        Goods selectedGoods = null;
        for (Goods goods : goodsSet) {
            if (goods.getGoodsId().equals(goodsId)) {
                selectedGoods = goods;
                break;
            }
        }
//确认购买商品的数量
        if(selectedGoods!=null){
            System.out.println("请输入购买数量");
            int num=scanner.nextInt();
            scanner.nextLine(); // 消费掉换行符
//实例化GoodsInCart类商品并且把之前获取的商品存到hashMap里
            GoodsInCart itemDetail=new GoodsInCart(selectedGoods,num);
            goodsInCart.put(selectedGoods.getGoodsId(),itemDetail );//goodsInCart是开头建的Mapset
            System.out.println("商品已经添加到购物车:"+itemDetail);
    }else {
            System.out.println("未找到商品");
        }
    }

        //修改hashMap中的商品信息
    public void updateNumInCart(){
            System.out.println("请输入要修改的商品编号:");
            String alterId=scanner.nextLine();

        String keyToRemove=null;
            for(GoodsInCart goodsInCart:goodsInCart.values()){
                if (goodsInCart.getItemsInCart().getGoodsId().equals(alterId)){
                    System.out.println("请输入新的商品数量:");
                    int num=scanner.nextInt();
                    scanner.nextLine(); // 消费掉换行符
//                    输入0时候从购物车中移除
                    if(num==0){
                        keyToRemove=goodsInCart.getItemsInCart().getGoodsId();
                    }
                    else{
                    goodsInCart.setItemsNum(num);
                    System.out.println("商品编号"+alterId+"数量已经修改为"+goodsInCart.getItemsNum());
                    }
                    break;

                }
            }
            if(keyToRemove!=null){
                goodsInCart.remove(keyToRemove);
                System.out.println("商品"+alterId+"已经移除");
            }

        }

//显示hashmap
        public void displayAllInCart(){
            if (goodsInCart.isEmpty()) {
                System.out.println("购物车是空的");
            }
            for(Map.Entry<String,GoodsInCart> goodsInCart:goodsInCart.entrySet()){
                GoodsInCart itemDetail=goodsInCart.getValue();
                Goods goods=itemDetail.getItemsInCart();

                System.out.println("商品ID:"+goods.getGoodsId()+",名称:"+goods.getGoodsName()+",价格:"+goods.getGoodsPrice()+",描述:"+goods.getGoodsDesp()+",数量"+itemDetail.getItemsNum());


            }
        }
//计算总价
        public void settleAccounts(){
            double totalPrice = 0.0;

            for (GoodsInCart goodsInCart : goodsInCart.values()) {
                // 计算每个商品的总价，并累加到总价中
                double itemTotal = goodsInCart.getItemsNum() * goodsInCart.getItemsInCart().getGoodsPrice();
                totalPrice += itemTotal;
            }


            System.out.println("购物车中所有商品的总价为: " + totalPrice + " 元");
        }


}

