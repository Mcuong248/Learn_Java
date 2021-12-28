public class Repository {
    public static ServiceEmployee<Waiter> addWaiter() {
        ServiceEmployee<Waiter> listWaiter = new ServiceEmployee<>();
        listWaiter.add(new Waiter(1, "Cường", 22, 7000000, Type.Waiter, 2100000));
        listWaiter.add(new Waiter(2, "Thanh", 28, 5000000, Type.Waiter, 1200000));
        listWaiter.add(new Waiter(3, "Ngọc", 27, 6000000, Type.Waiter,1200000));
        return listWaiter;
    }

    public static ServiceEmployee<Kitchen> addKitchen() {
        ServiceEmployee<Kitchen> listKitchen = new ServiceEmployee<>();
        listKitchen.add(new Kitchen(4, "Minh", 22, 11000000, Type.Kitchen, 4100000));
        listKitchen.add(new Kitchen(5, "Lan", 38, 9000000, Type.Kitchen, 3000000));
        listKitchen.add(new Kitchen(6, "Hoa", 30, 10000000, Type.Kitchen, 3500000));
        return listKitchen;
    }
}

