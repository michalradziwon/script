
  package gen;
  public class N_Gen95 {
  		@com.google.inject.Inject
  		public N_Gen95(N_Gen96 n_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  