
  package gen;
  public class N_Gen154 {
  		@com.google.inject.Inject
  		public N_Gen154(N_Gen155 n_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  