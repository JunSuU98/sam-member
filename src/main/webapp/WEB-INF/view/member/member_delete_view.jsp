<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴 페이지</title>
</head>
<body>

	<form action="/MemberDelete.me" method="post">

		<h2>정말 회원탈퇴 하시겠습니까?</h2>
	
		<input type="hidden" id="member_number" name="member_number" value="${param.member_number}">
		
		<button type="submit" class="btn btn-primary">회원 탈퇴</button>
		<button type="button" class="btn btn-danger">
			<a href="/MemberSelectDetail.me?member_number=${param.member_number}"> 돌아가기 </a>
		</button>
	
	</form>

</body>
</html>