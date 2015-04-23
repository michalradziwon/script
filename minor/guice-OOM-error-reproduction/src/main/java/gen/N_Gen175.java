
  package gen;
  public class N_Gen175 {
  		@com.google.inject.Inject
  		public N_Gen175(N_Gen176 n_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  