
  package gen;
  public class Y_Gen192 {
  		@com.google.inject.Inject
  		public Y_Gen192(Y_Gen193 y_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  