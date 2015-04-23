
  package gen;
  public class Y_Gen133 {
  		@com.google.inject.Inject
  		public Y_Gen133(Y_Gen134 y_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  