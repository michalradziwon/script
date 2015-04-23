
  package gen;
  public class N_Gen102 {
  		@com.google.inject.Inject
  		public N_Gen102(N_Gen103 n_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  