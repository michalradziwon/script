
  package gen;
  public class N_Gen129 {
  		@com.google.inject.Inject
  		public N_Gen129(N_Gen130 n_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  