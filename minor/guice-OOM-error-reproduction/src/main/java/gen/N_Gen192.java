
  package gen;
  public class N_Gen192 {
  		@com.google.inject.Inject
  		public N_Gen192(N_Gen193 n_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  