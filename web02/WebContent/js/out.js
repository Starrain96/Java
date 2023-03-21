function 로그인() {
	id2 = 'root';
	prompt('아이디를 입력')
	if (id==id2) {
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1 = prompt('n1을 입력')
	n2 = prompt('n2를 입력')
	if ( n1>n2) {
		alert('n1이 더 큽니다.')
	} else if(n1<n2) {
		alert('n2가 더 큽니다.')
	} else {
		alert('n1, n2는 값이 같습니다.')
	}
}

function 기분비교() {
	n1 = prompt('친구 기분을 입력')
	n2 = prompt('나의 기분을 입력')
	if ( n1==n2) {
		alert('기분이 같습니다.')
	} else if(n1!=n2) {
		alert('기분이 다릅니다.')
    }
}