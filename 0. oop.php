<?php
class Barang {
    private $IdBarang;
    private $NamaBarang;
    private $JumlahBarang;
    private $conn;
    public database __construct(\PDO $database){
        $this->conn = $database;
    }
    function setIdBarang ($IdBarang){
        $this->Idbarang = $IdBarang;
    }
    function setNamaBarang ($NamaBarang){
        $this->Namabarang = $NamaBarang;
    }
    function setJumlahBarang ($JumlahBarang){
        $this->Jumlahbarang = $JumlahBarang;
    }
    function getIdBarang(){
        return $this->Idbarang;
    }
    function getNamaBarang(){
        return $this->Namabarang;
    }
    function getJumlahBarang(){
        return $this->Jumlahbarang;
    }
    function AddBarang(){
        try{
            $query = INSERT INTO Barang ('IdBarang','NamaBarang','JumlahBarang') VALUES (?,?,?);
            $prepareDB = $this->conn->prepare($query);
            $sqlAddBarang = $prepareDB->execute($this->Idbarang,$this->Namabarang,$this->Jumlahbarang);
        }
        catch(Exception $e){
            throw $e;
        }
    }
    function BarangList(){
        $query = SELECT * FROM Barang ORDER BY NamaBarang ASC;
        $prepareDB = $this->conn->prepare($query);
        $prepraeDB->execute();
        $BarangList = $prepraeDB->fetchAll();
    }
}