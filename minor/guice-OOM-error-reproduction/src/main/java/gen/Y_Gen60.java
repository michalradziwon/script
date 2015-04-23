
  package gen;
  public class Y_Gen60 {
  		@com.google.inject.Inject
  		public Y_Gen60(Y_Gen61 y_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  