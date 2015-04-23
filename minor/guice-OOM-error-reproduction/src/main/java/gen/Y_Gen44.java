
  package gen;
  public class Y_Gen44 {
  		@com.google.inject.Inject
  		public Y_Gen44(Y_Gen45 y_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  