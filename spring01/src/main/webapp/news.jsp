<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "data/rank.json",
				success : function(doc) {
					list = doc.rank
					//alert(list.length)
					for (i = 0; i < list.length; i++) {
						n = list[i].name
						t = list[i].tel
						$('#result').append(n + ",  " + t + "<br>")
					}//for
				}//success
			})//ajax
		})//b1

		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "resources/data/MOCK_DATA.json",
				success : function(doc) {
					list = doc
					//alert(list.length)
					for (i = 0; i < list.length; i++) {
						id = list[i].id
						email = list[i].email
						$('#result').append(id + ",  " + email + "<br>")
					}//for
				}//success
			})//ajax
		})//b2

		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Frss.hankyung.com%2Ffeed%2Fhei.xml&api_key=prqczr0bmphtkjxmxollaz9twackkjbkvmkuzpbi ",
				success : function(doc) {
				//alert('성공' + doc)
				list = doc.items
				//alert(list.length)
				for (i = 0; i < list.length; i++) {
					t = list[i].title
					l = list[i].link
					p = list[i].pubDate
					a = list[i].author
					$('#result').append(
						"<a href=" + l + ">"
						+ t + "</a>"
						+ p + " " + a
						+ "<br>")
				}
				}//success
				})//ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fnews.sbs.co.kr%2Fnews%2FSectionRssFeed.do%3FsectionId%3D02%26plink%3DRSSREADER&api_key=prqczr0bmphtkjxmxollaz9twackkjbkvmkuzpbi ",
				success: function(doc) {
					list = doc.items
					for ( i = 0; i < list.length; i++) {
						t = list[i].title
						l = list[i].link
						img = list[i].thumbnail
						d = list[i].description
						$('#result').append("<img src="+img+" width=200 height=200>"+
								"<a href="+l+">"+t+"</a>"+ d + "<br>")
						
					}//for
				}//success
			}) //ajax
		})//b4
		
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.renews.co.kr%2Frss%2FS1N3.xml&api_key=prqczr0bmphtkjxmxollaz9twackkjbkvmkuzpbi " ,
				success : function(doc) {
					list = doc.items
					for (i = 0; i < list.length; i++) {
						t = list[i].title
						l = list[i].link
						p = list[i].pubDate
						d = list[i].description
						$('#result').append("<a href="+l+">"+t+"</a>"+"<br>"
								            +p+"<br>"
								            +d+"<hr color = 'red'>"
								            <%if(session.getAttribute("id")!=null){ %>
								            +
						"댓글 달기 : " + "<input name='reply'><button>댓글달기</button><br><hr color = 'red'>"
						<%}%>
						)
								            
						
					}
				}
					
			})//ajax
		})//b5
	})
</script>
</head>
<body style="background: #a3b6d4">
	<hr color="red">
	<button id="b3" style="background: blue">한국경제(연예)</button>
	<button id="b4" style="background: yellow">SBS뉴스(경제)</button>
	<button id="b5" style="background: pink">부동산신문(투자리포트)</button>
	<hr color="red">
	<div id="result"></div>

</body>
</html>