import CohortDetails from './components/CohortDetails';

function App() {
  const sampleCohort = {
    cohortCode: 'FSWD-Alpha',
    technology: 'MERN',
    startDate: '2025-01-10',
    currentStatus: 'In Progress',
    coachName: 'Anil Kumar',
    trainerName: 'Sonia Verma'
  };

  return (
    <div>
      <h2>Cohort Tracker</h2>
      <CohortDetails cohort={sampleCohort} />
    </div>
  );
}

export default App;
