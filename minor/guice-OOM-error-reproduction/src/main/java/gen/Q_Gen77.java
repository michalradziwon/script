
  package gen;
  public class Q_Gen77 {
  		@com.google.inject.Inject
  		public Q_Gen77(Q_Gen78 q_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  