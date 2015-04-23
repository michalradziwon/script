
  package gen;
  public class N_Gen117 {
  		@com.google.inject.Inject
  		public N_Gen117(N_Gen118 n_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  