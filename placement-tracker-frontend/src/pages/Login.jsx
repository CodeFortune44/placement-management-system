import { useState } from "react";

export default function Login() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const handleLogin = (e) => {
        e.preventDefault();
        console.log("Connecting to backend with:", email, password);
    };

    return (
        <div style={styles.container}>
            <div style={styles.card}>
                <div style={styles.header}>
                    <h2 style={styles.title}>Placement Tracker</h2>
                    <p style={styles.subtitle}>Welcome back! Please login to your account.</p>
                </div>

                <form onSubmit={handleLogin} style={styles.form}>
                    <div style={styles.inputGroup}>
                        <label style={styles.label}>Email Address</label>
                        <input
                            type="email"
                            placeholder="name@university.com"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
                            required
                            style={styles.input}
                        />
                    </div>

                    <div style={styles.inputGroup}>
                        <label style={styles.label}>Password</label>
                        <input
                            type="password"
                            placeholder="••••••••"
                            value={password}
                            onChange={(e) => setPassword(e.target.value)}
                            required
                            style={styles.input}
                        />
                    </div>

                    <button type="submit" style={styles.button}>
                        Sign In
                    </button>
                </form>
            </div>
        </div>
    );
}

// Modern UI Styles
const styles = {
    container: {
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        minHeight: "100vh",
        backgroundColor: "#f4f6f9",
        fontFamily: "'Segoe UI', Roboto, Helvetica, Arial, sans-serif",
        margin: 0,
        padding: "20px",
        boxSizing: "border-box",
    },
    card: {
        backgroundColor: "#ffffff",
        padding: "40px",
        borderRadius: "12px",
        boxShadow: "0 8px 24px rgba(149, 157, 165, 0.2)",
        width: "100%",
        maxWidth: "400px",
        boxSizing: "border-box",
    },
    header: {
        textAlign: "center",
        marginBottom: "32px",
    },
    title: {
        margin: "0 0 8px 0",
        color: "#1a1f36",
        fontSize: "28px",
        fontWeight: "700",
    },
    subtitle: {
        margin: 0,
        color: "#697386",
        fontSize: "14px",
    },
    form: {
        display: "flex",
        flexDirection: "column",
        gap: "20px",
    },
    inputGroup: {
        display: "flex",
        flexDirection: "column",
        gap: "6px",
    },
    label: {
        fontSize: "14px",
        fontWeight: "600",
        color: "#3c4257",
        textAlign: "left",
    },
    input: {
        padding: "12px 16px",
        fontSize: "16px",
        borderRadius: "6px",
        border: "1px solid #d9d9d9",
        backgroundColor: "#ffffff",
        color: "#1a1f36",
        outline: "none",
        transition: "border-color 0.2s",
        boxSizing: "border-box",
    },
    button: {
        padding: "12px",
        fontSize: "16px",
        fontWeight: "600",
        color: "#ffffff",
        backgroundColor: "#5469d4",
        border: "none",
        borderRadius: "6px",
        cursor: "pointer",
        marginTop: "10px",
        transition: "background-color 0.2s",
        boxShadow: "0 4px 12px rgba(84, 105, 212, 0.2)",
    },
};