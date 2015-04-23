
  package gen;
  public class Y_Gen124 {
  		@com.google.inject.Inject
  		public Y_Gen124(Y_Gen125 y_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  