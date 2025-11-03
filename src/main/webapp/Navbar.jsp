<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Management Navigation</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar-custom {
            background: linear-gradient(90deg, #314755 0%, #26a0da 100%);
        }
        .navbar-nav .nav-link {
            color: #fff !important;
            font-weight: 500;
            letter-spacing: 1px;
            margin: 0 6px;
            border-radius: 6px;
            transition: background 0.25s, color 0.2s;
        }
        .navbar-nav .nav-link:hover,
        .navbar-nav .nav-link:focus {
            background-color: #8fd3f4;
            color: #233142 !important;
        }
        .navbar-brand {
            color: #fff !important;
            font-weight: bold;
            letter-spacing: 2px;
        }
        @media (max-width: 575.98px) {
            .navbar-brand {
                font-size: 1.2rem;
            }
            .navbar-nav .nav-link {
                font-size: 1rem;
                margin: 4px 0;
            }
        }
    </style>
</head>
<body>
    <!-- Responsive Bootstrap Navbar -->
    <nav class="navbar navbar-expand-lg navbar-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="Index.jsp">UserApp</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
               data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" 
               aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="Index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Register.jsp">Register</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Login.jsp">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Dashboard.jsp">Dashboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="UserListSession.jsp">View All Users</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
