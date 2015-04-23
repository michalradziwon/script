
  package gen;
  public class Y_Gen112 {
  		@com.google.inject.Inject
  		public Y_Gen112(Y_Gen113 y_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  