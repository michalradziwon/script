
  package gen;
  public class Q_Gen190 {
  		@com.google.inject.Inject
  		public Q_Gen190(Q_Gen191 q_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  