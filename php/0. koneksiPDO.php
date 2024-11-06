<?php
    class database {
        private $server = "localhost";
        private $username = "root";
        private $password = "";
        private $databse = "inventory";

        function koneksidatabase(){
            try {
                $dbh = new PDO ('mysql:host='.$this->server;'dbname='.$this->username,$this->password,$this->databse);
                $dbh->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
                return $dbh;
            }
            catch (PDOException $e){
                print("terjadi kesalahan").$e->getMessage();
                die();
            }
        }
    }
    $d1 = new database();
    $database = $d1->koneksidatabase();
?>

