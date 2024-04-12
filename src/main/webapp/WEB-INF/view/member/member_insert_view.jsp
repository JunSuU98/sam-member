<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/global.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>

	<header>
		<h1>회원 가입</h1>
	</header>
	
	<main>
	
		<form action="/MemberInsert.me" method="post">
		
		  <div class="mb-3 row">
			<label for="member_id" class="col-sm-2 col-form-label">아이디</label>
			<div class="col-sm-10">
			  <input type="text" class="form-control" id="member_id" name="member_id">
			</div>
		  </div>	
		
		  <div class="mb-3 row">
			<label for="inputPassword" class="col-sm-2 col-form-label">비밀번호</label>
			<div class="col-sm-10">
			  <input type="password" class="form-control" id="inputPassword" name="member_password">
			</div>
		  </div>	
		
		  <div class="mb-3 row">
			<label for="member_name" class="col-sm-2 col-form-label">이름</label>
			<div class="col-sm-10">
			  <input type="text" class="form-control" id="member_name" name="member_name">
			</div>
		  </div>
		  
		  <div class="mb-3 row">
			<label for="member_email" class="col-sm-2 col-form-label">이메일</label>
			<div class="col-sm-10">
			  <input type="text" class="form-control" id="member_email" name="member_email">
			</div>
		  </div>
		  
		  <div class="mb-3 row">
			<label for="member_phone" class="col-sm-2 col-form-label">전화 번호</label>
			<div class="col-sm-10">
			  <input type="text" class="form-control" id="member_phone" name="member_phone">
			</div>
		  </div>
		  
		  <div class="mb-3 row">
			<label for="member_address" class="col-sm-2 col-form-label">주소</label>
			<div class="col-sm-10">
			  <input type="text" class="form-control" id="member_address" name="member_address">
			</div>
		  </div>
		  
		  <div class="mb-3 row">
			<label for="member_birth" class="col-sm-2 col-form-label">생년월일</label>
			<div class="col-sm-10">
			  <input type="date" class="form-control" id="member_birth" name="member_birth">
			</div>
		  </div>
		  
		  <input type="hidden" class="form-control" id="member_create" name="member_create">
		  <script type="text/javascript">
		  	document.getElementById('member_create').value = new Date().toISOString().split('T')[0];
		  </script>

		  <div class="col-auto">
			<button type="submit" class="btn btn-primary mb-3">회원가입</button>
			<button type="reset" class="btn btn-danger mb-3">취소</button>
		  </div> 
		  
		</form>

	</main>

</body>
</html>