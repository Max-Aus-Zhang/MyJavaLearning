public class GoodsInCart {

    Goods itemsInCart;
    int itemsNum;

    public Goods getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(Goods itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public int getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(int itemsNum) {
        this.itemsNum = itemsNum;
    }

    public GoodsInCart() {
    }

    public GoodsInCart(Goods itemsInCart, int itemsNum) {
        this.itemsInCart = itemsInCart;
        this.itemsNum = itemsNum;
    }

    public String toString() {
        return "商品ID: " + itemsInCart.getGoodsId() +
                ", 名称: " + itemsInCart.getGoodsName() +
                ", 价格: " + itemsInCart.getGoodsPrice() +
                ", 描述: " + itemsInCart.getGoodsDesp() +
                ", 数量: " + itemsNum;
    }
}
