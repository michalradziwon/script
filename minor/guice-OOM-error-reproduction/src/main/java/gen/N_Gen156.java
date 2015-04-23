
  package gen;
  public class N_Gen156 {
  		@com.google.inject.Inject
  		public N_Gen156(N_Gen157 n_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  