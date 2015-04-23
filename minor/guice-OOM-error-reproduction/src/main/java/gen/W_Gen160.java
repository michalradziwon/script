
  package gen;
  public class W_Gen160 {
  		@com.google.inject.Inject
  		public W_Gen160(W_Gen161 w_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  