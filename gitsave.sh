set -e

if [ -z "$1" ]; then
  echo "❌ Error: Please provide a commit message."
  echo "Usage: ./save.sh \"Your descriptive message\""
  exit 1
fi


echo "🚀 Staging all changes..."
git add .

echo "💾 Committing changes..."
git commit -m "$1"

echo "📡 Pushing to GitHub..."
git push -u origin main

echo "✅ All done! Your code is now on GitHub."