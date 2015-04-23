
  package gen;
  public class W_Gen44 {
  		@com.google.inject.Inject
  		public W_Gen44(W_Gen45 w_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  