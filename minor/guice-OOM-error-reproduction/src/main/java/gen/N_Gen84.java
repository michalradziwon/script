
  package gen;
  public class N_Gen84 {
  		@com.google.inject.Inject
  		public N_Gen84(N_Gen85 n_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  