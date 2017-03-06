package com.wiseyep.tubebaby.baby.activity.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
public class HomeHot {

    private List<PagerBean> pager;

    public List<PagerBean> getPager() {
        return pager;
    }

    public void setPager(List<PagerBean> pager) {
        this.pager = pager;
    }

    public static class PagerBean {
        /**
         * params : http://i.zeze.com/attachment/forum/201605/06/214815xnd5dz5t58fndt85.jpg
         */

        private String params;

        public String getParams() {
            return params;
        }

        public void setParams(String params) {
            this.params = params;
        }
    }
}
