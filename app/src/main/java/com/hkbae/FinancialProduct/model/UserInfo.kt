package com.hkbae.FinancialProduct.model

import java.time.LocalDate

class UserInfo {

    var productType : Int =0 //정기예금 = 0, 적금=1
    var months : Int=0 // 가입기간(개월)
    var amounts : Int=0 //월 납입금액(원) 또는 예치금(원)
    var joinPath =arrayOfNulls<String>(4) // 가입경로 0.모바일 1.영업점 2.인터넷뱅킹 3.콜센터
    var sex:Int=1 //1.남자 2.여자
    var born :LocalDate?=null //생년월일
    var age :Int=0 //만 나이
    var cities= mutableSetOf<City>() //은행방문 가능지역
    var conditions =arrayOfNulls<String>(7) //추가조건
    //0.기초생활수급자 1.소년소녀가장 2.북한이탈주민 3.결혼이민자 4.근로장려금수급자 5.한부모가족지원 보호대상자 6.차상위계층 대상자

    enum class City(val cityName:String){
        SEOUL("서울"),BUSAN("부산"),DAEGU("대구"),INCHEON("인천"),
        GWANGJU("광주"),DAEJEON("대전"),ULSAN("울산"),GYEONGGI("경기"),
        GANGWON("강원"),CHUNGBUK("충북"),CHUNGNAM("충남"),JEONBUK("전북"),
        JEONNAM("전남"),GYEONGBUK("경북"),GYEONGNAM("경남"),JEJU("제주")
    }

    fun addJoinPath(position:Int){
        when(position){
            0-> joinPath[0]="영업점"
            1-> joinPath[1]="인터넷"
            2->joinPath[2]="스마트폰"
            3->joinPath[3]="전화(텔레뱅킹)"
        }
    }

    fun addAvailableCities(city: City){
        cities.add(city)
    }

    fun addConditions(position :Int){
        when(position){
            0-> conditions[0]="기초생활수급자"
            1->conditions[1]="소년소녀가장"
            2->conditions[2]="북한이탈주민"
            3->conditions[3]="결혼이민자"
            4->conditions[4]="근로장려금"
            5->conditions[5]="한부모가족지원"
            6->conditions[6]="차상위계층"
        }
    }



}