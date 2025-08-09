 
import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const percentage = ((props.total / props.goal) * 100).toFixed(2);

  return (
    <div className="score-container">
      <h2>Student Details:</h2>
      <p><strong>Name:</strong> <span className="name">{props.name}</span></p>
      <p><strong>School:</strong> <span className="school">{props.school}</span></p>
      <p><strong>Total:</strong> {props.total} Marks</p>
      <p><strong>Score:</strong> <span className="score">{percentage}%</span></p>
    </div>
  );
}

export default CalculateScore;
