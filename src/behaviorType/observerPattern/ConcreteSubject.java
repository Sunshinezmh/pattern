package behaviorType.observerPattern;

/**
 * @Classname ConcreteSubject
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:55
 */
public class ConcreteSubject extends Subject {

    public void Attach(Observer observer){
        observersList.add(observer);
    }

    public void Detach(Observer observer) {
        observersList.remove(observer);
    }

    public void Notify(){
        for (Observer observer : observersList) {
            observer.Update();
        }
    }
}
