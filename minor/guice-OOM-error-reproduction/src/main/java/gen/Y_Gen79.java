
  package gen;
  public class Y_Gen79 {
  		@com.google.inject.Inject
  		public Y_Gen79(Y_Gen80 y_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  