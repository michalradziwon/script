
  package gen;
  public class N_Gen63 {
  		@com.google.inject.Inject
  		public N_Gen63(N_Gen64 n_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  