import java.util.Set;

public class GoodsManage {
    Set  GoodsSet;



    public Set getGoodsSet() {
        return GoodsSet;
    }

    public void setGoodsSet(Set goodsSet) {
        GoodsSet = goodsSet;
    }
    public GoodsManage() {

    }
//    商品信息导入Set
    public void importGoods(){
        Goods goods = new Goods();
        setGoodsSet(goods.goodsData());
    }
//    显示所有商品信息
    public void displayAllGoods(){
        for(Object o : GoodsSet){
            System.out.println(o);
        }
    }
}
