public class ChildThread {
    public void requestNetWork(CallBack callBack){
        System.out.println("我开始耗时操作了~");
        long time = 3000l;
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        callBack.show(new StringBuilder("good_child"));
    }
}
