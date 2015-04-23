
  package gen;
  public class N_Gen21 {
  		@com.google.inject.Inject
  		public N_Gen21(N_Gen22 n_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  