package com.oracle.anc.fmwpoc.sf.model.views.client;

import com.oracle.anc.fmwpoc.sf.model.views.common.OpportunitiesView;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 27 08:39:17 EET 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OpportunitiesViewClient extends ViewUsageImpl implements OpportunitiesView {
    /**
     * This is the default constructor (do not remove).
     */
    public OpportunitiesViewClient() {
    }

    public void refreshAccountsLOV() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"refreshAccountsLOV",null,null);
        return;
    }
}
