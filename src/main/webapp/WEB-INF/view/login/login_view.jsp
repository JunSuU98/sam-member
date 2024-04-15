<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/global.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>

	<header>
		<h2>로그인</h2>
	</header>
	
	<main>
	
		<form action="/Login.me" method="post">

			<label for="member_id" class="form-label">아이디</label>
			<input type="text" id="member_id" name="member_id" class="form-control" aria-describedby="passwordHelpBlock">
				
			<label for="member_password" class="form-label">Password</label>
			<input type="password" id="member_password" name="member_password" class="form-control" aria-describedby="passwordHelpBlock">
				
			<button type="submit" class="btn btn-primary">로그인</button>
			<button type="reset" class="btn btn-danger">취소</button>
			
		</form>
	
	</main>

</body>
</html>