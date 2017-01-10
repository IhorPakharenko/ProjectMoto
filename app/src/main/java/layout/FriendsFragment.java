package layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alex.projectmoto.R;

import java.util.ArrayList;
import java.util.List;


public class FriendsFragment extends Fragment {





    public FriendsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List list = new ArrayList();

        for (int i=0; i<10;i++){
            UserModel user = new UserModel();
            list.add(user);
           // Log.d("log", "onViewCreated: "+i);
        }

        FriendsAdapter adapter = new FriendsAdapter(list);

        RecyclerView rv = (RecyclerView)view.findViewById(R.id.friends_list);

        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        rv.setAdapter(adapter);
    }
}
