package comn.example.administrator.news.mvp.presenter;

import comn.example.administrator.news.mvp.view.IUserView;

/**
 * Created by Administrator on 2017/3/14.
 */

public class UserPresent {
    IUserView iUserView;
    public UserPresent(IUserView iUserView){
        this.iUserView=iUserView;
    }
    public void showRefresh(){

    }
public void updateDate(int position){
    iUserView.updateDate(position);

}
public void addTabItem(){
    iUserView.addTabItem();

}



}
