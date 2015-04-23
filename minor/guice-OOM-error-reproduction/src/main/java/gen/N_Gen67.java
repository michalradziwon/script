
  package gen;
  public class N_Gen67 {
  		@com.google.inject.Inject
  		public N_Gen67(N_Gen68 n_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  