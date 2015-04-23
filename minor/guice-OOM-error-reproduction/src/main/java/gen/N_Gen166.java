
  package gen;
  public class N_Gen166 {
  		@com.google.inject.Inject
  		public N_Gen166(N_Gen167 n_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  