<?php

class BD {

    private $server = "localhost";
    private $user = "root";
    private $pass = "";
    private $bd = "congreso";
    private $conn;

    public function __construct() {
        $this->conn = new mysqli($this->server, $this->user, $this->pass, $this->bd);

        // Check connection
        if ($this->conn->connect_error) {
            die("Connection failed: " . $this->conn->connect_error);
        }
    }

    public function select($sql, $type = "", $p1 = "", $p2 = "", $p3 = "", $p4 = "", $p5 = "", $p6 = "", $p7 = "") {
        $stmt = $this->conn->prepare($sql);
        if ($p7 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5, $p6, $p7);
        } else if ($p6 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5, $p6);
        } else if ($p5 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5);
        } else if ($p4 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4);
        } else if ($p3 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3);
        } else if ($p2 <> "") {
            $stmt->bind_param($type, $p1, $p2);
        } 
        $stmt->execute();
        $registros = $stmt->get_result();
        $resut = array();
        while ($reg = $registros->fetch_assoc()) {
            $resut[] = $reg;
        }
        return $resut;
    }

    public function insert($sql, $type = "", $p1 = "", $p2 = "", $p3 = "", $p4 = "", $p5 = "", $p6 = "", $p7 = "") {
        $stmt = $this->conn->prepare($sql);
        if ($p7 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5, $p6, $p7);
        } else if ($p6 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5, $p6);
        } else if ($p5 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4, $p5);
        } else if ($p4 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3, $p4);
        } else if ($p3 <> "") {
            $stmt->bind_param($type, $p1, $p2, $p3);
        } else if ($p2 <> "") {
            $stmt->bind_param($type, $p1, $p2);
        } else {
            $stmt->bind_param($type, $p1);
        }
        if (!$stmt->execute()) {
            var_dump($stmt->error);
        }
    }


}
