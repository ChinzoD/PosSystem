<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<div class="col-md-12">
                                                <!-- BEGIN EXAMPLE TABLE PORTLET-->
                                                <div class="portlet light ">
                                                    <div class="portlet-title">
                                                        <div class="caption font-dark">
                                                            <i class="icon-settings font-dark"></i>
                                                            <span class="caption-subject bold uppercase"> Managed Table</span>
                                                        </div>
                                                        <div class="actions">
                                                            <div class="btn-group btn-group-devided" data-toggle="buttons">
                                                                <label class="btn btn-transparent dark btn-outline btn-circle btn-sm active">
                                                                    <input type="radio" name="options" class="toggle" id="option1">Actions</label>
                                                                <label class="btn btn-transparent dark btn-outline btn-circle btn-sm">
                                                                    <input type="radio" name="options" class="toggle" id="option2">Settings</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="portlet-body">
                                                        <div class="table-toolbar">
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <div class="btn-group">
                                                                        <button id="sample_editable_1_new" class="btn sbold green"> Add New
                                                                            <i class="fa fa-plus"></i>
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <div class="btn-group pull-right">
                                                                        <button class="btn green  btn-outline dropdown-toggle" data-toggle="dropdown">Tools
                                                                            <i class="fa fa-angle-down"></i>
                                                                        </button>
                                                                        <ul class="dropdown-menu pull-right">
                                                                            <li>
                                                                                <a href="javascript:;">
                                                                                    <i class="fa fa-print"></i> Print </a>
                                                                            </li>
                                                                            <li>
                                                                                <a href="javascript:;">
                                                                                    <i class="fa fa-file-pdf-o"></i> Save as PDF </a>
                                                                            </li>
                                                                            <li>
                                                                                <a href="javascript:;">
                                                                                    <i class="fa fa-file-excel-o"></i> Export to Excel </a>
                                                                            </li>
                                                                        </ul>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div id="sample_1_wrapper" class="dataTables_wrapper no-footer"><div class="row"><div class="col-md-6 col-sm-6"><div class="dataTables_length" id="sample_1_length"><label>Show <select name="sample_1_length" aria-controls="sample_1" class="form-control input-sm input-xsmall input-inline"><option value="5">5</option><option value="15">15</option><option value="20">20</option><option value="-1">All</option></select></label></div></div><div class="col-md-6 col-sm-6"><div id="sample_1_filter" class="dataTables_filter"><label>Search:<input type="search" class="form-control input-sm input-small input-inline" placeholder="" aria-controls="sample_1"></label></div></div></div><div class="table-scrollable"><table class="table table-striped table-bordered table-hover table-checkable order-column dataTable no-footer" id="sample_1" role="grid" aria-describedby="sample_1_info">
                                                            <thead>
                                                                <tr role="row"><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="
                                                                        
                                                                            
                                                                            
                                                                        
                                                                    " style="width: 71px;">
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes">
                                                                            <span></span>
                                                                        </label>
                                                                    </th><th class="sorting_asc" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-sort="ascending" aria-label=" Username : activate to sort column descending" style="width: 161px;"> Username </th><th class="sorting" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-label=" Email : activate to sort column ascending" style="width: 243px;"> Email </th><th class="sorting" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-label=" Status : activate to sort column ascending" style="width: 129px;"> Status </th><th class="sorting" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-label=" Joined : activate to sort column ascending" style="width: 123px;"> Joined </th><th class="sorting" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-label=" Actions : activate to sort column ascending" style="width: 126px;"> Actions </th></tr>
                                                            </thead>
                                                            <tbody>
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                                
                                                            <tr class="gradeX odd" role="row">
                                                                    <td>
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="checkboxes" value="1">
                                                                            <span></span>
                                                                        </label>
                                                                    </td>
                                                                    <td class="sorting_1"> coop </td>
                                                                    <td>
                                                                        <a href="mailto:userwow@gmail.com"> good@gmail.com </a>
                                                                    </td>
                                                                    <td>
                                                                        <span class="label label-sm label-info"> Info </span>
                                                                    </td>
                                                                    <td class="center"> 12.12.2011 </td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                                                                <i class="fa fa-angle-down"></i>
                                                                            </button>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-docs"></i> New Post </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-tag"></i> New Comment </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-user"></i> New User </a>
                                                                                </li>
                                                                                <li class="divider"> </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-flag"></i> Comments
                                                                                        <span class="badge badge-success">4</span>
                                                                                    </a>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
                                                                    </td>
                                                                </tr><tr class="gradeX even" role="row">
                                                                    <td>
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="checkboxes" value="1">
                                                                            <span></span>
                                                                        </label>
                                                                    </td>
                                                                    <td class="sorting_1"> foopl </td>
                                                                    <td>
                                                                        <a href="mailto:userwow@gmail.com"> good@gmail.com </a>
                                                                    </td>
                                                                    <td>
                                                                        <span class="label label-sm label-info"> Info </span>
                                                                    </td>
                                                                    <td class="center"> 12.12.2011 </td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                                                                <i class="fa fa-angle-down"></i>
                                                                            </button>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-docs"></i> New Post </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-tag"></i> New Comment </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-user"></i> New User </a>
                                                                                </li>
                                                                                <li class="divider"> </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-flag"></i> Comments
                                                                                        <span class="badge badge-success">4</span>
                                                                                    </a>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
                                                                    </td>
                                                                </tr><tr class="gradeX odd" role="row">
                                                                    <td>
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="checkboxes" value="1">
                                                                            <span></span>
                                                                        </label>
                                                                    </td>
                                                                    <td class="sorting_1"> fop </td>
                                                                    <td>
                                                                        <a href="mailto:userwow@gmail.com"> good@gmail.com </a>
                                                                    </td>
                                                                    <td>
                                                                        <span class="label label-sm label-warning"> Suspended </span>
                                                                    </td>
                                                                    <td class="center"> 12.12.2011 </td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                                                                <i class="fa fa-angle-down"></i>
                                                                            </button>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-docs"></i> New Post </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-tag"></i> New Comment </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-user"></i> New User </a>
                                                                                </li>
                                                                                <li class="divider"> </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-flag"></i> Comments
                                                                                        <span class="badge badge-success">4</span>
                                                                                    </a>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
                                                                    </td>
                                                                </tr><tr class="gradeX even" role="row">
                                                                    <td>
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="checkboxes" value="1">
                                                                            <span></span>
                                                                        </label>
                                                                    </td>
                                                                    <td class="sorting_1"> goop </td>
                                                                    <td>
                                                                        <a href="mailto:userwow@gmail.com"> good@gmail.com </a>
                                                                    </td>
                                                                    <td>
                                                                        <span class="label label-sm label-warning"> Suspended </span>
                                                                    </td>
                                                                    <td class="center"> 12.12.2011 </td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                                                                <i class="fa fa-angle-down"></i>
                                                                            </button>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-docs"></i> New Post </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-tag"></i> New Comment </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-user"></i> New User </a>
                                                                                </li>
                                                                                <li class="divider"> </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-flag"></i> Comments
                                                                                        <span class="badge badge-success">4</span>
                                                                                    </a>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
                                                                    </td>
                                                                </tr><tr class="gradeX odd" role="row">
                                                                    <td>
                                                                        <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                                                            <input type="checkbox" class="checkboxes" value="1">
                                                                            <span></span>
                                                                        </label>
                                                                    </td>
                                                                    <td class="sorting_1"> kop </td>
                                                                    <td>
                                                                        <a href="mailto:userwow@gmail.com"> good@gmail.com </a>
                                                                    </td>
                                                                    <td>
                                                                        <span class="label label-sm label-warning"> Suspended </span>
                                                                    </td>
                                                                    <td class="center"> 12.12.2011 </td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                                                                <i class="fa fa-angle-down"></i>
                                                                            </button>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-docs"></i> New Post </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-tag"></i> New Comment </a>
                                                                                </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-user"></i> New User </a>
                                                                                </li>
                                                                                <li class="divider"> </li>
                                                                                <li>
                                                                                    <a href="javascript:;">
                                                                                        <i class="icon-flag"></i> Comments
                                                                                        <span class="badge badge-success">4</span>
                                                                                    </a>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
                                                                    </td>
                                                                </tr></tbody>
                                                        </table></div><div class="row"><div class="col-md-5 col-sm-5"><div class="dataTables_info" id="sample_1_info" role="status" aria-live="polite">Showing 1 to 5 of 25 records</div></div><div class="col-md-7 col-sm-7"><div class="dataTables_paginate paging_bootstrap_full_number" id="sample_1_paginate"><ul class="pagination" style="visibility: visible;"><li class="prev disabled"><a href="#" title="First"><i class="fa fa-angle-double-left"></i></a></li><li class="prev disabled"><a href="#" title="Prev"><i class="fa fa-angle-left"></i></a></li><li class="active"><a href="#">1</a></li><li><a href="#">2</a></li><li><a href="#">3</a></li><li><a href="#">4</a></li><li><a href="#">5</a></li><li class="next"><a href="#" title="Next"><i class="fa fa-angle-right"></i></a></li><li class="next"><a href="#" title="Last"><i class="fa fa-angle-double-right"></i></a></li></ul></div></div></div></div>
                                                    </div>
                                                </div>
                                                <!-- END EXAMPLE TABLE PORTLET-->
                                            </div>
                                            
                                            