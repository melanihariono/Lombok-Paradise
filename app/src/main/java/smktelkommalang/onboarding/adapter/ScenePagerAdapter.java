package smktelkommalang.onboarding.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import smktelkommalang.onboarding.fragment.BaseSceneFragment;
import smktelkommalang.onboarding.fragment.SceneOneFragment;
import smktelkommalang.onboarding.fragment.SceneThreeFragment;
import smktelkommalang.onboarding.fragment.SceneTwoFragment;

/**
 * Created by Melanihariono on 4/19/2017.
 */

public class ScenePagerAdapter extends FragmentPagerAdapter {

    private SceneTransformer mSceneTransformer;

    public ScenePagerAdapter(@NonNull FragmentManager supportFragmentManager,
                             @NonNull SceneTransformer sceneTransformer) {
        super(supportFragmentManager);

        mSceneTransformer = sceneTransformer;
    }

    @Override
    public Fragment getItem(int position) {
        BaseSceneFragment baseSceneFragment = null;

        switch (position) {
            case 0:
                baseSceneFragment = SceneOneFragment.newInstance(position);
                break;
            case 1:
                baseSceneFragment = SceneTwoFragment.newInstance(position);
                break;
            case 2:
                baseSceneFragment = SceneThreeFragment.newInstance(position);
                break;
        }

        mSceneTransformer.addSceneChangeListener(baseSceneFragment);
        return baseSceneFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
