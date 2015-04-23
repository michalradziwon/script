
  package gen;
  public class W_Gen158 {
  		@com.google.inject.Inject
  		public W_Gen158(W_Gen159 w_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  