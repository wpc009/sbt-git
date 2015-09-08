
def proj(name: String) = Project(name, file(name)).enablePlugins(GitVersioning,GitBranchPrompt).settings( git.baseVersion := "1.0",git.useGitDescribe := true)

lazy val a = proj("a")

lazy val b = proj("b")

git.baseVersion := "1.0"
