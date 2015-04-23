
  package gen;
  public class N_Gen44 {
  		@com.google.inject.Inject
  		public N_Gen44(N_Gen45 n_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  