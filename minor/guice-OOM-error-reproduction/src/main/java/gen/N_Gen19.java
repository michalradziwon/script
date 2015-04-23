
  package gen;
  public class N_Gen19 {
  		@com.google.inject.Inject
  		public N_Gen19(N_Gen20 n_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  