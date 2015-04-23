
  package gen;
  public class N_Gen55 {
  		@com.google.inject.Inject
  		public N_Gen55(N_Gen56 n_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  