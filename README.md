# Project Koguma

>Naver Cloud Camp
>
>클라우드기반 자바 웹 & 데브옵스 개발자 과정 2기 Team 'FiveGuys'
>
>김성윤, 김태현, 송인찬, 엄준호, 현상철



### 목차

---

#### 1. [프로젝트 소개](#프로젝트-소개)

#### 2. [프로젝트 산출물](#프로젝트-산출물)

#### 3. [역할 및 담당 업무](#역할-및-담당-업무)

#### 4. [담당 구현 기능](#담당-구현-기능)

#### 5. [DevOps](#DevOps)

#### 6. [Cloud Architecture](#Cloud-Architecture)

#### 7. [Server Architecture](#Server-Architectrue)

#### 8. [ERD](#ERD)

### #프로젝트 소개 

>고구마 - 동네인증 기반 중고 거래 플랫폼 

- 고구마는 주변 이웃들과 중고 거래를 할 때, 이웃 간 의사소통을 위한 채팅과 통화, 송금를 지원합니다. 안전한 거래를 위해 고구마 페이를 등록해 보세요.
- 우리 동네의 다양한 정보와 이야기를 좋아요와 댓글로 나누어요. 
- 마음에 드는 모임에 가입하여 활동하거나 직접 모임을 개설해서 모임장이 되어보세요. 이웃끼리 만나서 서로의 경험을 공유할 수 있습니다.

#### #주요기능

```
· 동네 이웃간의 중고거래 가능
· 중고거래를 위한 1대1 채팅 지원
· 채팅시, 편의를 위한 영상통화 지원
· 근처 이웃간의 소통을 위한 동네생활 제공
· 동네이웃 누구나 참여할수 있는 다양한 모임 제공
· 장터, 동네생활, 모임의 통합검색 지원
· 이웃간 팔로잉, 차단 지원
```



---



#### #프로젝트 산출물

- 소스코드

  GitHub - https://github.com/ungyuun/koguma.git

