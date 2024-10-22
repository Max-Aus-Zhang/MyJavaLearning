import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Goods {
    private String goodsId;
    private String goodsName;
    private Double goodsPrice;
    private String goodsDesp;

    // getter and setter
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

//    构造方法
    public Goods(){

    }

    public Goods(String goodsId, String goodsName, Double goodsPrice, String goodsDesp) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsDesp = goodsDesp;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;
        return Objects.equals(goodsId, goods.goodsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId);
    }

    @Override
    public String toString() {
        return "商品信息{" +
                "编号:'" + goodsId + '\'' +
                ", 名称:'" + goodsName + '\'' +
                ", 价格:" + goodsPrice +
                ", 商品描述='" + goodsDesp + '\'' +
                '}';
    }

    public Set goodsData(){
        Goods one = new Goods("goods001","水杯", 56.0,"不锈钢水杯");
        Goods two = new Goods("goods002","饮水机",299.0,"不锈钢水杯");
        Goods three = new Goods("goods003","笔记本电脑",4999.0,"15存笔记本电脑");
        Goods four = new Goods("goods004","手机",2300.0,"Android手机");
        Goods five = new Goods("goods002","水机",199.0,"不锈钢水杯");
        Set set=new HashSet();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        return set;
    }
}
