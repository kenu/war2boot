# 표준프레임워크 템플릿 프로젝트 심플 홈페이지

![java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=JAVA&logoColor=white)
![javascript](https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Spring](https://img.shields.io/badge/Spring-F2F4F9?style=for-the-badge&logo=spring)
![jquery](https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white)
![maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)  
![workflow](https://github.com/eGovFramework/egovframe-simple-homepage-template/actions/workflows/maven.yml/badge.svg)

※ 본 프로젝트는 표준프레임워크에서 제공하는 공통컴포넌트의 기능들 중 일부를 선정하여 기본 구성한 참조용 프로젝트 소스입니다.

## 프로젝트 소개

### 프로젝트 개요

단순 홈페이지 기능 구현 시 필수적인 부분만 사용 가능하도록 경량화 된 실행환경 제공  
메인 페이지, 사용자 관리, 공지사항 관리, 게시판 관리, 안내 관리 기능을 제공

### 메뉴 구성

![menu_sht_v4](https://user-images.githubusercontent.com/3771788/229035504-8747b752-ffa8-4f53-963f-cdb62a36d66b.jpg)

## 참고 화면 및 메뉴 설명

### 메인 화면

![sh1 (1)](https://user-images.githubusercontent.com/30619379/229413223-31bc7778-6fd9-4d37-9b62-1611b2524421.jpg)

1. 홈페이지 템플릿은 관리자만 로그인 가능하다는 전제로 구성되었으며 최초 관리자 계정 설정은 **[ 로그인계정 : admin , 로그인암호 : 1 ]** 로 설정되어 있다.
2. 관리자 추가 및 변경 기능은 추가 구성되어 있지 않으므로 필요 시 DB를 통해 직접 변경한다. (암호 셋팅 값은 공통컴포넌트의 암호화 로직에 따라 생성해야 함)
3. 기본 기능이나 예시 메뉴를 실무적으로 추가 커스터마이징하여 활용할 수 있다.
4. 주의사항 WAS 컨텍스트 **/sht_webapp** 는 무조건 사용해야 한다.  
-------------------------------------------------------------  
     * 2023.05.30 Fix: moveToPage()  
     추가 보완 조치로 아래의 파일에 하드 코딩 되어 있음.  
     EgovIncLeftmenu.jsp  
     EgovIncTopnav.jsp  
     EgovMainView.jsp


### 사이트 소개 화면

![sh2 (1)](https://user-images.githubusercontent.com/30619379/229413242-2a28416c-73a4-430b-8d8f-bfae320ac0d5.jpg)

- **해당 화면 및 세부 메뉴 화면은 구성을 위한 샘플페이지가 제공되며 기능은 구현되지 않은 상태입니다.**

1. 세부메뉴 : 사이트소개, 연혁, 조직소개, 찾아오시는 길
2. 기능설명 : 예시 메뉴에 해당하는 항목으로 샘플 페이지 형태로 링크와 JSP파일이 존재한다.
3. 활용방법 : 각 샘플 페이지에 대한 콘텐츠를 새로 구성하여 활용할 수 있다.

### 정보마당 화면

![sh3 (1)](https://user-images.githubusercontent.com/30619379/229413265-2ca23e56-4d3b-47e1-b5d0-ee4d65a10323.jpg)

- **해당 화면 및 세부 메뉴 화면은 구성을 위한 샘플페이지가 제공되며 기능은 구현되지 않은 상태입니다.**

1. 세부메뉴 : 주요사업 소개, 대표서비스 소개
2. 기능설명 : 예시 메뉴에 해당하는 항목으로 샘플 페이지 형태로 존재한다.
3. 활용방법 : 각 샘플 페이지에 대한 콘텐츠를 새로 구성하여 활용할 수 있다.

### 고객지원 화면

![sh4 (1)](https://user-images.githubusercontent.com/30619379/229413293-844c0cf1-1066-4967-b2b0-073f1c5a759b.jpg)

- **해당 화면 및 세부 메뉴 화면은 구성을 위한 샘플페이지가 제공되며 기능은 구현되지 않은 상태입니다.**

1. 세부메뉴 : 자료실, 묻고답하기, 서비스신청
2. 기능설명 : 예시 메뉴에 해당하는 항목으로 샘플 페이지 형태로 존재한다.
3. 활용방법 : 각 샘플 페이지에 기능을 추가 개발 후 구성하여 활용할 수 있다.

### 알림마당 화면

![sh5 (1)](https://user-images.githubusercontent.com/30619379/229413343-cf1061ce-0cd9-47b1-88e4-77ea5cf170f6.jpg)

1. 세부메뉴 : 오늘의행사, 금주의행사, 공지사항, 사이트갤러리
2. 기능설명 : 공통컴포넌트 일정관리(부서일정)와 게시판 기능을 커스터마이징하여 사용한다.
3. 활용방법 : 관리자가 등록한 일정정보를 조회하거나 게시물을 조회할 수 있다.

### 사이트관리 화면

![sh6 (1)](https://user-images.githubusercontent.com/30619379/229413357-3d802dad-cbaf-4fcb-84d9-2b508e883f4f.jpg)

1. 세부메뉴 : 일정관리, 게시판생성관리, 게시판사용관리, 공지사항관리, 사이트갤러리관리
2. 기능설명 : 공통컴포넌트 일정관리(부서일정)과 게시판 기능을 커스터마이징하여 사용한다.
3. 활용방법 : 관리자로 로그인 한 후 일정정보를 등록하거나 게시물을 등록할 수 있다. (게시판 설정 가능)

## 환경 설정

프로젝트에서 사용된 환경 프로그램 정보는 다음과 같다.
| 프로그램 명 | 버전 명 |
| :--------- | :------ |
| java | 1.8 이상 |
| maven | 3.8.4 |

## 프로젝트 실행

1. **데이터베이스 설정**:
   - 프로젝트의 `DATABASE` 폴더에 있는 DDL 및 DML 스크립트를 사용하여 사용하려는 데이터베이스에 테이블과 초기 데이터를 생성합니다.
   - `src/main/resources/application.properties` 파일의 `spring.datasource.*` 속성을 본인의 데이터베이스 설정에 맞게 수정합니다. (기본값은 내장 HSQLDB로 설정되어 있습니다.)

2. **애플리케이션 실행**:
   - 프로젝트의 루트 디렉토리에서 터미널 또는 커맨드 프롬프트를 열고 다음 Maven 명령어를 실행합니다.
   ```bash
   mvn spring-boot:run
   ```

3. **애플리케이션 접속**:
   - 애플리케이션이 성공적으로 시작되면, 웹 브라우저를 열고 다음 URL로 접속합니다.
   ```
   http://localhost:8080/sht_webapp/
   ```
