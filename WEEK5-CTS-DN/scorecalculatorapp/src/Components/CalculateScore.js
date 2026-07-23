import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore({ Name, School, Total, Goal }) {
    return (
        <div className="formatstyle">
            <h1><font color="Brown">Student Details</font></h1>
            <div className="Name">
                <b><span>Name:</span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School:</span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total:</span></b>
                <span>{Total}</span>
            </div>
            <div className="Score">
                <b><span>Score:</span></b>
                <span>{Total / Goal}</span>
            </div>
        </div>
    );
}

export default CalculateScore;
