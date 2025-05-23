<?php

require __DIR__."/vendor/autoload.php";

use PhpOffice\PhpSpreadsheet\Spreadsheet;
use PhpOffice\PhpSpreadsheet\Writer\Xlsx;

$spreadsheet = new Spreadsheet();
$writer = new Xlsx($spreadsheet);
$activeWorksheet = $spreadsheet->getActiveSheet();

for ($i=0; $i < 10; $i++) { 
   $activeWorksheet->setCellValue("A".$i, $i);
   $activeWorksheet->setCellValue("B".$i, $i);
   $activeWorksheet->setCellValue("C".$i, $i);
}
$writer->save("teste.xlsx");

$inputFileName = 'teste.xlsx';

$reader = new \PhpOffice\PhpSpreadsheet\Reader\Xlsx();
$spreadsheet = $reader->load($inputFileName);

$activeWorksheet = $spreadsheet->getActiveSheet();