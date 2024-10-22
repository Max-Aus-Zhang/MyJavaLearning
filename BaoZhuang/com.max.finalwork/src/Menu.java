public class Menu  {

//    no-argument constructor
    public Menu() {

    }

    public void mainMenu() {
        System.out.println("***************");
        System.out.println("   **主菜单**   ");
        System.out.println("   1--商品管理   ");
        System.out.println("   2--购物车   ");
        System.out.println("   0--退出   ");
        System.out.println("***************");
    }

    public void managerMenu(){
        System.out.println("***************************");
        System.out.println("   **商品管理**   ");
        System.out.println("   1--商品信息导入   ");
        System.out.println("   2--显示所有商品的信息   ");
        System.out.println("   9--返回上一级菜单   ");
        System.out.println("***************************");
    }

    public void cartMenu(){
        System.out.println("***************************");
        System.out.println("   **购物车管理**   ");
        System.out.println("   1--添加商品到购物车   ");
        System.out.println("   2--修改购物车中的商品数量   ");
        System.out.println("   3--显示购物车中的所有商品信息   ");
        System.out.println("   4--结算");
        System.out.println("   9--返回上一级菜单");
        System.out.println("***************************");
    }
}
