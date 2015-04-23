
  package gen;
  public class W_Gen178 {
  		@com.google.inject.Inject
  		public W_Gen178(W_Gen179 w_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  