# app.py
from flask import Flask, render_template, request
from flask_mysqldb import MySQL
from typing import List, Dict
import json

# init flask app
app = Flask(__name__)
# Required mysql init
app.config['MYSQL_HOST'] = 'db'
app.config['MYSQL_USER'] = 'user'
app.config['MYSQL_PASSWORD'] = 'password'
app.config['MYSQL_DB'] = 'bookstore'

mysql = MySQL(app)


# home route
@app.route("/")
def hello():
    # return "Hello, world!"
    return render_template('index.html')

# serving form web page
@app.route("/register", methods=["GET", "POST"])
def form():
    if request.method == "POST":
        details = request.form
        username = details['username']
        password = details['password']
        email = details['email']
        with mysql.connection.cursor() as cur:
            cur.execute(f"""INSERT INTO user VALUES({username}, {password}, {email})""")
            mysql.connection.commit()

        return f'Successfully added {username}'
        
    return render_template('register.html')


def getUsers() -> List[Dict]:
    cur = mysql.connection.cursor()
    cur.execute('SELECT * FROM user')
    results = [{'user':username, 'email': email} for (username, _, email) in cursor]
    cursor.close()
    connection.close()

    return results

@app.route("/db")
def getDB():
    return  json.dumps({'Users': getUsers()})


#Create the main driver function
if __name__ == '__main__':
    #call the run method
    app.run(debug=True,host='0.0.0.0')