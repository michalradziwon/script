
  package gen;
  public class Q_Gen133 {
  		@com.google.inject.Inject
  		public Q_Gen133(Q_Gen134 q_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  