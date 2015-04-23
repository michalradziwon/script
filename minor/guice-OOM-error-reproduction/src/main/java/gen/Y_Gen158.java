
  package gen;
  public class Y_Gen158 {
  		@com.google.inject.Inject
  		public Y_Gen158(Y_Gen159 y_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  