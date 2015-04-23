
  package gen;
  public class Y_Gen26 {
  		@com.google.inject.Inject
  		public Y_Gen26(Y_Gen27 y_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  