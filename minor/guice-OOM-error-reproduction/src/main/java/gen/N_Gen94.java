
  package gen;
  public class N_Gen94 {
  		@com.google.inject.Inject
  		public N_Gen94(N_Gen95 n_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  