
  package gen;
  public class N_Gen14 {
  		@com.google.inject.Inject
  		public N_Gen14(N_Gen15 n_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  