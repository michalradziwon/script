
  package gen;
  public class N_Gen4 {
  		@com.google.inject.Inject
  		public N_Gen4(N_Gen5 n_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  