
  package gen;
  public class N_Gen30 {
  		@com.google.inject.Inject
  		public N_Gen30(N_Gen31 n_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  