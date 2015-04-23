
  package gen;
  public class W_Gen93 {
  		@com.google.inject.Inject
  		public W_Gen93(W_Gen94 w_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  