
  package gen;
  public class Y_Gen114 {
  		@com.google.inject.Inject
  		public Y_Gen114(Y_Gen115 y_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  