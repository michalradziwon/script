
  package gen;
  public class N_Gen150 {
  		@com.google.inject.Inject
  		public N_Gen150(N_Gen151 n_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  