
  package gen;
  public class Q_Gen78 {
  		@com.google.inject.Inject
  		public Q_Gen78(Q_Gen79 q_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  