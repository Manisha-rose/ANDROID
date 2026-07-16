<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="103dp"
        android:layout_height="36dp"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="287dp"
        android:layout_marginBottom="16dp"
        android:text="Username"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/textView2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.75" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="90dp"
        android:layout_height="38dp"
        android:layout_marginEnd="15dp"
        android:text="Password"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/editTextTextPassword3"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.542" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="174dp"
        android:layout_marginTop="57dp"
        android:layout_marginEnd="193dp"
        android:layout_marginBottom="57dp"
        android:fontFamily="cursive"
        android:text="login"
        android:textSize="34sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextTextPassword2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.866"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="161dp"
        android:layout_marginTop="35dp"
        android:layout_marginEnd="162dp"
        android:layout_marginBottom="216dp"
        android:text="Login"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPassword3"
        app:layout_constraintVertical_bias="1.0" />

    <EditText
        android:id="@+id/editTextTextPassword2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="56dp"
        android:layout_marginTop="80dp"
        android:layout_marginEnd="26dp"
        android:layout_marginBottom="80dp"
        android:ems="10"
        android:hint="enter username"
        android:inputType="textPassword"
        app:layout_constraintBottom_toTopOf="@+id/editTextTextPassword3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toEndOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <EditText
        android:id="@+id/editTextTextPassword3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="341dp"
        android:ems="10"
        android:hint="enter password"
        android:inputType="textPassword"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.812"
        app:layout_constraintStart_toEndOf="@+id/textView2"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPassword2"
        app:layout_constraintVertical_bias="0.682" />

</androidx.constraintlayout.widget.ConstraintLayout>
