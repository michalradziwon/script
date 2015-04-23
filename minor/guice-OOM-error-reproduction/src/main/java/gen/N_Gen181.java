
  package gen;
  public class N_Gen181 {
  		@com.google.inject.Inject
  		public N_Gen181(N_Gen182 n_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  