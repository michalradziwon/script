
  package gen;
  public class Y_Gen169 {
  		@com.google.inject.Inject
  		public Y_Gen169(Y_Gen170 y_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  