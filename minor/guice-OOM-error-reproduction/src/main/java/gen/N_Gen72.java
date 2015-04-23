
  package gen;
  public class N_Gen72 {
  		@com.google.inject.Inject
  		public N_Gen72(N_Gen73 n_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  