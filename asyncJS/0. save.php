<?php
// memanggil koneksi database
include "../../class/config.php";
include "../../class/Roles.php";
// mulai penyimpanan
if (isset($_POST['simpan']));
{
$AddRoles = new Roles ($database);
$AddRoles->setNamaRoles($_POST["NamaRoles"]);
$AddRoles->setKeterangan(@_POST[“Keterangan”]);
$AddRoles->AddRoles();
header ("location:index.php");
}
?>