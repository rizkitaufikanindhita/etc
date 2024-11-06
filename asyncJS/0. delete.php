<?php
include "../../class/config.php";
include "../../class/Roles.php";
    if (isset($_GET['id']));
    {
        $RolesDelete = new Roles($database);
        $RolesDelete->RolesDelete($_GET['id']);
        header ("location:index.php");
    }
?>
