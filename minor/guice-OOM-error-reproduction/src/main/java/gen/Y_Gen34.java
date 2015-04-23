
  package gen;
  public class Y_Gen34 {
  		@com.google.inject.Inject
  		public Y_Gen34(Y_Gen35 y_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  