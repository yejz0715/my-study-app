
$(document).ready(function() {

	console.log('start!')

});





// 아이디 중복 확인 
function duplicateId() {
	//console.log(`duplicateId()...`) 콘솔로그 많이 사용하기

	var userId = $("#id").val();
	if (userId == 'admin') $('#guide_id').css("color", "red").text("이미 등록된 아이디 입니다. 다시 입력해주세요!")
	else if (userId.length != 0) $('#guide_id').css("color", "#038900").text("사용가능한 아이디입니다.")
	else alert(`아이디를 입력하세요!`)
}