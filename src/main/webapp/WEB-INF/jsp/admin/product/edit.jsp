 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
 <!-- Breadcome start-->
            <div class="breadcome-area mg-b-30 des-none">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list map-mg-t-40-gl shadow-reset">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="breadcome-heading">
                                            <form role="search" class="">
												<input type="text" placeholder="Search..." class="form-control">
												<a href=""><i class="fa fa-search"></i></a>
											</form>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <ul class="breadcome-menu">
                                            <li><a href="#">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Dashboard</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Breadcome End-->
            <!-- Order Form Start-->
            <div class="login-form-area mg-t-30 mg-b-15">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-3"></div>
                         <c:forEach var="DataProduct" items="${DataProduct}">
											
                        <form id="adminpro-order-form" action="<c:url value='/admin/update_product/${DataProduct.id_product}' />" method="post" class="adminpro-form" enctype = "multipart/form-data">
                            <div class="col-lg-6">
                                <div class="login-bg">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="logo">
                                                <a href="#"><img src="img/logo/logo.png" alt="" />
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="login-title">
                                                <h1>Edit Product</h1>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4">
                                            <div class="login-input-head">
                                                <p>Nama Product</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-8">
                                            <div class="login-input-area">
                                                <input type="text" value="${DataProduct.nama_product}" name="nama_product" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4">
                                            <div class="login-input-head">
                                                <p>Harga</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-8">
                                            <div class="login-input-area">
                                                <input type="text" value="${DataProduct.harga}" name="harga" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4">
                                            <div class="login-input-head">
                                                <p>Berat</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-8">
                                            <div class="login-input-area">
                                                <input type="number" class="form-control" value="${DataProduct.berat}" name="berat" />
                                            </div>
                                        </div>
                                    </div>
                                     <div class="row">
                                        <div class="col-lg-4">
                                            <div class="login-input-head">
                                                <p>Gambar</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-8">
                                            <div class="login-input-area">
                                            	<img alt="gambar_product" src="${pageContext.request.contextPath}/img/${DataProduct.gambar_product}">
                                                <input type="file" name="file" id="start" />
                                            </div>
                                        </div>
                                    </div>
                                   <div class="row">
                                         <div class="col-lg-4">
                                            <div class="login-input-head">
                                                <p>Jenis Product</p>
                                            </div>
                                        </div>
                                       
                                        <div class="col-lg-8">
                                            <div class="interested-input-area">
                                            
                                                <select name="jenisProduct">
                                                     <c:forEach var="DataJenisProduct" items="${DataJenisProduct}">
						                    			
						                    				<option value="${DataJenisProduct.jenis_product}" 
						                    						<c:if test="${DataJenisProduct.jenis_product.toString() == DataProduct.jenisProduct.jenis_product.toString()}">
                                                    
						                    							selected="selected"
						                    				 		</c:if>
                                                    	
						                    				 >${DataJenisProduct.nama_jenis_product}</option>
                                                    	                                                    	
                                                    			
                                                	</c:forEach>
                                        
                                                </select>
                                            
                         				    </div>
                                            
                                        </div>
                                    </div>
                                    			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
                                    <div class="row">
                                        <div class="col-lg-4"></div>
                                        <div class="col-lg-8">
                                            <div class="login-button-pro">
                                                <input type="submit"   class="login-button login-button-lg" value="kirim" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                         </c:forEach>
                                            
                        <div class="col-lg-3"></div>
                    </div>
                </div>
            </div>
            <!-- Order Form End-->
            