
  package gen;
  public class N_Gen105 {
  		@com.google.inject.Inject
  		public N_Gen105(N_Gen106 n_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  