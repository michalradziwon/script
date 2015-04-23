
  package gen;
  public class Y_Gen111 {
  		@com.google.inject.Inject
  		public Y_Gen111(Y_Gen112 y_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  