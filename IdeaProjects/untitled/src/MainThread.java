public class MainThread implements CallBack{
    public MainThread(ChildThread childThread){
        childThread.requestNetWork(MainThread.this);
    }

    @Override
    public void show(StringBuilder result) {
        System.out.println(result.append("good luck"));
    }
}
