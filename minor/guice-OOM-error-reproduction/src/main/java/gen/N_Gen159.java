
  package gen;
  public class N_Gen159 {
  		@com.google.inject.Inject
  		public N_Gen159(N_Gen160 n_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  