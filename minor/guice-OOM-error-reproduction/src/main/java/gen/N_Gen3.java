
  package gen;
  public class N_Gen3 {
  		@com.google.inject.Inject
  		public N_Gen3(N_Gen4 n_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  