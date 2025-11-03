<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Management Application</title>

    <!-- Bootstrap CSS (v5.3 CDN) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS for enhancements -->
    <style>
        body {
            background: linear-gradient(135deg, #f8fafc 0%, #e2eafc 100%);
            min-height: 100vh;
        }
        h2 {
            margin-top: 40px;
            font-weight: 700;
            color: #31404f;
            text-align: center;
            letter-spacing: 1px;
            text-shadow: 0 2px 4px rgba(34, 34, 34, 0.05);
        }
        .container {
            background: #fff;
            border-radius: 12px;
            padding: 32px 24px;
            box-shadow: 0 4px 20px rgba(60, 72, 88, 0.09);
            margin-top: 32px;
            max-width: 600px;
        }
        @media (max-width: 576px) {
            .container {
                padding: 16px 8px;
            }
            h2 {
                font-size: 1.5rem;
            }
        }
    </style>
</head>
<body>
    <%@ include file="Navbar.jsp" %>
    <div class="container mt-5">
        <h2>Welcome to User Management Application</h2>
        <!-- You can add other page elements here -->
    </div>

    <!-- Bootstrap JS Bundle (for components if needed) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
