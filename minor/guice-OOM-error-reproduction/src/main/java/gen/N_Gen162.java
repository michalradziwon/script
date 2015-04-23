
  package gen;
  public class N_Gen162 {
  		@com.google.inject.Inject
  		public N_Gen162(N_Gen163 n_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  