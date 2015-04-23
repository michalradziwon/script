
  package gen;
  public class N_Gen11 {
  		@com.google.inject.Inject
  		public N_Gen11(N_Gen12 n_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  