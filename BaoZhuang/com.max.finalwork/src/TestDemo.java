import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoodsManage goodsManage = new GoodsManage();
        ShoppingCart shoppingCart = new ShoppingCart();
        Menu menu = new Menu();  // 实例化 Menu 对象



        while (true) {
            menu.mainMenu();  // 显示主菜单
            System.out.print("请选择功能: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // 进入商品管理菜单
                    while (true) {
                        menu.managerMenu();  // 显示商品管理菜单
                        System.out.print("请选择功能: ");
                        String managerChoice = scanner.nextLine();

                        switch (managerChoice) {
                            case "1":
                                goodsManage.importGoods();
                                System.out.println("商品信息已导入。");
                                break;
                            case "2":
                                goodsManage.displayAllGoods();
                                break;
                            case "9":
                                System.out.println("返回主菜单。");
                                break;  // 返回主菜单
                            default:
                                System.out.println("无效选择，请重新输入。");
                        }

                        if ("9".equals(managerChoice)) {
                            break;  // 跳出商品管理循环，返回主菜单
                        }
                    }
                    break;

                case "2":
                    // 进入购物车管理菜单
                    while (true) {
                        menu.cartMenu();  // 显示购物车管理菜单
                        System.out.print("请选择功能: ");
                        String cartChoice = scanner.nextLine();

                        switch (cartChoice) {
                            case "1":
                                shoppingCart.addGoodsInCart(goodsManage);
                                break;
                            case "2":
                                shoppingCart.updateNumInCart();
                                break;
                            case "3":
                                shoppingCart.displayAllInCart();
                                break;
                            case "4":
                                shoppingCart.settleAccounts();
                                break;
                            case "9":
                                System.out.println("返回主菜单。");
                                break;  // 返回主菜单
                            default:
                                System.out.println("无效选择，请重新输入。");
                        }

                        if ("9".equals(cartChoice)) {
                            break;  // 跳出购物车管理循环，返回主菜单
                        }
                    }
                    break;

                case "0":
                    System.out.println("谢谢使用，再见！");
                    return;  // 退出程序

                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }
}
