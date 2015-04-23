
  package gen;
  public class W_Gen113 {
  		@com.google.inject.Inject
  		public W_Gen113(W_Gen114 w_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  