- [프로젝트 보고서](https://drive.google.com/file/d/1G_ryKSDVcYQxO4aP78PcuSiRdwua2EPE/view?usp=drive_link)

  - 프로젝트 개요 : 시스템 개요, 업무 영역, 예상 효과, 기술적 고려사항, 개발 이력, Architectures
  - 분석 산출물 : Use Case Modeling, Application Modeling, 화면분석, 업무분석
  - 설계 산출물 : Application Modeling, 화면 분석, 테이블 정의서

- 프로젝트 발표 영상

  
  
  [<img src="https://github.com/ungyuun/koguma/assets/95204319/e3d53e1b-03ac-45d9-b77f-a67c1ae45d02" alt="유튜브썸네일" style="zoom:50%;" />](https://youtu.be/QbFXbEj1Bzg?si=q6XCDb38PLAc5oxn)

``` 
발표 담당 부분 타임라인
기술 설명 : 00:24:00 ~ 00:27:50
```

 

- 시연영상

  [<img src="https://github.com/ungyuun/koguma/assets/95204319/4400df2b-4baa-412e-9a17-b10fbeea4dc7" alt="koguma_thumbnail" style="zoom:50%;" />](https://youtu.be/QbFXbEj1Bzg?si=aAa8oKgPy77te4h)



---



#### #역할 및 담당 업무

- 팀장 : 개발 일정 관리, 기술 지원

- 담당 서브시스템 : 상품, 거래, 위치 기반 조회

- 그 외 담당 업무 : Object Storage 구성,  Oauth2 기반 소셜로그인 구현, 프로젝트 보고서 작성

  

---



#### #담당 구현 기술



##### 1. 메인화면

> 위치기반 상품 리스트 조회. 위치와 게시물의 등록 위치를 거리 계산하여 근처에 있는 게시물만 보여지게함.



<img src="https://github.com/ungyuun/koguma/assets/95204319/0d641295-1456-4d82-b854-f96e518368b5" alt="product_list" width="25%" />    <img src="https://github.com/ungyuun/koguma/assets/95204319/845733c4-39af-4075-93cc-9579b3cd6aed" alt="location_list" width="25%" />    <img src="https://github.com/ungyuun/koguma/assets/95204319/a4570152-a4f6-45c2-bc58-17ff8fca40ef" alt="location_change_alert" width="25%" />   





##### 2. 내 동네 설정

>GeoLocation을 사용해 사용자의 위도 경도 가져와 reverseGeoCoder를 통해 행정동 추출.
>
>동네 추가, 동네 삭제, 검색반경 설정가능 [2~5km]



<img src="https://github.com/ungyuun/koguma/assets/95204319/d6a0659f-bc21-49ee-bbfa-2d3273a089db" alt="location" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/f6d2fb8f-455f-4388-bfa5-dbe440009617" alt="location2" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/2ea94fec-489a-411b-b43e-4fb2487f8bf9" alt="location3" width="25%" />





##### 3. 상품 가격제안

>상품 상세조회에서 기존의 가격보다 낮게 가격제안 가능
>
>판매자는 상품 조회에서 가격제안 리스트를 확인 가능



<img src="https://github.com/ungyuun/koguma/assets/95204319/e0769402-6fe8-4fd6-81b2-626bf909c1ed" alt="product_detail" width="25%"/>   <img src="https://github.com/ungyuun/koguma/assets/95204319/b0f504a9-bb70-40b7-85de-13352f1584a4" alt="suggest_price" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/027884f0-82a1-4b87-8dfc-de338126716f" alt="suggest_price_alert" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/3523da28-8bb7-48b3-85a0-5f2c32eca6f3" alt="suggest_price_list" width="25%" />





##### 4. 거래자 등록

>상품의 채팅내역중 회원을 선택하여 구매자로 등록한다.
>
>구매자로 등록된 회원은 본인이 구매한 상품이 아니면 내 구매 목록에서 구매내역을 삭제할수 있다.



<img src="https://github.com/ungyuun/koguma/assets/95204319/2294c065-5823-4d5c-ad4c-4ce0940753bd" alt="sale_not_buyer" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/041b0e6e-f11d-4901-bcd6-9b2e750853c0" alt="sale_not_list" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/1de835d7-7a95-445d-a516-fa98e9321679" alt="sale_not_alert" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/bc352652-551f-4b01-b875-7b28d472eff5" alt="sale_not_add" width="25%" />



##### 5. 거래 후기 

> 판매자와 구매자간 리뷰를 통한 평가가 가능하다. 
>
> 긍정적 후기의 한마디 1개당 0.5의 매너온도 증가. 부정적 후기의 한마디는 매너온도 감소.



<img src="https://github.com/ungyuun/koguma/assets/95204319/df501663-8b4a-49ba-8222-95d830b1f949" alt="good_review" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/bd7b0cf2-e913-482b-8663-48ad06b2bd4d" alt="bad_review" width="25%" />  <img src="https://github.com/ungyuun/koguma/assets/95204319/d123a710-4bc7-479f-ba1d-659744cc8976" alt="review_add_alert" width="25%" />  <img src="https://github.com/ungyuun/koguma/assets/95204319/2e9b8162-f566-4cda-af73-be63360d4d86" alt="add_review" width="25%" />



##### 6. 상품 끌어올리기

> 상품 리스트 하단에 있는 제품을 상단으로 끌어올리기. 24시간마다 한번씩 가능.



<img src="https://github.com/ungyuun/koguma/assets/95204319/3ae81fc8-446b-422a-8b47-0fb9fe4ff4be" alt="before_raise" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/26a0b92b-0373-41ba-9db5-982700812846" alt="upraise_alert" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/faf80524-d900-4984-85a5-74e444f3da0b" alt="after_raise" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/5d54c339-cd12-4a45-8c58-e6a5590c0c6e" alt="raise_alert" width="25%" />





##### 7. 상품 숨기기

>상품 리스트에서 조회가 불가능하게 변경함.



<img src="https://github.com/ungyuun/koguma/assets/95204319/8a569102-6347-4fbf-b673-7bfbd1eaf982" alt="add_hide" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/b3afbb58-7171-4d96-bce8-cadefe8509f8" alt="hide_alert" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/43bf3eb9-f89f-4b94-8686-e4d4a97b53d9" alt="hide_list" width="25%" />   <img src="https://github.com/ungyuun/koguma/assets/95204319/3f78a974-bcd0-4a46-bea9-748be76f2b47" alt="delete_hide" width="25%" />   



---





#### #DevOps

![koguma_devops_toolchain](https://github.com/ungyuun/koguma/assets/95204319/c16a01b3-6725-48d3-9dbe-58ddf6051929)

---



#### #Cloud Archtecture

![koguma_cloud_architecture](https://github.com/ungyuun/koguma/assets/95204319/45422ea6-9256-4636-bf8f-c9d5f108aa0b)



---



#### #Server Architectrue

![koguma_server_architecture](https://github.com/ungyuun/koguma/assets/95204319/5856c19d-4399-4dc6-89bc-c87203b2f089)



---



#### #ERD

![koguma_erd_diagram](https://github.com/ungyuun/koguma/assets/95204319/2d626637-b545-4568-99d6-cea4691279ac)


