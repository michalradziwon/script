
  package gen;
  public class N_Gen49 {
  		@com.google.inject.Inject
  		public N_Gen49(N_Gen50 n_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  