
  package gen;
  public class N_Gen18 {
  		@com.google.inject.Inject
  		public N_Gen18(N_Gen19 n_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  