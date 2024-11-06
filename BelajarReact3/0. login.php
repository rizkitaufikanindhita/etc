<?php
session_start();

// koneksi ke database
$conn = mysqli_connect('localhost', 'root', '', 'dbname');

// query untuk mencari user
$query = "SELECT * FROM user WHERE username='$username' AND password='$password'";
$result = mysqli_query($conn, $query);

//eksekusi query
$result = mysqli_query($conn, $query);

//cek apakah user terdaftar
if (mysqli_num_rows($result) > 0) {

    //jika user terdaftar, redirect ke halaman dashboard
    header("Location: dashboard.php");
} else {

    //jika usertidak terdaftar, tampilkan pesan error
    echo "username dan/atau password salah";
}

?>

<!DOCTYPE html