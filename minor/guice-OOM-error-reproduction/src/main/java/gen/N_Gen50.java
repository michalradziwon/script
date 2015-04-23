
  package gen;
  public class N_Gen50 {
  		@com.google.inject.Inject
  		public N_Gen50(N_Gen51 n_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  