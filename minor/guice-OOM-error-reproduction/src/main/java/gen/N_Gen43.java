
  package gen;
  public class N_Gen43 {
  		@com.google.inject.Inject
  		public N_Gen43(N_Gen44 n_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  