 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <!-- Breadcome start-->
            <div class="breadcome-area mg-b-30 small-dn">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="breadcome-list map-mg-t-40-gl shadow-reset">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
										<div class="pull-left">
											   		<a href="<c:url value='/admin/add_product' />" style="color:black;"><i class="fa fa-plus"></i>Tambah Data Product</a>
									   
										</div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <ul class="breadcome-menu">
                                            <li><a href="<c:url value='/admin/add_product' />">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Product</span>
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
 <!-- Breadcome start-->
            <div class="breadcome-area mg-b-30 des-none">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list map-mg-t-40-gl shadow-reset">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="breadcome-heading">
                                           		<a href="<c:url value='/admin/add_product' />"><i class="fa fa-plus"></i>Tambah Data Product</a>
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
            <!-- Static Table Start -->
            <div class="data-table-area mg-b-15">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="sparkline13-list shadow-reset">
                                <div class="sparkline13-hd">
                                    <div class="main-sparkline13-hd">
                                        <h1>Data  <span class="table-project-n">Product</span> </h1>
                                        <div class="sparkline13-outline-icon">
                                            <span class="sparkline13-collapse-link"><i class="fa fa-chevron-up"></i></span>
                                            <span><i class="fa fa-wrench"></i></span>
                                        </div>
                                    </div>
                                </div>
                                <div class="sparkline8-graph">
                                    <div class="static-table-list">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>No</th>
                                                    <th>Nama Product </th>
                                                    <th>Jenis Product</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="DataProduct" items="${DataProduct}">
												 <c:set var="no" value="${no +1}"/>
												<tr>
                                                    <td>${no} </td>
                                                    <td>${DataProduct.nama_product}</td>
                                                   <td>${DataProduct.jenisProduct.nama_jenis_product}</td>
                                                    <td>
                                                    	<a href="<c:url value='/admin/edit_product/${DataProduct.id_product}' />">
                                                    		<i class="fa fa-edit">
                                                    			
                                                    		</i>
                                                    		Edit
                                                    	</a>
                                                    	 <a href="<c:url value='/admin/delete_product/${DataProduct.id_product}' />">
                                                    		<i class="fa fa-trash">	
                                              
                                                    		</i>
                                                    		Delete
                                                    	</a>
                                                    	
                                                    </td>
                                                </tr>
                                                </c:forEach>
                                            
                                               
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Static Table End -->