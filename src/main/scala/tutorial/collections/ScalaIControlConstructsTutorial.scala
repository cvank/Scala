package tutorial.collections

import scala.collection.mutable
import scala.util.hashing.Hashing

/**
  * Created by chandrashekar.v on 5/26/2017.
  */
object ScalaIControlConstructsTutorial {

  def main(args: Array[String]): Unit = {

    val t = Traversable(1, 2, 3)
    print(t.map(i => i * i).sum)

    val itr = Iterable("x", "y", "z")
    var map: Map[String, Int] = Map("x" -> 24, "y" -> 25, "z" -> 26)

    mutableCollections
    immutableCollections

    mutable.Set("red", "blue", "green")
    val sortedset = mutable.SortedSet("2", "3", "1", "100", "20")

    // A traversable collection consisting of all elements of this traversable collection except the first one.
    print(sortedset.tail) // Selects all elements except the first.
    mutable.Buffer(1, 2, 3)
    mutable.IndexedSeq(1.0, 2.0)
    mutable.LinearSeq("a", "b", "c")

    // Conversions
    print(List(1,2,3) map(_ +2) toString())
    print(Set(1,2,3) map(_ +2) toString())

  }

  private def immutableCollections = {
    scala.collection.mutable.Traversable

    scala.collection.mutable.Iterable

    // Traversable->Iterable->Seq
    scala.collection.mutable.Seq
    scala.collection.mutable.Stack
    // Traversable->Iterable->Seq->Stack->SynchronizedStack
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedStack
    scala.collection.mutable.ArrayStack
    scala.collection.mutable.PriorityQueue
    // Traversable->Iterable->Seq->PriorityQueue->SynchronizedPriorityQueue
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedPriorityQueue




    // Traversable->Iterable->Seq->Indexed Seq
    scala.collection.mutable.IndexedSeq
    // Traversable->Iterable->Seq->IndexedSeq->ArraySeq
    scala.collection.mutable.ArraySeq

    // Traversable->Iterable->Seq->Buffer
    scala.collection.mutable.Buffer
    scala.collection.mutable.ArrayBuffer
    scala.collection.mutable.ListBuffer
    //TODO: Why compilation failure??? scala.collection.mutable.ObservableBuffer
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedBuffer

    // Traversable->Iterable->Seq->LinearSeq
    scala.collection.mutable.LinearSeq
    // Traversable->Iterable->Seq->LinearSeq->MutableList
    scala.collection.mutable.MutableList
    // Traversable->Iterable->Seq->LinearSeq->MutableList->Queue
    scala.collection.mutable.Queue
    // Traversable->Iterable->Seq->LinearSeq->MutableList->Queue->SynchronizedQueue
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedQueue
    // Traversable->Iterable->Seq->LinearSeq->LinkedList
    scala.collection.mutable.LinkedList
    scala.collection.mutable.DoubleLinkedList

    scala.collection.mutable.Map
    scala.collection.mutable.HashMap
    scala.collection.mutable.LinkedHashMap
    scala.collection.mutable.ListMap
    //TODO: Why compilation failure??? scala.collection.mutable.MultiMap
    scala.collection.mutable.WeakHashMap
    scala.collection.mutable.OpenHashMap
    //TODO: Why compilation failure??? scala.collection.mutable.ObservableMap
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedMap
    //TODO: Why compilation failure??? scala.collection.mutable.ImmutableMapAdaptor


    scala.collection.mutable.Set
    scala.collection.mutable.HashSet
    scala.collection.mutable.BitSet
    scala.collection.mutable.LinkedHashSet
    //TODO: Why compilation failure??? scala.collection.mutable.ObservableSet
    //TODO: Why compilation failure??? scala.collection.mutable.SynchronizedSet
    //TODO: Why compilation failure??? scala.collection.mutable.ImmutableSetAdaptor


  }

  private def mutableCollections = {
    /*
      http://docs.scala-lang.org/resources/images/collections.png

      Immutable collections
    */
    scala.collection.immutable.Traversable

    scala.collection.immutable.Iterable
    scala.collection.immutable.Seq
    scala.collection.immutable.IndexedSeq
    scala.collection.immutable.Vector
    scala.collection.immutable.NumericRange
    scala.collection.immutable.Range

    scala.collection.immutable.LinearSeq
    scala.collection.immutable.List
    scala.collection.immutable.Stream
    scala.collection.immutable.Queue
    scala.collection.immutable.Stack

    scala.collection.immutable.Set
    scala.collection.immutable.BitSet
    scala.collection.immutable.HashSet
    scala.collection.immutable.ListSet
    scala.collection.immutable.SortedSet;
    scala.collection.immutable.TreeSet

    scala.collection.immutable.Map
    scala.collection.immutable.HashMap
    scala.collection.immutable.SortedMap;
    scala.collection.immutable.TreeMap
    scala.collection.immutable.ListMap
  }
}
