
  package gen;
  public class N_Gen20 {
  		@com.google.inject.Inject
  		public N_Gen20(N_Gen21 n_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  