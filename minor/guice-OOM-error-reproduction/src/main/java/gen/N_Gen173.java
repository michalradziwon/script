
  package gen;
  public class N_Gen173 {
  		@com.google.inject.Inject
  		public N_Gen173(N_Gen174 n_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  