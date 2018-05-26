<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
<table class="table table-striped">
		<caption><spring:message code="task.caption" /></caption>
		<thead>
			<tr>
				<th>Subject</th>
				<th>Detail</th>
				<th>Status</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${token}" var="todo">
				<tr>
					<td>${token.desc}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${token.targetDate}" /></td>
					<td>${token.done}</td>
					<td><a type="button" class="btn btn-primary"
						href="/show-token?id=${token.token_id}">Show</a>
					
						<a type="button" class="btn btn-primary"
						href="/update-token?id=${token.token_id}">Edit</a> 
						<a type="button"
						class="btn btn-warning" href="/delete-token?id=${token.token_id}">Delete</a>
						
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-success" href="/add-token">Add</a>
	
	</div>
	</div>
<%@ include file="common/footer.jspf"%>
