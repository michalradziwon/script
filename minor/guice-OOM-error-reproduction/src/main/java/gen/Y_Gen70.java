
  package gen;
  public class Y_Gen70 {
  		@com.google.inject.Inject
  		public Y_Gen70(Y_Gen71 y_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  