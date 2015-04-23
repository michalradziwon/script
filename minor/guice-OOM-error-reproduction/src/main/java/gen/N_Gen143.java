
  package gen;
  public class N_Gen143 {
  		@com.google.inject.Inject
  		public N_Gen143(N_Gen144 n_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  