
  package gen;
  public class Y_Gen73 {
  		@com.google.inject.Inject
  		public Y_Gen73(Y_Gen74 y_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  