<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<?php
/* 입력알고리즘

1. DB연결( 절차적 프로그램(mysqli) / 객체지향(new) / pdo)
2. 전송된 값을 요청
3. 입력 query 문 작성후 실행시킨다(insert 문)

*/

include_once("common.html");

$writer = $_POST["writer"];
$title = $_POST["title"];
$contents = $_POST["contents"];
$photo = $_POST["photo"];
$date = date("Y-m-d");


$query = "insert into port1_notice (writer,title,contents,filename,date, view) values ('$writer','$title','$contents','$photo','$date',0)";

$result = mysqli_query($conn, $query);

/*
	$result =$conn->query($query);
*/

if(!$result) {
	echo "error :".$query."<br>".mysqli_error($conn);
}

echo "<script>location.href='notice.html'</script>";

mysqli_close();

/*
	$conn->close();
*/
?>