
  package gen;
  public class N_Gen66 {
  		@com.google.inject.Inject
  		public N_Gen66(N_Gen67 n_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  