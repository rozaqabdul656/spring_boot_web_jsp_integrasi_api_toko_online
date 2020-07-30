<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page import="java.text.*"%>
<%@ page import="java.util.Locale"%>

     <!-- Featured Section Begin -->
    <section class="featured spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title">
                        <h2>Featured Product</h2>
                    </div>
                    <div class="featured__controls">
                        <ul>
                            <li class="active" data-filter="*">All</li>
                             <c:forEach var="DataProduct" items="${DataJenisProduct}">
                            	<li data-filter=".${DataProduct.nama_jenis_product}">${DataProduct.nama_jenis_product}</li>
                             </c:forEach>
                                            
                        </ul>
                    </div>
                </div>
            </div>
                        
            <div class="row featured__filter">
                   <c:forEach var="DataProduct" items="${DataProduct}">
          
                <div class="col-lg-3 col-md-4 col-sm-6 mix ${DataProduct.jenisProduct.nama_jenis_product}">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="${pageContext.request.contextPath}/img/${DataProduct.gambar_product}">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                        </div>
                        <div class="featured__item__text">
                            <h6><a href="#">${DataProduct.nama_product}</a></h6>
                            <h5>Rp ${DataProduct.harga.toString()}</h5>
                        </div>
                    </div>
                </div>
                </c:forEach>
                         
            </div>
        </div>
    </section>
    <!-- Featured Section End -->

    <!-- Banner Begin -->
    <div class="banner">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-1.jpg" alt="">
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-2.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Banner End -->

