
  package gen;
  public class N_Gen194 {
  		@com.google.inject.Inject
  		public N_Gen194(N_Gen195 n_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  