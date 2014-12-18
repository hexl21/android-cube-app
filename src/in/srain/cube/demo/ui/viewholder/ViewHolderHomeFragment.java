package in.srain.cube.demo.ui.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import in.srain.cube.demo.R;
import in.srain.cube.demo.ui.fragment.DemoBlockMenuFragment;

import java.util.ArrayList;

public class ViewHolderHomeFragment extends DemoBlockMenuFragment {

    @Override
    protected void addItemInfo(ArrayList<MenuItemInfo> itemInfos) {
        itemInfos.add(newItemInfo(R.string.cube_demo_view_holder_top_class, "#4d90fe", new OnClickListener() {

            @Override
            public void onClick(View v) {
                getContext().pushFragmentToBackStack(TopLevelClassDemoFragment.class, null);
            }
        }));

        itemInfos.add(newItemInfo(R.string.cube_demo_view_holder_inner_static_class, "#4d90fe", new OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        }));

        itemInfos.add(newItemInfo(R.string.cube_demo_view_holder_inner_instance_class, "#4d90fe", new OnClickListener() {

            @Override
            public void onClick(View v) {
                getContext().pushFragmentToBackStack(EnclosingInnerClassFragment.class, null);
            }
        }));
    }

    @Override
    protected void setupViews(View view) {
        setHeaderTitle(R.string.cube_demo_view_holder);
        super.setupViews(view);
    }
}
