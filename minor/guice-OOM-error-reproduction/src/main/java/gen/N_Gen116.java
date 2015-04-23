
  package gen;
  public class N_Gen116 {
  		@com.google.inject.Inject
  		public N_Gen116(N_Gen117 n_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  