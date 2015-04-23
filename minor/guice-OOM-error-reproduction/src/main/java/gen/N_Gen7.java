
  package gen;
  public class N_Gen7 {
  		@com.google.inject.Inject
  		public N_Gen7(N_Gen8 n_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  