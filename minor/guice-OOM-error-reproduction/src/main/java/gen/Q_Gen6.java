
  package gen;
  public class Q_Gen6 {
  		@com.google.inject.Inject
  		public Q_Gen6(Q_Gen7 q_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  