
  package gen;
  public class Q_Gen76 {
  		@com.google.inject.Inject
  		public Q_Gen76(Q_Gen77 q_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  