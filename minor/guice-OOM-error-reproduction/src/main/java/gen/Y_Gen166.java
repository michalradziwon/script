
  package gen;
  public class Y_Gen166 {
  		@com.google.inject.Inject
  		public Y_Gen166(Y_Gen167 y_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  