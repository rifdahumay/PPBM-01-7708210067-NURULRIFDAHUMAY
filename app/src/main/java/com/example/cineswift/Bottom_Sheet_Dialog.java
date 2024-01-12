package com.example.cineswift;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Bottom_Sheet_Dialog  extends BottomSheetDialogFragment {

    BottomSheetBehavior bBehavior;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.bottom_sheet_persistent, null);

        EditText editTextEmail = view.findViewById(R.id.edit_email);
        EditText editTextPassword = view.findViewById(R.id.edit_pass);
        Button btnSheet = view.findViewById(R.id.btn_login);

        btnSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                if (isValidCredentials(email, password)) {
                    Intent intent;
                    intent = new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                    dismiss();
                } else {
                    Toast.makeText(getContext(), "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        dialog.setContentView(view);
        bBehavior = BottomSheetBehavior.from((View) view.getParent());
        return dialog;
    }

    @Override
    public void onStart() {
        super.onStart();
        bBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    private boolean isValidCredentials(String email, String password) {
        return !email.isEmpty() && !password.isEmpty();
    }
}
