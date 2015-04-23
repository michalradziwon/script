
  package gen;
  public class N_Gen70 {
  		@com.google.inject.Inject
  		public N_Gen70(N_Gen71 n_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  