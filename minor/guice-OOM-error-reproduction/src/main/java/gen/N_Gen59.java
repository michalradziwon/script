
  package gen;
  public class N_Gen59 {
  		@com.google.inject.Inject
  		public N_Gen59(N_Gen60 n_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  