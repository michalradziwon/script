
  package gen;
  public class Q_Gen119 {
  		@com.google.inject.Inject
  		public Q_Gen119(Q_Gen120 q_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  