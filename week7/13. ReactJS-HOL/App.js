import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState("book");

  let componentToRender;
  if (view === "book") {
    componentToRender = <BookDetails />;
  } else if (view === "blog") {
    componentToRender = <BlogDetails />;
  } else if (view === "course") {
    componentToRender = <CourseDetails />;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>Show Book</button>
      <button onClick={() => setView("blog")}>Show Blog</button>
      <button onClick={() => setView("course")}>Show Course</button>

      <hr />

      {/* Method 1: Using element variable */}
      {componentToRender}

      {/* Method 2: Ternary operator */}
      {view === "book" ? <p>Viewing Books</p> : view === "blog" ? <p>Viewing Blogs</p> : <p>Viewing Courses</p>}

      {/* Method 3: Short-circuit && */}
      {view === "course" && <p>This is a course component</p>}
    </div>
  );
}

export default App;
