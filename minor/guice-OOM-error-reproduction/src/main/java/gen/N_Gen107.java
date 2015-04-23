
  package gen;
  public class N_Gen107 {
  		@com.google.inject.Inject
  		public N_Gen107(N_Gen108 n_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  