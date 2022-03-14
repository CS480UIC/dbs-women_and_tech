# app.py
from flask import Flask, render_template, request
from typing import List, Dict
import mysql.connector
import json

app = Flask(__name__, template_folder='templates', static_folder='static')
# home route
@app.route("/")
def hello():
    # return "Hello, world!"
    return render_template('index.html')

# serving form web page
@app.route("/my-form")
def form():
    return render_template('form.html')

# handling form data
@app.route('/form-handler', methods=['POST'])
def handle_data():
    welcome_msg = 'Hello '
    name = request.form['name']
    
    if request.form['gender'] == 'Male':
        welcome_msg += 'Mr. ' + name
    elif request.form['gender'] == 'Female':
        welcome_msg += 'Mrs. ' + name

    return welcome_msg


def getUsers() -> List[Dict]:
    config = {
        'user': 'user',
        'password': 'password',
        'host': 'db',
        'port': '3306',
        'database': 'user'
    }
    connection = mysql.connector.connect(**config)
    cursor = connection.cursor()
    cursor.execute('SELECT * FROM user')
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