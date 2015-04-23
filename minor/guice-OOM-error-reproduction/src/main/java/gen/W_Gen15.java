
  package gen;
  public class W_Gen15 {
  		@com.google.inject.Inject
  		public W_Gen15(W_Gen16 w_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  