
  package gen;
  public class Q_Gen130 {
  		@com.google.inject.Inject
  		public Q_Gen130(Q_Gen131 q_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  