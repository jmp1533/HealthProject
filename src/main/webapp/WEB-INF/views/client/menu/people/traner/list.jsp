<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="wrap">
    <div class="page_list">
        <%--200*800사이즈로 이미지 넣을것 제작 --%>
            <div class="list_menu">
                <%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
                    <div class="list_0"
                        style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
                        피플
                    </div>
                    <div class="list_1" style="background-color: red;">
                        <%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
                            <a href="/client/menu/people/traner/list">트레이너 현황</a>
                            <%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
                    </div>
                    <div class="list_2">
                        <a href="/client/menu/people/user/list">헬스 프렌드 찾기</a>
                    </div>
            </div>
            <img>
    </div>
    <div class="main">
        <div class="list">
            <table>
                <tr>
                    <c:forEach var="dto" items="${list}">
                        <c:set var="i" value="${i+1}" />
                        <td style="border-style: outset;"><a
                                href="/client/menu/people/traner/view?id=${dto.t_id}">
                                <table style="border: none;">
                                    <tr>
                                        <td align="center">
                                            <img src="/resources/upload/${dto.t_img}" width="125px"
                                                height="150px" />
                                        </td>
                                        <td>
                                            이름 :${dto.t_name}<br />
                                            소속 : ${dto.t_company}<br />
                                            전화번호:${dto.t_phone}
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </a>
                        </td>
                        <c:if test="${i%2==0}">
                <tr></tr>
                </c:if>
                </c:forEach>
                </tr>
            </table>
        </div>

        <div class="list_number" style="text-align: center;">
            <!-- 페이징처리 -->
            <c:choose>
                <c:when test="${pu.startPageNum>10 }">
                    <a href="/client/menu/people/traner/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
                </c:when>
                <c:otherwise>
                    [이전]
                </c:otherwise>
            </c:choose>

            <c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
                <c:choose>
                    <c:when test="${i==pu.pageNum }">
                        <!--현재페이지만 빨간색으로 표시-->
                        <a href="/client/menu/people/traner/list?pageNum=${i}"> <span style="color: red">[${i
                                }]</span>
                        </a>
                    </c:when>
                    <c:otherwise>
                        <a href="/client/menu/people/traner/list?pageNum=${i}">[${i }]</a>
                    </c:otherwise>
                </c:choose>
            </c:forEach>

            <c:choose>
                <c:when test="${pu.endPageNum<pu.totalPageCount}">
                    <a href="/client/menu/people/traner/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
                </c:when>
                <c:otherwise>
                    [다음]
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</div>
</body>