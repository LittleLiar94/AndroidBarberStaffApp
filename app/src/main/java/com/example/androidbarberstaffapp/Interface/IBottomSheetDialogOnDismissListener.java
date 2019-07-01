package com.example.androidbarberstaffapp.Interface;

public interface IBottomSheetDialogOnDismissListener {
    // fromBottom mean we navigate this dialog from btn_finish of DoneServicesActivity.
    void onDismissBottomsheetDialog(boolean fromButton);

}
