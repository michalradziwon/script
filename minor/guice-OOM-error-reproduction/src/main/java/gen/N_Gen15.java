
  package gen;
  public class N_Gen15 {
  		@com.google.inject.Inject
  		public N_Gen15(N_Gen16 n_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  