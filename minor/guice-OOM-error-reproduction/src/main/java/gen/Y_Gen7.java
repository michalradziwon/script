
  package gen;
  public class Y_Gen7 {
  		@com.google.inject.Inject
  		public Y_Gen7(Y_Gen8 y_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  