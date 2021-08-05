<?php

include 'koneksi.php';
$items = array();
$res = mysqli_query($con, "select * from pasiencovid");
if (mysqli_num_rows($res) > 0)
{
	while($row = mysqli_fetch_object($res))
	{
		array_push($items, $row);
	}
	$result["pasiencovid"] = $items;
}
else
{
	$result["pasiencovid"] = "Tidak ada data";
}
echo json_encode($result);

?>