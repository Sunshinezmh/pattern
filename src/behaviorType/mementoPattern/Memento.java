package behaviorType.mementoPattern;

/**
 * 备忘录（光盘）
 * @Classname Memento
 * @Auther sunshinezhang
 * @Date 2019/10/1 18:10
 */
class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
