
  package gen;
  public class Y_Gen35 {
  		@com.google.inject.Inject
  		public Y_Gen35(Y_Gen36 y_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  