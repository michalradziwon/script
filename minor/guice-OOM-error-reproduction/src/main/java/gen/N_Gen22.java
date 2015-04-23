
  package gen;
  public class N_Gen22 {
  		@com.google.inject.Inject
  		public N_Gen22(N_Gen23 n_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  