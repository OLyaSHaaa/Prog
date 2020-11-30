public class AllImpl extends Human implements All {


    private static String a;

    public AllImpl(String name) {
        setName(name);
    }


    public void see() {
        System.out.print(getName() + Th.NOW.getName() + "видели");
    }

    @Override
    public void wish() {
        System.out.println(Th.STH.getName() + " загадать");
    }

    @Override
    public void inFrontOf() {
        System.out.print("перед " + getName() + "ми ");
    }

    @Override
    public void want() {
        System.out.print(getName() + "м хотелось ");

    }

    @Override
    public void absSee(Ears ears, Hat hat, Boots boots) {
        System.out.print(", что это было сразу видно по его " + ears + hat + boots);
    }
    @FunctionalInterface
    interface doWish {
        String reverse();
    }
}

